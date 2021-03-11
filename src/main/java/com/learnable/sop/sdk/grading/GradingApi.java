package com.learnable.sop.sdk.grading;

import com.learnable.sop.sdk.client.OpenClient;
import com.learnable.sop.sdk.common.ResponseBean;
import com.learnable.sop.sdk.grading.request.AnswerPageRequestDTO;
import com.learnable.sop.sdk.grading.request.GradingAnswerPageQueryDTO;
import com.learnable.sop.sdk.grading.response.GradingAnswerPageResponseDTO;
import com.learnable.sop.sdk.ocr.response.GeneralResponseDTO;
import com.learnable.sop.sdk.request.CommonRequest;


public class GradingApi {
    String url = "https://api.kezhitech.com/router";

    String appId ;
    /** 开发者私钥 */
    String secret ;

    OpenClient client;

    public GradingApi(String appId, String secret){
        this.appId = appId;
        this.secret = secret;
        client = new OpenClient(url, appId, secret);
    }

    public static GradingApi buildGradingApi(String appId, String secret){
        return  new GradingApi(appId,secret);
    }


    /**
     * 提交答题卡阅卷
     * @param answerPageRequestDTO
     * @return
     */
    public ResponseBean<GeneralResponseDTO> gradingAnswerPage(AnswerPageRequestDTO answerPageRequestDTO) {
        //创建请求对象
        CommonRequest<GeneralResponseDTO> request = new CommonRequest("grading.simple");
        request.setBizModel(answerPageRequestDTO);
        // 发送请求
        ResponseBean<GeneralResponseDTO> baseResponse = client.execute(request);
        return baseResponse;
    }

    /**
     * 提交答题卡阅卷结果查询
     * @param gradingAnswerPageQueryDTO
     * @return
     */
    public ResponseBean<GradingAnswerPageResponseDTO> gradingAnswerPageQuery(GradingAnswerPageQueryDTO gradingAnswerPageQueryDTO){
        //创建请求对象
        CommonRequest<GradingAnswerPageResponseDTO> request = new CommonRequest("grading.simple.queryGradingResult");
        request.setBizModel(gradingAnswerPageQueryDTO);
        // 发送请求
        ResponseBean<GradingAnswerPageResponseDTO> baseResponse = client.execute(request);

        return baseResponse;
    }


}
