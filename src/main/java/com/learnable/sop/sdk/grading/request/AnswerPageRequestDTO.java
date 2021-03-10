package com.learnable.sop.sdk.grading.request;

import java.util.List;

/**
 * @Date 2020/8/19 11:52
 */

public class AnswerPageRequestDTO {

    //学生编号
    private String studentNo;

    //学生答题卡列表
    private List<AnswerPageDTO> answerPaperList;

    public QuestionDTO getQuestion() {
        return question;
    }

    public void setQuestion(QuestionDTO question) {
        this.question = question;
    }

    //题目信息
    private QuestionDTO question;

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public List<AnswerPageDTO> getAnswerPaperList() {
        return answerPaperList;
    }

    public void setAnswerPaperList(List<AnswerPageDTO> answerPaperList) {
        this.answerPaperList = answerPaperList;
    }


    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    //回调url
    private String callbackUrl;

}
