package com.teexue.system.dao;

import com.teexue.framework.mybatis.dao.BaseDao;
import com.teexue.system.entity.SysLogOperateEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 操作日志
 *
 * @author teexue admin@teexue.com
 * 
 */
@Mapper
public interface SysLogOperateDao extends BaseDao<SysLogOperateEntity> {

}