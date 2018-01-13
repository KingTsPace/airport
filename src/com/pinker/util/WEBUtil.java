package com.pinker.util;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;

public class WEBUtil {

    public static <T>T param2Bean(HttpServletRequest request,Class<T> clazz){
        T t=null;
        try {
            BeanUtils.populate(clazz.newInstance(),request.getParameterMap());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;

    }

}
