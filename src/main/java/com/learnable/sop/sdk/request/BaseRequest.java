package com.learnable.sop.sdk.request;

import com.alibaba.fastjson.JSON;
import com.learnable.sop.sdk.common.OpenConfig;
import com.learnable.sop.sdk.common.RequestForm;
import com.learnable.sop.sdk.common.RequestMethod;
import com.learnable.sop.sdk.common.UploadFile;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 请求对象父类，后续请求对象都要继承这个类
 * <p>
 * 参数	            类型	    是否必填	    最大长度	    描述	            示例值
 * app_id	        String	是	        32	    支付宝分配给开发者的应用ID	2014072300007148
 * method	        String	是	        128	    接口名称	alipay.trade.fastpay.refund.query
 * format	        String	否	        40	    仅支持JSON	JSON
 * charset	    String	是	        10	    请求使用的编码格式，如utf-8,gbk,gb2312等	utf-8
 * sign_type	    String	是	        10	    商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2	RSA2
 * sign	        String	是	        344	    商户请求参数的签名串，详见签名	详见示例
 * timestamp	    String	是	        19	    发送请求的时间，格式"yyyy-MM-dd HH:mm:ss"	2014-07-24 03:07:50
 * version	        String	是	        3	    调用的接口版本，固定为：1.0	1.0
 * app_auth_token	String	否	        40	    详见应用授权概述
 * biz_content	    String	是		请求参数的集合，最大长度不限，除公共参数外所有请求参数都必须放在这个参数中传递，具体参照各产品快速接入文档
 *
 * @param <T> 对应的Response对象
 *
 * @author
 */
public abstract class BaseRequest<T> {

    private static final String EMPTY_JSON = "{}";
    private RequestMethod requestMethod;
    private String path;
    private String version;

    private String bizContent = EMPTY_JSON;
    private Object bizModel;

    /**
     * 上传文件
     */
    private List<UploadFile> files;
//
//    private Class<T> responseClass = (Class<T>) ClassUtil.getSuperClassGenricType(this.getClass(), 0);;


    protected BaseRequest(RequestMethod requestMethod,String path, String version) {
        this.requestMethod = requestMethod;
        this.path = path;
        this.version = version;
    }


    /**
     * 添加上传文件
     *
     * @param file
     */
    public void addFile(UploadFile file) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(file);
    }

    public RequestForm createRequestForm(OpenConfig openConfig) {
        // 公共请求参数
        Map<String, String> params = new HashMap<String, String>(16);
        params.put(openConfig.getMethodName(), this.path);
        params.put(openConfig.getFormatName(), openConfig.getFormatType());
        params.put(openConfig.getCharsetName(), openConfig.getCharset());
        params.put(openConfig.getSignTypeName(), openConfig.getSignType());
        String timestamp = new SimpleDateFormat(openConfig.getTimestampPattern()).format(new Date());
        params.put(openConfig.getTimestampName(), timestamp);
        String v = this.version == null ? openConfig.getDefaultVersion() : this.version;
        params.put(openConfig.getVersionName(), v);

        // 业务参数
        String biz_content = buildBizContent();

        params.put(openConfig.getDataName(), biz_content);

        RequestForm requestForm = new RequestForm(params);
        requestForm.setRequestMethod(requestMethod);
        requestForm.setCharset(openConfig.getCharset());
        requestForm.setFiles(this.files);
        return requestForm;
    }

    protected String buildBizContent() {
        if (bizModel != null) {
            return JSON.toJSONString(bizModel);
        } else {
            return this.bizContent;
        }
    }

    public String getPath() {
        return path;
    }

    /**
     * 指定版本号
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    public void setBizModel(Object bizModel) {
        this.bizModel = bizModel;
    }

    public void setFiles(List<UploadFile> files) {
        this.files = files;
    }

//    public Class<T> getResponseClass() {
//        return responseClass;
//    }


}
