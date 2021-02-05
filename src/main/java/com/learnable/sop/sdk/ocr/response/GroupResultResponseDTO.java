package com.learnable.sop.sdk.ocr.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.learnable.sop.sdk.ocr.common.Block;
import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupResultResponseDTO {
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

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    //请求的标识id
    private String imageId;
    // 0: 成功  1: 失败  2: 处理中
    private Integer status;
    //block为每个题目
    private List<Block> blocks = Lists.newArrayList();
}
