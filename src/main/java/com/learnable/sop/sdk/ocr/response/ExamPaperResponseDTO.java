package com.learnable.sop.sdk.ocr.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.collect.Lists;
import com.learnable.sop.sdk.ocr.common.ExamPaperImageDTO;
import com.learnable.sop.sdk.ocr.common.ExamPaperSegmentDTO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExamPaperResponseDTO implements Serializable {
    private List<ExamPaperSegmentDTO> segments = Lists.newArrayList();
    private List<ExamPaperImageDTO> images = Lists.newArrayList();
}
