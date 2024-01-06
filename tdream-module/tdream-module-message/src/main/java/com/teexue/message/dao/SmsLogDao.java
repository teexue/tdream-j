package com.teexue.message.dao;

import com.teexue.framework.mybatis.dao.BaseDao;
import com.teexue.message.entity.SmsLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 短信日志
*
* @author teexue admin@teexue.com
*/
@Mapper
public interface SmsLogDao extends BaseDao<SmsLogEntity> {
	
}