package com.learnable.sop.sdk.grading.request;


/**
 * @Date 2020/8/19 12:11
 */

public class QuestionAnswerLocationDTO {

    private Integer orderIdx;

    private Integer answerPageIdx;

    private String x_start;

    private String y_start;

    private String x_end;

    public Integer getOrderIdx() {
        return orderIdx;
    }

    public void setOrderIdx(Integer orderIdx) {
        this.orderIdx = orderIdx;
    }

    public Integer getAnswerPageIdx() {
        return answerPageIdx;
    }

    public void setAnswerPageIdx(Integer answerPageIdx) {
        this.answerPageIdx = answerPageIdx;
    }

    public String getX_start() {
        return x_start;
    }

    public void setX_start(String x_start) {
        this.x_start = x_start;
    }

    public String getY_start() {
        return y_start;
    }

    public void setY_start(String y_start) {
        this.y_start = y_start;
    }

    public String getX_end() {
        return x_end;
    }

    public void setX_end(String x_end) {
        this.x_end = x_end;
    }

    public String getY_end() {
        return y_end;
    }

    public void setY_end(String y_end) {
        this.y_end = y_end;
    }

    private String y_end;
}
