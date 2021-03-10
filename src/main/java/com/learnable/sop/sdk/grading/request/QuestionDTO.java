package com.learnable.sop.sdk.grading.request;

import java.util.List;

/**
 * @Date 2020/8/19 12:09
 */

public class QuestionDTO {

    private String questionId;

    /**
     * 题型 1：非选择题 2: 选择题
     */
    private Integer questionType;

    public List<QuestionSolutionDTO> getQuestionSolutionList() {
        return questionSolutionList;
    }

    public void setQuestionSolutionList(List<QuestionSolutionDTO> questionSolutionList) {
        this.questionSolutionList = questionSolutionList;
    }

    private List<QuestionSolutionDTO> questionSolutionList;

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public List<QuestionAnswerLocationDTO> getAnswerLocation() {
        return answerLocation;
    }

    public void setAnswerLocation(List<QuestionAnswerLocationDTO> answerLocation) {
        this.answerLocation = answerLocation;
    }

    private List<QuestionAnswerLocationDTO> answerLocation;
}
