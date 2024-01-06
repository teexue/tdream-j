package com.teexue.framework.security.mobile;

/**
 * 手机短信登录，验证码效验
 *
 * @author teexue admin@teexue.com
 *
 */
public interface MobileVerifyCodeService {

    boolean verifyCode(String mobile, String code);
}
