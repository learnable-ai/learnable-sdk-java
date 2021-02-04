package com.gitee.sop.sdk.ocr.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gitee.sop.sdk.ocr.common.Segment;
import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SegmentationResultResponseDTO {
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

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    //请求的标识id
    private String imageId;
    //0: 成功  1: 失败  2: 处理中
    private Integer status;
    //每个切图块的信息
    private List<Segment> segments = Lists.newArrayList();
}
