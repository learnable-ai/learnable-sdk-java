package com.gitee.sop.sdk.ocr.response;

import lombok.Data;

@Data
public class Error {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;

}
