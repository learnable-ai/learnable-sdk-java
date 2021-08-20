package com.learnable.sop.sdk.grading;

import com.learnable.sop.sdk.client.OpenClient;
import com.learnable.sop.sdk.common.RequestMethod;
import com.learnable.sop.sdk.common.ResponseBean;
import com.learnable.sop.sdk.grading.request.*;
import com.learnable.sop.sdk.grading.response.*;
import com.learnable.sop.sdk.ocr.response.GeneralResponseDTO;
import com.learnable.sop.sdk.request.CommonRequest;


public class GradingApi {
    String url = "https://api.kezhitech.com/router";   //prod
//    String url = "http://39.102.147.245:8081";   //dev

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

    public ResponseBean<SimplePageReviewResponseDTO> simplePageReview(SimplePageReviewRequestDTO simplePageReviewRequestDTO){
        //创建请求对象
        CommonRequest<GradingAnswerPageResponseDTO> request = new CommonRequest("reviewService.exerciseBook.page.review");
        request.setBizModel(simplePageReviewRequestDTO);
        // 发送请求
        ResponseBean<SimplePageReviewResponseDTO> baseResponse = client.execute(request);

        return baseResponse;
    }

    public ResponseBean<SimplePageReviewRequestDTO> simplePageReviewQuery(SimplePageReviewQueryRequestDTO simplePageReviewQueryRequestDTO){
        //创建请求对象
        CommonRequest<GradingAnswerPageResponseDTO> request = new CommonRequest(RequestMethod.GET,"reviewService.exerciseBook.page.review.query");
        request.setBizModel(simplePageReviewQueryRequestDTO);
        // 发送请求
        ResponseBean<SimplePageReviewRequestDTO> baseResponse = client.execute(request);

        return baseResponse;
    }

    /**
     * 提交作业批阅
     * @param homeworkSubmitRequestDTO
     * @return
     */
    public ResponseBean homeworkSubmit(HomeworkSubmitRequestDTO homeworkSubmitRequestDTO){
        CommonRequest request = new CommonRequest("grading.homework.batchSubmit");
        request.setBizModel(homeworkSubmitRequestDTO);
        // 发送请求
        ResponseBean baseResponse = client.execute(request);
        return baseResponse;
    }

    /**
     * 查询作业批改状态
     * @param homeworkStatusRequestDTO
     * @return
     */
    public ResponseBean<HomeworkResultResponseDTO> queryHomeworkResult(HomeworkStatusRequestDTO homeworkStatusRequestDTO){
        CommonRequest<HomeworkResultResponseDTO> request = new CommonRequest(RequestMethod.GET,"grading.homework.status");
        request.setBizModel(homeworkStatusRequestDTO);
        // 发送请求
        ResponseBean<HomeworkResultResponseDTO> baseResponse = client.execute(request);

        return baseResponse;
    }

    /**
     * 根据教师id查询作业列表
     * @param homeworkRecordQueryDTO
     * @return
     */
    public ResponseBean<PageInfo<HomeworkRecordResponseDTO>> queryHomewordRecord(HomeworkRecordQueryDTO homeworkRecordQueryDTO){
        CommonRequest<PageInfo<HomeworkRecordResponseDTO>> request = new CommonRequest(RequestMethod.GET,"grading.findHomeworkByTeacherId");
        request.setBizModel(homeworkRecordQueryDTO);
        // 发送请求
        ResponseBean<PageInfo<HomeworkRecordResponseDTO>> baseResponse = client.execute(request);
        return baseResponse;
    }
}
