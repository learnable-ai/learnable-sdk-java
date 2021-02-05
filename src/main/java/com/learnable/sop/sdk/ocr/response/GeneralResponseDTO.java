package com.learnable.sop.sdk.ocr.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralResponseDTO {


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    //识别的http状态码
    private Integer code;
    //请求的标识id
    private String imageId;

    //图片检查状态 0: 成功  1: 失败  2: 处理中，异步接口不返回状态
    private Integer status;

    private Error error;

}
