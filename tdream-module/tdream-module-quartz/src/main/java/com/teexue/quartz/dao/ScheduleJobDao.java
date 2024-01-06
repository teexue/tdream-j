package com.teexue.quartz.dao;

import com.teexue.framework.mybatis.dao.BaseDao;
import com.teexue.quartz.entity.ScheduleJobEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 定时任务
*
* @author teexue admin@teexue.com
*/
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
}