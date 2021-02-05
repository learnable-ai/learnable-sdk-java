package com.learnable.sop.sdk.common;

import lombok.Getter;

/**
 * @author Haiguang.Ge
 * @date 2020/12/3 17:03
 */


@Getter
public enum ResultCodeEnum {
    //说明：百位数标识系统级别错误，10000开头的是开放平台业务 20000开头的是业务中台业务 30000开头是领域服务的业务

    /**
     * 调用成功
     */
    SUCCESS(200, "操作成功"),

    /**
     * 调用失败
     */
    FAIL(500, "操作失败"),

    ERROR_ILLEGAL_IP(501,"不合法的ip"),
    ERROR_OUT_OF_LIMIT(502,"访问失败！超过访问限制"),
    ERROR_IO(504,"上传文件异常"),
    ERROR_MOTHODNOTSUPPORT(505,"请求方法错误"),
    ERROR_TRY_AGAIN(506,"正在重试"),
    ERROR_TRY_AGAIN_FAILED(507,"重试失败"),
    QUEUE_PUT_ERROR(508,"队列put失败"),
    FREQUENT_OPERATION(509,"操作频繁，请稍后再试"),
    PARAMETER_LOGIC_INVALID(600, "参数逻辑校验错误"),

    //开放平台
    PARAMETER_NULL(10001,"缺少参数或值为空"),
    PARAMETER_INVAILD(10002, "参数错误"),

    ACCOUNT_LOCK(10003, "账号已锁定"),
    ACCOUNT_NOT_FOUND(10004, "账号不存在"),
    ACCOUNT_PASSWARD_ERROR(10005, "账号信息有误"),
    ACCOUNT_EXIST(10006, "账号已存在"),
    ACCOUNT_NOT_SUFFICIENT(10007, "账号余额不足"),
    ACCOUNT_OUT_OF_LIMIT(10008, "超过使用限制"),
    TOKEN_NOT_IN_USE(10009, "token无效"),
    ACCESS_TOKEN_NOT_IN_USE(10010, "token无效"),

    AUTH_NOT_HAVE(10011, "没有权限"),
    AUTH_SIGN_NOT_MATCH(10012, "签名不匹配"),

    TASK_IS_RUNING(10013, "任务已启动，无法再起启动"),
    TASK_IS_PAUSE(10014, "任务暂停，只可继续执行"),
    TASK_NOT_RUNING(10015, "任务未执行，无法暂停"),
    INVALID_REDIRECT_URL(10016,"回调url无法访问"),

    //阅卷中台
    IMAGE_INVALID(20001, "图片无效"),

    EXAM_NO_EXISTED(20002, "examNo已存在"),

    EXAM_NOT_EXISTED(20003, "考试不存在"),
    QUESTION_NOT_EXISTED(20004, "试题不存在"),
    QUESTION_EXISTED(20005, "试题已存在"),

    STUDENT_ANSWER_PAGE_REPEAT(20006, "学生答题卡重复上传"),

    STUDENT_ANSWER_PAGE_NOT_EXISTED(20007, "学生答题卡不存在"),

    OCR_ONGOING(20008, "OCR识别中"),

    OCR_FAIL(20009, "OCR识别失败"),

    NO_STUDENT_ANSWER_PAGE(20010, "没有上传答题卡"),

    IMAGE_FORMAT_INVALID(20011, "不支持的图片格式"),

    IMAGE_TOO_LARGE(20012, "图片不能超过10M"),

    IMAGE_INVALID_WIDTH_HEIGHT(20013, "图片像素或宽高比不正确"),

    LOGIC_PATTERN_INVALID(20014, "采分点logicPattern格式错误"),

    QUESTION_BODY_NULL(20015, "题干信息不能为空"),

    QUESTION_SUB_BODY_NULL(20016, "子题干信息不能为空"),

    SOLUTION_NULL(20017, "参考答案不能为空"),

    SCORE_POINT_NULL(20018, "采分点不能为空"),

    ANSWER_PAGE_IDX_DISCONTINUOUS(20019, "答题卡idx不连续"),

    /**
     * 上传题目，参考答案segment不能为空
     */
    SOLUTION_SEGMENT_IS_NULL(20020, "参考答案segment不能为空"),

    /**
     * 上传题目，参考答案segment 的orderIdx不不连续
     */
    SOLUTION_SEGMENT_ORDERIDX_DISCONTINUOUS(20021, "orderIdx不连续"),

    /**
     * 上传答题卡，studentImage不能为空
     */
    STUDENT_IMAGES_IS_NULL(20022, "studentImages不能为空"),

    /**
     * 上传题目，answerLocation 不能为空
     */
    ANSWER_LOCATION_IS_NULL(20023, "answerLocation不能为空"),

    /**
     * 上传题目，子题目采分点至少包含一个非独立采分点
     */
    INDEPENDENT_SCORE_POINT_NOT_EXIST(20024, "子题目采分点至少要包含一个非独立采分点"),

    /**
     * 发起阅卷，有正在进行的阅卷任务
     */
    GRADING_TASK_IS_RUNNING(20025, "有正在进行的阅卷任务"),

    /**
     * 上传试题，关联子问题不存在
     */
    RELATION_QUESTION_SUB_NOT_EXIST(20026, "关联子问题不存在"),

    /**
     * 更新答题卡，正在阅卷中不能更新答题卡
     */
    UPDATE_ANSWER_PAGE_GRADING(20027, "正在阅卷中不能更新答题卡"),

    /**
     * 上传更新试题，idx不连续
     *
     */
    QUESTION_IDX_DISCONTINUOUS(20028, "idx不连续"),

    /**
     * 上传更新试题，正在阅卷中不能更新试题
     */
    UPDATE_QUESTION_GRADING(20029, "正在阅卷中不能更新试题"),

    /**
     * 正在更新试题，不能发起阅卷任务
     */
    UPDATING_QUESTION_NOT_GRADING(20030, "正在更新试题，不能发起阅卷任务"),

    /**
     * 试题上传中，请稍后再试
     */
    QUESTION_UPDATING_RETRY(20031, "试题上传中，请稍后再试"),

    /**
     * 阅卷任务不存在
     */
    GRADING_TASK_NOT_EXIST(20032, "阅卷任务不存在"),

    //用户中心
    USER_NOT_LOGIN(30000, "用户未登录"),

    CLASS_NOT_EXIST(30001, "班级不存在"),

    NOT_STUDENT(30002, "当前用户不是学生账号"),

    NOT_TEACHER(30003, "当前用户不是老师账号"),

    ASSIGN_WORK_NOT_SELECT_CLASS(30004, "布置作业未选择班级"),

    STUDENT_TASK_ANSWER_REPEAT_SUBMIT(30005,"学生作业答案重复提交"),

    FOCUS_STUDENT_NOT_EXIST(30006, "不存在关注学生"),

    STUDENT_NOT_EXIST(30007, "学生不存在"),

    ASSIGN_WORK_CLASS_NO_STUDENTS(30008, "布置作业的班级中没有学生"),

    EXERCISE_BOOK_PAGE_IMAGE_UPLOADED(30009, "已经上传整页图片"),

    USER_LOGIN_OTHER_SIDE(30010, "用户在其他设备登录"),
    //南昊阅卷

    NANHAO_ANSWER_PAGE_IDX_INVALID(40000, "学生答题卡序号不正确"),

    NANHAO_ANSWER_PAGE_IDX_REPEAT(40001, "学生答题卡序号重复"),

    NANHAO_ANSWER_PAGE_NOT_EXIST(40002, "答题卡不存在"),

    NANHAO_SOLUTION_IDX_INVALID(40003, "参考答案行序号不正确"),

    NANHAO_SOLUTION_IDX_REPEAT(40004, "参考答案行序号重复"),

    NANHAO_LOCATION_IDX_INVALID(40005, "位置信息序号不正确"),

    NANHAO_LOCATION_IDX_REPEAT(40006, "位置信息序号重复"),

    NANHAO_GRADING_RESULT_NOT_EXIST(40007, "阅卷结果不存在"),

    ;


    /**
     * 返回编码
     */
    private Integer code;

    /**
     * 编码对应的消息
     */
    private String msg;

    ResultCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 获取枚举类型的编码值
     */
    public Integer code() {
        return this.code;
    }

    /**
     * 获取枚举类型的编码含义
     */
    public String msg() {
        return this.msg;
    }

    /**
     * 根据枚举名称--获取枚举编码
     */
    public static Integer getCode(String name) {
        for (ResultCodeEnum resultCode : ResultCodeEnum.values()) {
            if (resultCode.name().equals(name)) {
                return resultCode.code;
            }
        }
        return null;
    }

    public static  String getByCode(Integer code){
        for(ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()){
            if(resultCodeEnum.code().equals(code)){
                return  resultCodeEnum.getMsg();
            }
        }
        return null;
    }

}

