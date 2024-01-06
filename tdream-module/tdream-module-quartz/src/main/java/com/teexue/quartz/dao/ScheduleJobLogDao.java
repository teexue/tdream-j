package com.teexue.quartz.dao;

import com.teexue.framework.mybatis.dao.BaseDao;
import com.teexue.quartz.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 定时任务日志
*
* @author teexue admin@teexue.com
*/
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}