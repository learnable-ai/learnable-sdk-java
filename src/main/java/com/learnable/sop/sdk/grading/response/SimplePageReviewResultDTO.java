package com.learnable.sop.sdk.grading.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimplePageReviewResultDTO implements Serializable {

    /**
     * 整页批阅记录id
     */
    private Long pageReviewId;

    private Integer status;

    /**
     * 异常情况(整页)
     */
    private Integer exceptionCode;

    /**
     * 批阅结果
     */
    List<SimpleQuestionReviewResultDTO> result;

    public Long getPageReviewId() {
        return pageReviewId;
    }

    public void setPageReviewId(Long pageReviewId) {
        this.pageReviewId = pageReviewId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(Integer exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public List<SimpleQuestionReviewResultDTO> getResult() {
        return result;
    }

    public void setResult(List<SimpleQuestionReviewResultDTO> result) {
        this.result = result;
    }
}
