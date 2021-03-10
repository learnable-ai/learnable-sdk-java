package com.learnable.sop.sdk.grading.response;

public class GradingAnswerPageResponseDTO {
    private String studentNo;

    private String questionId;

    private Integer gradingResult;

    private Integer gradingStatus;

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public Integer getGradingResult() {
        return gradingResult;
    }

    public void setGradingResult(Integer gradingResult) {
        this.gradingResult = gradingResult;
    }

    public Integer getGradingStatus() {
        return gradingStatus;
    }

    public void setGradingStatus(Integer gradingStatus) {
        this.gradingStatus = gradingStatus;
    }

    public Integer getGradingException() {
        return gradingException;
    }

    public void setGradingException(Integer gradingException) {
        this.gradingException = gradingException;
    }

    private Integer gradingException;
}
