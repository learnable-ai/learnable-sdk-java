package com.learnable.sop.sdk.ocr.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class Segment {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    public BoundingBoxDTO getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundingBoxDTO boundingBox) {
        this.boundingBox = boundingBox;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    //识别结果的类型，手写或打印体
    String type;
    //原始svg信息
    String svg;
    //标记范围坐标区间
    BoundingBoxDTO boundingBox;
    //识别结果，返回数组按照可能性大小排序
    List<String> content;
}
