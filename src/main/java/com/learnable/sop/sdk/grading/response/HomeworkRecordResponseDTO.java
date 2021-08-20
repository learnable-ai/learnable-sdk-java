package com.learnable.sop.sdk.grading.response;

public class HomeworkRecordResponseDTO {
    /**
     * 作业id
     */
    private Integer taskId;
    /**
     * 班级名称
     */
    private String className;
    /**
     * 学科
     */
    private Integer subject;

    /**
     * 创建时间
     */
    private String createTime;
    /**
     *作业状态：1：未开始批阅2：批阅中3：批阅完成
     */
    private Integer status;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
}
