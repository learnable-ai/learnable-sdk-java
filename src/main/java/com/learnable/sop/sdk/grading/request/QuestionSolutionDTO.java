package com.learnable.sop.sdk.grading.request;


/**
 * @Date 2020/8/19 12:10
 */
public class QuestionSolutionDTO {

    private Integer orderIdx;

    public Integer getOrderIdx() {
        return orderIdx;
    }

    public void setOrderIdx(Integer orderIdx) {
        this.orderIdx = orderIdx;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
}
