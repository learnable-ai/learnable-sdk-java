package com.learnable.sop.sdk.ocr.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class ImageDTO implements Serializable {

 public String getContent() {
  return content;
 }

 public void setContent(String content) {
  this.content = content;
 }

 public String getUrl() {
  return url;
 }

 public void setUrl(String url) {
  this.url = url;
 }

 public Integer getQuality() {
  return quality;
 }

 public void setQuality(Integer quality) {
  this.quality = quality;
 }

 //图片Base64信息，与url必选其一
    private String content;
    //图片url，与content必选其一
    private String url;

    //图片质量0: 扫描、截图 1: 手持拍摄
    private Integer quality = 0;


}
