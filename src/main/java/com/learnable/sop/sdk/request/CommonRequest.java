package com.learnable.sop.sdk.request;

import com.learnable.sop.sdk.common.RequestMethod;

/**
 * @author tanghc
 */
public class CommonRequest<T> extends BaseRequest{

    public CommonRequest(String path) {
        super(RequestMethod.POST,path, null);
    }

    public CommonRequest(String path, String version) {
        super(RequestMethod.POST,path, version);
    }

    public CommonRequest(RequestMethod requestMethod,String path) {
        super(requestMethod,path, null);
    }

    public CommonRequest(RequestMethod requestMethod,String path, String version) {
        super(requestMethod,path, version);
    }


}
