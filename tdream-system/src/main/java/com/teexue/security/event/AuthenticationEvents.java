package com.teexue.security.event;

import lombok.AllArgsConstructor;
import com.teexue.framework.common.constant.Constant;
import com.teexue.framework.security.user.UserDetail;
import com.teexue.system.enums.LoginOperationEnum;
import com.teexue.system.service.SysLogLoginService;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

/**
 * 认证事件处理
 *
 * @author teexue admin@teexue.com
 *
 */
@Component
@AllArgsConstructor
public class AuthenticationEvents {
    private final SysLogLoginService sysLogLoginService;

    @EventListener
    public void onSuccess(AuthenticationSuccessEvent event) {
        // 用户信息
        UserDetail user = (UserDetail) event.getAuthentication().getPrincipal();

        // 保存登录日志
        sysLogLoginService.save(user.getUsername(), Constant.SUCCESS, LoginOperationEnum.LOGIN_SUCCESS.getValue());
    }

    @EventListener
    public void onFailure(AbstractAuthenticationFailureEvent event) {
        // 用户名
        String username = (String) event.getAuthentication().getPrincipal();

        // 保存登录日志
        sysLogLoginService.save(username, Constant.FAIL, LoginOperationEnum.ACCOUNT_FAIL.getValue());
    }

}