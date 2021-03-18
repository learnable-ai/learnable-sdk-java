package com.learnable.sop.sdk.ocr.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.learnable.sop.sdk.ocr.common.QuestionBlock;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class QuestionGroupResponse implements Serializable {
    List<QuestionBlock> blocks;

    public List<QuestionBlock> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<QuestionBlock> blocks) {
        this.blocks = blocks;
    }
}
