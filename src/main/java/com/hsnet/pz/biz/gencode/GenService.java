package com.hsnet.pz.biz.gencode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 生成服务
 * @author: chenrr 
 * @since: 2014年12月5日 下午1:01:43 
 * @history:
 */
public class GenService {
    private static List<File> res = new ArrayList<File>();

    private static final String STDFIELD_FILE = "D:\\workspace_ares\\pz_database2.0\\metadata\\stdfield.stdfield";

    private static final String SERVICE_DIR = "D:\\workspace_ares\\pz_database2.0\\biz";

    public static void main(String[] args) throws Exception {
        readfile(SERVICE_DIR);
        genTestSub();
        genJavaFile();
    }

    private static void genJavaFile() {

    }

    /**
     * 生成HsAdmin测试用例文件
     * @param f
     * @throws Exception 
     * @create: 2014年12月13日 上午8:38:30 chenrr
     * @history:
     */
    @SuppressWarnings("unchecked")
    public static void genTestSub() throws Exception {
        OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(
            "std-biz-service-test.xml"), "GBK");
        BufferedWriter fr = new BufferedWriter(write);
        SAXReader saxReader = new SAXReader();
        fr.write("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        fr.write("<TEST_PACK note=\"网上配资接口单元测试用例\">");
        fr.write("<Test>");
        for (File f : res) {
            Document doc = saxReader.read(f);
            Element root = doc.getRootElement();
            String funcId = root.attributeValue("objectId");
            String chineseName = root.attributeValue("chineseName");
            String model = "";
            if (funcId.startsWith("8300")) {
                model = "会员";
            } else if (funcId.startsWith("8301")) {
                model = "账户";
            } else if (funcId.startsWith("8302")) {
                model = "配资";
            } else if (funcId.startsWith("8303")) {
                model = "HOMS";
            } else if (funcId.startsWith("8304")) {
                model = "支付";
            } else if (funcId.startsWith("8305")) {
                model = "P2P";
            } else if (funcId.startsWith("8309")) {
                model = "基础";
            }
            if (funcId.startsWith("8310")) {
                model = "会员管理";
            } else if (funcId.startsWith("8311")) {
                model = "账户管理";
            } else if (funcId.startsWith("8312")) {
                model = "配资管理";
            } else if (funcId.startsWith("8313")) {
                model = "HOMS管理";
            } else if (funcId.startsWith("8314")) {
                model = "支付管理";
            } else if (funcId.startsWith("8315")) {
                model = "P2P管理";
            } else if (funcId.startsWith("8319")) {
                model = "基础管理";
            }
            Element inter = root.element("interface");
            List<Element> list = inter.elements("inputParameters");
            fr.write("<sub id=\""
                    + funcId
                    + "\" block=\"1\" livetime=\"5000\" pri=\"8\" pack_ver=\"32\" note=\""
                    + model + "  " + chineseName + "\" msg_cntr=\"0\">");
            fr.write("<route esb_name=\"\" esb_no=\"\" neighbor=\"\" plugin=\"\" system=\"\" sub_system=\"\" branch=\"\"/>");
            fr.write("<inparams>");
            if (list != null) {
                for (Element param : list) {
                    fr.write("    <in name=\"" + param.attributeValue("id")
                            + "\" value=\"\"/>");
                }
            }
            fr.write("</inparams>");
            fr.write("</sub>");
        }
        fr.write("</Test>");
        fr.write("<AutoTest note=\"压力测试\" multi=\"1\">");
        fr.write("</AutoTest>");
        fr.write("</TEST_PACK>");
        fr.close();
    }

    /**
     * 查询所有业务接口
     * @param filepath
     * @return
     * @throws Exception 
     * @create: 2014年12月13日 上午8:37:52 chenrr
     * @history:
     */
    public static List<File> readfile(String filepath) throws Exception {
        File file = new File(filepath);
        if (!file.isDirectory()) {
        } else if (file.isDirectory()) {
            String[] filelist = file.list();
            for (int i = 0; i < filelist.length; i++) {
                File readfile = new File(filepath + "\\" + filelist[i]);
                if (!readfile.isDirectory()
                        && readfile.getName().endsWith(".service")) {
                    res.add(readfile);
                } else if (readfile.isDirectory()) {
                    readfile(filepath + "\\" + filelist[i]);
                }
            }
        }
        return res;
    }

    /**
     * 获取标准字段（JAVA类型）
     * @return
     * @throws Exception 
     * @create: 2014年12月13日 上午8:36:40 chenrr
     * @history:
     */
    @SuppressWarnings("unchecked")
    public static Map<String, String> getStdField() throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        SAXReader saxReader = new SAXReader();
        Document doc = saxReader.read(new File(STDFIELD_FILE));
        Element root = doc.getRootElement();
        List<Element> list = root.elements("items");
        for (Element iter : list) {
            String name = iter.attributeValue("name");
            String dataType = iter.attributeValue("dataType");
            if (dataType.toUpperCase().startsWith("HSAMOUNT_0")) {
                dataType = "long";
            } else if (dataType.toUpperCase().startsWith("HsNum")
                    || dataType.toUpperCase().startsWith("HSQUANTITY")) {
                dataType = "int";
            } else if (dataType.toUpperCase().startsWith("HSCHAR")) {
                dataType = "double";
            } else {
                dataType = "String";
            }
            map.put(name, dataType);
        }
        return map;
    }
}
