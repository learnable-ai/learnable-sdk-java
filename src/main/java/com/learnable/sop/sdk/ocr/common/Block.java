package com.learnable.sop.sdk.ocr.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class Block {
    public BoundingBoxDTO getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundingBoxDTO boundingBox) {
        this.boundingBox = boundingBox;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    //标记范围坐标区间
    BoundingBoxDTO boundingBox;
    //每个识别块的信息
    List<Segment> segments = Lists.newArrayList();
}
