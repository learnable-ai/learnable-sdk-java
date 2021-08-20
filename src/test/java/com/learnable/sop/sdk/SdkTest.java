package com.learnable.sop.sdk;

import com.alibaba.fastjson.JSONObject;
import com.learnable.sop.sdk.common.ResponseBean;
import com.learnable.sop.sdk.grading.GradingApi;
import com.learnable.sop.sdk.grading.request.*;
import com.learnable.sop.sdk.grading.response.SimplePageReviewResponseDTO;
import com.learnable.sop.sdk.ocr.OCRApi;
import com.learnable.sop.sdk.ocr.common.ImageDTO;
import com.learnable.sop.sdk.ocr.request.*;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SdkTest extends TestCase {
    String appId = "kz20210820878283106723823616";   //控制台获取appId

    String secret = "ed0cc0145f6a4ba195e11f73f4d467b6";  //控制台获取secret

    OCRApi ocrApi = OCRApi.buildOCRApi(appId,secret);

    GradingApi gradingApi = GradingApi.buildGradingApi(appId,secret);

    /**
     * OCRdemo
     */
    @Test
    public void testocr() {
        OcrRequestDTO ocrRequestDTO = new OcrRequestDTO();
        ImageDTO imageDTO = new ImageDTO();
        imageDTO.setUrl("图片地址");
        ocrRequestDTO.setCallbackUrl("回调地址");
        ocrRequestDTO.setImage(imageDTO);
        System.out.println(JSONObject.toJSONString(ocrApi.ocrGeneral(ocrRequestDTO)));
    }

    /**
     * OCR结果查询demo
     */
    @Test
    public void testocrQuery() {
        OcrQueryDTO ocrQueryDTO = new OcrQueryDTO();
        ocrQueryDTO.setImageId("79f06c6b-bc7e-435b-991d-be34be274ce7");
        System.out.println(JSONObject.toJSONString(ocrApi.queryOcrResult(ocrQueryDTO)));
    }

    /**
     * 题目配图结果查询demo
     */
    @Test
    public void testsegmentationQuery() {
        SegmentationQueryDTO segmentationQueryDTO = new SegmentationQueryDTO();
        segmentationQueryDTO.setImageId("10748a8a-d7b8-4b48-adba-95b6f7bf3621");
        System.out.println(JSONObject.toJSONString(ocrApi.querySegmentationResult(segmentationQueryDTO)));
    }

    /**
     * 简易批阅demo
     */
    @Test
    public void testGradingSimple(){
        AnswerPageRequestDTO answerPageRequestDTO = new AnswerPageRequestDTO();
        List<AnswerPageDTO> answerPageDTOList = new ArrayList<>();
        AnswerPageDTO answerPageDTO = new AnswerPageDTO();
        answerPageDTO.setOrderIdx(0);
        answerPageDTO.setImageUrl("https://tag-exam-prod.oss-cn-beijing.aliyuncs.com/005c6b13282c4e5c9795cbcdae888f65.jpg");
        answerPageDTOList.add(answerPageDTO);

        List<QuestionAnswerLocationDTO> questionAnswerLocationDTOList = new ArrayList<>();
        QuestionAnswerLocationDTO questionAnswerLocationDTO = new QuestionAnswerLocationDTO();
        questionAnswerLocationDTO.setAnswerPageIdx(0);
        questionAnswerLocationDTO.setOrderIdx(0);
        questionAnswerLocationDTO.setX_start("0");
        questionAnswerLocationDTO.setX_end("150");
        questionAnswerLocationDTO.setY_start("0");
        questionAnswerLocationDTO.setY_end("150");
        questionAnswerLocationDTOList.add(questionAnswerLocationDTO);

        List<QuestionSolutionDTO> questionSolutionDTOList = new ArrayList<>();
        QuestionSolutionDTO questionSolutionDTO = new QuestionSolutionDTO();
        questionSolutionDTO.setContent("x=1");
        questionSolutionDTO.setOrderIdx(0);
        questionSolutionDTOList.add(questionSolutionDTO);

        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setQuestionId("17");
        questionDTO.setQuestionType(2);
        questionDTO.setAnswerLocation(questionAnswerLocationDTOList);
        questionDTO.setQuestionSolutionList(questionSolutionDTOList);

        answerPageRequestDTO.setAnswerPaperList(answerPageDTOList);
        answerPageRequestDTO.setCallbackUrl("http://39.107.58.58:8080/admin/callback2");
        answerPageRequestDTO.setQuestion(questionDTO);
        answerPageRequestDTO.setStudentNo("001");
        System.out.println(JSONObject.toJSONString(gradingApi.gradingAnswerPage(answerPageRequestDTO)));
    }

    /**
     * 简易批阅结果查询demo
     */
    @Test
    public void testGradingSimpleQuery() {
        GradingAnswerPageQueryDTO gradingAnswerPageQueryDTO = new GradingAnswerPageQueryDTO();
        gradingAnswerPageQueryDTO.setGradingRecordId(3055);
        System.out.println(JSONObject.toJSONString(gradingApi.gradingAnswerPageQuery(gradingAnswerPageQueryDTO)));
    }

    /**
     * 题目结构化调用demo
     */
    @Test
    public void testQuestionGroup() {
        QuestionGroupRequest questionGroupRequest = new QuestionGroupRequest();
        questionGroupRequest.setImageUrl("https://tag-exam-prod.oss-cn-beijing.aliyuncs.com/005c6b13282c4e5c9795cbcdae888f65.jpg");
        System.out.println(JSONObject.toJSONString(ocrApi.questionGroup(questionGroupRequest)));
    }



    /**
     * 试卷识别调用demo
     */
    @Test
    public void testExamPaper() {
        ExamPaperRequestDTO examPaperRequestDTO = new ExamPaperRequestDTO();
        examPaperRequestDTO.setImageUrl("https://tag-exam-prod.oss-cn-beijing.aliyuncs.com/005c6b13282c4e5c9795cbcdae888f65.jpg");
        System.out.println(JSONObject.toJSONString(ocrApi.examPaper(examPaperRequestDTO)));
    }

    @Test
    public void testSimplePageReview() {
        SimplePageReviewRequestDTO simplePageReviewRequestDTO = new SimplePageReviewRequestDTO();
        simplePageReviewRequestDTO.setImageUrl("https://xgs2019test.oss-cn-beijing.aliyuncs.com/120_1620980684581_1875.jfif");
        simplePageReviewRequestDTO.setBookUniqueId("44");
        ResponseBean<SimplePageReviewResponseDTO> simplePageReviewResponseDTO = gradingApi.simplePageReview(simplePageReviewRequestDTO);
        System.out.println(JSONObject.toJSONString(simplePageReviewResponseDTO));

    }
    @Test
    public void testSimplePageReviewQuery() {
        SimplePageReviewQueryRequestDTO simplePageReviewQueryRequestDTO = new SimplePageReviewQueryRequestDTO();
        simplePageReviewQueryRequestDTO.setPageReviewId(157299725369345L);
        System.out.println(JSONObject.toJSONString(gradingApi.simplePageReviewQuery(simplePageReviewQueryRequestDTO)));

    }

    /**
     * 作业批量提交
     */
    @Test
    public void  testHomeworkSubmit(){
        HomeworkSubmitRequestDTO homeworkSubmitRequestDTO = new HomeworkSubmitRequestDTO();
        homeworkSubmitRequestDTO.setTaskId(112);
        List<String> imageList = new ArrayList<>();
        imageList.add("url1");
        imageList.add("url2");
        homeworkSubmitRequestDTO.setImageList(imageList);
        System.out.println(JSONObject.toJSONString(gradingApi.homeworkSubmit(homeworkSubmitRequestDTO)));
    }

    /**
     * 查询作业批改状态
     */
    @Test
    public void testQueryHomeworkResult(){
        HomeworkStatusRequestDTO homeworkStatusRequestDTO = new HomeworkStatusRequestDTO();
        homeworkStatusRequestDTO.setTaskId(112);
        System.out.println(JSONObject.toJSONString(gradingApi.queryHomeworkResult(homeworkStatusRequestDTO)));
    }

    /**
     * 根据教师id查询作业列表
     */
    @Test
    public void testQueryHomewordRecord(){
        HomeworkRecordQueryDTO homeworkRecordQueryDTO = new HomeworkRecordQueryDTO();
        homeworkRecordQueryDTO.setTeacherId(111);
        homeworkRecordQueryDTO.setPageNo(1);
        homeworkRecordQueryDTO.setPageSize(20);
        System.out.println(JSONObject.toJSONString(gradingApi.queryHomewordRecord(homeworkRecordQueryDTO)));
    }
}
