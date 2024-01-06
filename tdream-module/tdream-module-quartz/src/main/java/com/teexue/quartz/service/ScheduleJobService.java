package com.teexue.quartz.service;

import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.BaseService;
import com.teexue.quartz.entity.ScheduleJobEntity;
import com.teexue.quartz.query.ScheduleJobQuery;
import com.teexue.quartz.vo.ScheduleJobVO;

import java.util.List;

/**
 * 定时任务
 *
 * @author teexue admin@teexue.com
 *
 */
public interface ScheduleJobService extends BaseService<ScheduleJobEntity> {

    PageResult<ScheduleJobVO> page(ScheduleJobQuery query);

    void save(ScheduleJobVO vo);

    void update(ScheduleJobVO vo);

    void delete(List<Long> idList);

    void run(ScheduleJobVO vo);

    void changeStatus(ScheduleJobVO vo);
}