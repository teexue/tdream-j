package com.teexue.quartz.service;

import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.BaseService;
import com.teexue.quartz.entity.ScheduleJobLogEntity;
import com.teexue.quartz.query.ScheduleJobLogQuery;
import com.teexue.quartz.vo.ScheduleJobLogVO;

/**
 * 定时任务日志
 *
 * @author teexue admin@teexue.com
 *
 */
public interface ScheduleJobLogService extends BaseService<ScheduleJobLogEntity> {

    PageResult<ScheduleJobLogVO> page(ScheduleJobLogQuery query);

}