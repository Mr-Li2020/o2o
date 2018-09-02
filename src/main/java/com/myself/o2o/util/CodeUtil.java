package com.myself.o2o.util;

import javax.servlet.http.HttpServletRequest;

public class CodeUtil {
    /**
     * 实际的验证码和输入的验证码进行比对
     * @param request
     * @return
     */
    public static boolean checkVerifyCode(HttpServletRequest request){
        String verifyCodeExcepted = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        String verifyCodeActual = HttpServletRequestUtil.getString(request,"verifyCodeActual");
        if(verifyCodeActual == null || !verifyCodeActual.equals(verifyCodeExcepted)){
            return false;
        }
        return true;
    }
}
