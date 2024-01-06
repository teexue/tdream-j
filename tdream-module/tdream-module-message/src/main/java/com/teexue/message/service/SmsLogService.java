package com.teexue.message.service;

import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.BaseService;
import com.teexue.message.entity.SmsLogEntity;
import com.teexue.message.query.SmsLogQuery;
import com.teexue.message.vo.SmsLogVO;

/**
 * 短信日志
 *
 * @author teexue admin@teexue.com
 * 
 */
public interface SmsLogService extends BaseService<SmsLogEntity> {

    PageResult<SmsLogVO> page(SmsLogQuery query);

}