package com.gitee.sop.sdk.ocr;

import com.gitee.sop.sdk.client.OpenClient;
import com.gitee.sop.sdk.common.RequestMethod;
import com.gitee.sop.sdk.common.ResponseBean;
import com.gitee.sop.sdk.ocr.request.*;
import com.gitee.sop.sdk.ocr.response.*;
import com.gitee.sop.sdk.request.CommonRequest;
import com.google.common.collect.Maps;

import java.util.Map;


public class OCRApi {
    //测试环境
//    String url = "https://api.kezhitech.com/test/router";
    //正式环境
    String url = "https://api.kezhitech.com/router";

    String appId ;
    /** 开发者私钥 */
    String secret ;

    OpenClient client;

    public OCRApi (String appId, String secret){
        this.appId = appId;
        this.secret = secret;
        client = new OpenClient(url, appId, secret);
    }

    public static OCRApi buildOCRApi(String appId, String secret){
        return  new OCRApi(appId,secret);
    }


    /**
     * 单题识别
     * @param ocrRequestDTO
     * @return
     */
    public ResponseBean<GeneralResponseDTO> ocrGeneral(OcrRequestDTO ocrRequestDTO) {
         //创建请求对象
        CommonRequest<GeneralResponseDTO> request = new CommonRequest("ocrService.ocr.general");
        request.setBizModel(ocrRequestDTO);
        // 发送请求
        ResponseBean<GeneralResponseDTO> baseResponse = client.execute(request);
        return baseResponse;

    }

    /**
     * 单题识别结果查询
     * @param ocrQueryDTO
     * @return
     */
    public ResponseBean<OCRResultResponseDTO> queryOcrResult(OcrQueryDTO ocrQueryDTO){
        //创建请求对象
        CommonRequest<OCRResultResponseDTO> request = new CommonRequest(RequestMethod.GET,"ocrService.ocr.query");
        request.setBizModel(ocrQueryDTO);
        // 发送请求
        ResponseBean<OCRResultResponseDTO> baseResponse = client.execute(request);

        return baseResponse;
    }

    /**
     * 题目配图提取
     * @param segmentationRequestDTO
     * @return
     */
    ResponseBean<GeneralResponseDTO> segmentationGeneral(SegmentationRequestDTO segmentationRequestDTO) {
        //创建请求对象
        CommonRequest<GeneralResponseDTO> request = new CommonRequest("ocrService.segmentation.general");
        request.setBizModel(segmentationRequestDTO);
        // 发送请求
        ResponseBean<GeneralResponseDTO> baseResponse = client.execute(request);

        return baseResponse;
    }

    /**
     * 题目配图提取结果查询
     * @param segmentationQueryDTO
     * @return
     */
    ResponseBean<SegmentationResultResponseDTO> querySegmentationResult(SegmentationQueryDTO segmentationQueryDTO) {
        //创建请求对象
        CommonRequest<SegmentationResultResponseDTO> request = new CommonRequest(RequestMethod.GET,"ocrService.segmentation.query");
        request.setBizModel(segmentationQueryDTO);
        // 发送请求
        ResponseBean<SegmentationResultResponseDTO> baseResponse = client.execute(request);

        return baseResponse;
    }

    /**
     * 整图识别
     * @param groupRequestDTO
     * @return
     */
    ResponseBean<GeneralResponseDTO> groupGeneral(GroupRequestDTO groupRequestDTO) {
        //创建请求对象
        CommonRequest<GeneralResponseDTO> request = new CommonRequest("ocrService.group.general");
        request.setBizModel(groupRequestDTO);
        // 发送请求
        ResponseBean<GeneralResponseDTO> baseResponse = client.execute(request);

        return baseResponse;
    }

    /**
     * 整图识别结果查询
     * @param groupQueryDTO
     * @return
     */
    ResponseBean<GroupResultResponseDTO> queryGroupResult(GroupQueryDTO groupQueryDTO) {
        //创建请求对象
        CommonRequest<GroupResultResponseDTO> request = new CommonRequest(RequestMethod.GET,"ocrService.group.query");
        request.setBizModel(groupQueryDTO);
        // 发送请求
        ResponseBean<GroupResultResponseDTO> baseResponse = client.execute(request);

        return baseResponse;
    }

}
