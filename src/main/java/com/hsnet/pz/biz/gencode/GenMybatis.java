package com.hsnet.pz.biz.gencode;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 生成MyBatis和DAO
 * @author: chenrr 
 * @since: 2014年12月5日 下午1:01:24 
 * @history:
 */
public class GenMybatis {

    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        final boolean overwrite = true;
        File configFile = new File("src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration configuration = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator mybatisGenerator = new MyBatisGenerator(configuration,
            callback, warnings);
        mybatisGenerator.generate(null);
        System.out.println(warnings.toString());
    }

}
