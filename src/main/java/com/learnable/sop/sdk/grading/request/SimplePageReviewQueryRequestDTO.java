package com.learnable.sop.sdk.grading.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimplePageReviewQueryRequestDTO {
    Long pageReviewId;

    public Long getPageReviewId() {
        return pageReviewId;
    }

    public void setPageReviewId(Long pageReviewId) {
        this.pageReviewId = pageReviewId;
    }
}
