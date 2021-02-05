## 可之科技开放平台sdk

#### 功能简介
目前开放单题识别，配图提取，整页识别3个功能的异步请求，提供对应功能的请求和查询共6个接口。发起请求的入参有回调地址。会在有结果时以post body的方式回传结果。

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
    
#### 文件夹结构结构


client：请求相关类  
common：基础数据类型  
exception： 异常  
ocr：识别相关的数据类和请求方法，三方主要使用的代码。回调解析可以使用这里面的response解析  
request：请求基础类型  
sign：签名相关代码  
util：各种工具  