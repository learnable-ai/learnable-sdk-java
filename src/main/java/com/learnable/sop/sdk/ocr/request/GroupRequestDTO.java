package com.learnable.sop.sdk.ocr.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.learnable.sop.sdk.ocr.common.ImageDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class GroupRequestDTO {
    public ImageDTO getImage() {
        return image;
    }

    public void setImage(ImageDTO image) {
        this.image = image;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    //识别的图片参数
    private ImageDTO image;
    //识别结果的回调地址
    private String callbackUrl;
    //练习册id
    private String exerciseBookId;


}
