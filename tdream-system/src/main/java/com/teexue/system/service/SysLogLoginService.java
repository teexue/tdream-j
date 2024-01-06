package com.teexue.system.service;

import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.BaseService;
import com.teexue.system.entity.SysLogLoginEntity;
import com.teexue.system.query.SysLogLoginQuery;
import com.teexue.system.vo.SysLogLoginVO;

/**
 * 登录日志
 *
 * @author teexue admin@teexue.com
 *
 */
public interface SysLogLoginService extends BaseService<SysLogLoginEntity> {

    /**
     * Page result.
     *
     * @param query the query
     * @return the page result
     */
    PageResult<SysLogLoginVO> page(SysLogLoginQuery query);

    /**
     * 保存登录日志
     *
     * @param username  用户名
     * @param status    登录状态
     * @param operation 操作信息
     */
    void save(String username, Integer status, Integer operation);

    /**
     * 导出登录日志
     */
    void export();
}