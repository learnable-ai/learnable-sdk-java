package com.learnable.sop.sdk.grading.response;

public class StudentStatusResponseDTO {
    /**
     * 学号
     */
    private String studentNumber;
    /**
     * 学生作业状态 1：未提交2：已提交3：判题中4：批阅完成
     */
    private Integer studentTaskStatus;
    /**
     * 失败原因
     */
    private Integer failReason;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Integer getStudentTaskStatus() {
        return studentTaskStatus;
    }

    public void setStudentTaskStatus(Integer studentTaskStatus) {
        this.studentTaskStatus = studentTaskStatus;
    }

    public Integer getFailReason() {
        return failReason;
    }

    public void setFailReason(Integer failReason) {
        this.failReason = failReason;
    }
}
