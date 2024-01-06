package com.teexue.system.dao;

import com.teexue.framework.mybatis.dao.BaseDao;
import com.teexue.system.entity.SysPostEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 岗位管理
*
* @author teexue admin@teexue.com
*/
@Mapper
public interface SysPostDao extends BaseDao<SysPostEntity> {
	
}