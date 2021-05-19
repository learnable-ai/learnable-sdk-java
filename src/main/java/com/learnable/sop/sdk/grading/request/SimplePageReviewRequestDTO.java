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

    public String getBookUniqueId() {
        return bookUniqueId;
    }

    public void setBookUniqueId(String bookUniqueId) {
        this.bookUniqueId = bookUniqueId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }
}
