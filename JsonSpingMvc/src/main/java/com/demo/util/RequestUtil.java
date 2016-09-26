package com.demo.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by guoqingma on 16-5-4.
 */
public class RequestUtil {

    private static final Logger logger = LoggerFactory.getLogger(RequestUtil.class);

    public static JSONObject getRequestJson(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        try {
            String json = IOUtils.toString(request.getInputStream(), "utf-8");
            jsonObject = (JSONObject) JSON.parse(json);
        } catch (Exception e) {
            logger.error("request to Json error", e);
            jsonObject = new JSONObject();
        }
        return jsonObject;
    }
}
