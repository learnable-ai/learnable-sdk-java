package com.learnable.sop.sdk.grading.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimplePageReviewRequestDTO {
    String bookUniqueId;
    String imageUrl;
    String image;
    String callbackUrl;
}
