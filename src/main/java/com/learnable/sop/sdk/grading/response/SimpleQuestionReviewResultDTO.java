package com.learnable.sop.sdk.grading.response;

import com.learnable.sop.sdk.ocr.common.BoundingBoxDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleQuestionReviewResultDTO implements Serializable {

    /**
     * 题目切割坐标区域
     */
    private BoundingBoxDTO boundingBoxDTO;

    /**
     * 题号
     */
    private String questionNo;

    /**
     * @see com.learnable.review.enums.AnswerValidityEnum
     */
    private Integer answerValidity;

    /**
     * 异常情况(单题)
     */
    private Integer exceptionCode;

    public BoundingBoxDTO getBoundingBoxDTO() {
        return boundingBoxDTO;
    }

    public void setBoundingBoxDTO(BoundingBoxDTO boundingBoxDTO) {
        this.boundingBoxDTO = boundingBoxDTO;
    }

    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    public Integer getAnswerValidity() {
        return answerValidity;
    }

    public void setAnswerValidity(Integer answerValidity) {
        this.answerValidity = answerValidity;
    }

    public Integer getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(Integer exceptionCode) {
        this.exceptionCode = exceptionCode;
    }
}
