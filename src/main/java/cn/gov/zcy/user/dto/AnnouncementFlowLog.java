package cn.gov.zcy.user.dto;

import java.util.Date;

public class AnnouncementFlowLog {
    /**
     * 
     */
    private Long id;

    /**
     * 所属公告id
     */
    private Long announcementId;

    /**
     * 用户id
     */
    private Long operatorId;

    /**
     * 用户名称
     */
    private String operatorName;

    /**
     * 操作行为
     */
    private String announcementOption;

    /**
     * 操作时间
     */
    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getAnnouncementOption() {
        return announcementOption;
    }

    public void setAnnouncementOption(String announcementOption) {
        this.announcementOption = announcementOption;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}