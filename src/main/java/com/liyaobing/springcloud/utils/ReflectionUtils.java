package com.liyaobing.springcloud.utils;

import java.lang.reflect.Method;

/**
 * @author 郑鸿基
 */
public class ReflectionUtils {
    public static void setProperty(Object obj, String methodName, Object val) {
        Class<?> clazz = obj.getClass();
        Method method = null;
        try {
            method = clazz.getMethod(methodName, val.getClass());
            method.invoke(obj, val);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object getProperty(Object obj, String methodName) {
        Class<?> clazz = obj.getClass();
        Method method = null;
        try {
            method = clazz.getMethod(methodName);
            return method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
