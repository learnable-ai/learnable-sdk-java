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

    /**
     * @see com.learnable.review.enums.ReviewStatusEnum
     */
    private Integer status;

    /**
     * 异常情况(整页)
     */
    private Integer exceptionCode;

    /**
     * 批阅结果
     */
    List<SimpleQuestionReviewResultDTO> result;
}
