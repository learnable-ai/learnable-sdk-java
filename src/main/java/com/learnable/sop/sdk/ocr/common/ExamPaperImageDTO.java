package com.learnable.sop.sdk.ocr.common;

import lombok.Data;

@Data
public class ExamPaperImageDTO {
    Integer type;
    BoundingBoxDTO boundingBox;
}
