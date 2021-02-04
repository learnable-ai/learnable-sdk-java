package com.gitee.sop.sdk.ocr.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gitee.sop.sdk.ocr.common.ImageDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class GroupQueryDTO {
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    //识别的图片参数
    private String imageId;
}
