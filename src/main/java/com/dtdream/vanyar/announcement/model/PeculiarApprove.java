package com.dtdream.vanyar.announcement.model;

import java.util.Date;

public class PeculiarApprove {
    /**
     * 主键
     */
    private Long id;

    /**
     * 审批类型
     */
    private Long accessType;

    /**
     * 申请事项
     */
    private String accessDesc;

    /**
     * 申请人id
     */
    private Long applyUserId;

    /**
     * 申请方单位id
     */
    private Long applyOrgId;

    /**
     * 申请方单位名称
     */
    private String applyOrdName;

    /**
     * 回复人
     */
    private Long replyUserId;

    /**
     * 回复人单位
     */
    private String replyOrgName;

    /**
     * 特殊审批流程状态
     */
    private Long state;

    /**
     * 审批前的状态
     */
    private Long sourceState;

    /**
     * 审批后的状态
     */
    private Long targetState;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 区划code
     */
    private String districtCode;

    /**
     * 
     */
    private Long userCreated;

    /**
     * 创建人名称
     */
    private String userCreatedName;

    /**
     * 创建日期
     */
    private Date gmtCreated;

    /**
     * 
     */
    private Long userModified;

    /**
     * 修改人名称
     */
    private String userModifiedName;

    /**
     * 修改日期
     */
    private Date gmtModified;

    /**
     * 关联的业务id
     */
    private String businessId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccessType() {
        return accessType;
    }

    public void setAccessType(Long accessType) {
        this.accessType = accessType;
    }

    public String getAccessDesc() {
        return accessDesc;
    }

    public void setAccessDesc(String accessDesc) {
        this.accessDesc = accessDesc;
    }

    public Long getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Long applyUserId) {
        this.applyUserId = applyUserId;
    }

    public Long getApplyOrgId() {
        return applyOrgId;
    }

    public void setApplyOrgId(Long applyOrgId) {
        this.applyOrgId = applyOrgId;
    }

    public String getApplyOrdName() {
        return applyOrdName;
    }

    public void setApplyOrdName(String applyOrdName) {
        this.applyOrdName = applyOrdName;
    }

    public Long getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Long replyUserId) {
        this.replyUserId = replyUserId;
    }

    public String getReplyOrgName() {
        return replyOrgName;
    }

    public void setReplyOrgName(String replyOrgName) {
        this.replyOrgName = replyOrgName;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Long getSourceState() {
        return sourceState;
    }

    public void setSourceState(Long sourceState) {
        this.sourceState = sourceState;
    }

    public Long getTargetState() {
        return targetState;
    }

    public void setTargetState(Long targetState) {
        this.targetState = targetState;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public Long getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Long userCreated) {
        this.userCreated = userCreated;
    }

    public String getUserCreatedName() {
        return userCreatedName;
    }

    public void setUserCreatedName(String userCreatedName) {
        this.userCreatedName = userCreatedName;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Long getUserModified() {
        return userModified;
    }

    public void setUserModified(Long userModified) {
        this.userModified = userModified;
    }

    public String getUserModifiedName() {
        return userModifiedName;
    }

    public void setUserModifiedName(String userModifiedName) {
        this.userModifiedName = userModifiedName;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}