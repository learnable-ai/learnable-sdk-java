package com.learnable.sop.sdk.ocr.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.collect.Lists;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionBlock implements Serializable {
    List<String> content = Lists.newArrayList();
    String questionNo;
    BoundingBoxDTO boundingBox;
    List<IllustrationDto> illustrations = Lists.newArrayList();
    Integer level;
    Integer pageNo;
    List<QuestionBlock> children;

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    public BoundingBoxDTO getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundingBoxDTO boundingBox) {
        this.boundingBox = boundingBox;
    }

    public List<IllustrationDto> getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(List<IllustrationDto> illustrations) {
        this.illustrations = illustrations;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public List<QuestionBlock> getChildren() {
        return children;
    }

    public void setChildren(List<QuestionBlock> children) {
        this.children = children;
    }
}
