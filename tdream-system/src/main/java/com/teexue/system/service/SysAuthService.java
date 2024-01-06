package com.teexue.system.service;

import com.teexue.system.vo.AccessTokenVO;
import com.teexue.system.vo.SysAccountLoginVO;
import com.teexue.system.vo.SysMobileLoginVO;
import com.teexue.system.vo.SysUserTokenVO;

/**
 * 权限认证服务
 *
 * @author teexue admin@teexue.com
 * 
 */
public interface SysAuthService {

    /**
     * 账号密码登录
     *
     * @param login 登录信息
     */
    SysUserTokenVO loginByAccount(SysAccountLoginVO login);

    /**
     * 手机短信登录
     *
     * @param login 登录信息
     */
    SysUserTokenVO loginByMobile(SysMobileLoginVO login);

    /**
     * 发送手机验证码
     *
     * @param mobile 手机号
     */
    boolean sendCode(String mobile);

    /**
     * 根据刷新Token，获取AccessToken
     *
     * @param refreshToken refreshToken
     */
    AccessTokenVO getAccessToken(String refreshToken);

    /**
     * 退出登录
     *
     * @param accessToken accessToken
     */
    void logout(String accessToken);
}
