package com.teexue.message.dao;

import com.teexue.framework.mybatis.dao.BaseDao;
import com.teexue.message.entity.SmsPlatformEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 短信平台
*
* @author teexue admin@teexue.com
*/
@Mapper
public interface SmsPlatformDao extends BaseDao<SmsPlatformEntity> {
	
}