package com.teexue.system.service;

import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.BaseService;
import com.teexue.system.entity.SysLogOperateEntity;
import com.teexue.system.query.SysLogOperateQuery;
import com.teexue.system.vo.SysLogOperateVO;

/**
 * 操作日志
 *
 * @author teexue admin@teexue.com
 * 
 */
public interface SysLogOperateService extends BaseService<SysLogOperateEntity> {

    PageResult<SysLogOperateVO> page(SysLogOperateQuery query);
}