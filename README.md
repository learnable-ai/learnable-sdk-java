## 可之科技开放平台sdk

#### 功能简介
目前开放图片OCR识别和简易批阅两大核心业务的调用。

图片OCR识别开放单题识别、配图提取、整页识别3个功能的异步请求，通过异步回调的方式返回结果，同时提供相关查询功能。会在有结果时以post body的方式回传结果。

简易批阅提供提交答题卡阅卷接口的请求，通过异步回调的方式返回结果同时提供相关的查询功能。

#### 文件夹结构结构


client：请求相关类  
common：基础数据类型  
exception： 异常类  
ocr：图片OCR识别相关业务
grading：批阅相关业务
request：请求基础类型  
sign：签名相关类  
util：工具类  

#### 代码使用
调用OCRAPI中的静态方法初始化对象，然后调用接口访问服务。更多样例可见test


    String appId = "";
    String secret = "";
    OCRApi ocrApi = OCRApi.buildOCRApi(appId,secret);
    OcrRequestDTO ocrRequestDTO = new OcrRequestDTO();
    ImageDTO imageDTO = new ImageDTO();
    imageDTO.setUrl("图片地址");
    ocrRequestDTO.setCallbackUrl("回调地址");
    ocrRequestDTO.setImage(imageDTO);
    ocrApi.ocrGeneral(ocrRequestDTO)；
    
