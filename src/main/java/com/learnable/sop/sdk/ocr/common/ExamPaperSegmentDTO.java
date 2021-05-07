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
public class ExamPaperSegmentDTO {

    //标记范围坐标区间
    BoundingBoxDTO boundingBox;
    //识别结果，返回数组按照可能性大小排序
    String content;
}
