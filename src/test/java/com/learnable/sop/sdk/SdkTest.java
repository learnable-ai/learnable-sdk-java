package com.learnable.sop.sdk;

import com.alibaba.fastjson.JSONObject;
import com.learnable.sop.sdk.ocr.OCRApi;
import com.learnable.sop.sdk.ocr.common.ImageDTO;
import com.learnable.sop.sdk.ocr.request.OcrQueryDTO;
import com.learnable.sop.sdk.ocr.request.OcrRequestDTO;
import com.learnable.sop.sdk.ocr.request.SegmentationQueryDTO;
import junit.framework.TestCase;
import org.junit.Test;

public class SdkTest extends TestCase {
    String appId = "kz20210205807258426731134976";

    String secret = "47409cc8597044f48e581ba55511d7ed";

    OCRApi ocrApi = OCRApi.buildOCRApi(appId,secret);
    @Test
    public void testocr() {
        OcrRequestDTO ocrRequestDTO = new OcrRequestDTO();
        ImageDTO imageDTO = new ImageDTO();
        imageDTO.setUrl("https://testbank-file01.oss-cn-shanghai.aliyuncs.com/images/20201014105903_13203161.jpg");
        ocrRequestDTO.setCallbackUrl("http://39.107.58.58:8080/admin/callback2");
        ocrRequestDTO.setImage(imageDTO);
        System.out.println(JSONObject.toJSONString(ocrApi.ocrGeneral(ocrRequestDTO)));
    }

    @Test
    public void testocrQuery() {
        OcrQueryDTO ocrQueryDTO = new OcrQueryDTO();
        ocrQueryDTO.setImageId("79f06c6b-bc7e-435b-991d-be34be274ce7");
        System.out.println(JSONObject.toJSONString(ocrApi.queryOcrResult(ocrQueryDTO)));
    }

    @Test
    public void testsegmentationQuery() {
        SegmentationQueryDTO segmentationQueryDTO = new SegmentationQueryDTO();
        segmentationQueryDTO.setImageId("10748a8a-d7b8-4b48-adba-95b6f7bf3621");
        System.out.println(JSONObject.toJSONString(ocrApi.querySegmentationResult(segmentationQueryDTO)));
    }
}
