package com.teexue.system.dao;

import com.teexue.framework.mybatis.dao.BaseDao;
import com.teexue.system.entity.SysLogLoginEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 登录日志
 *
 * @author teexue admin@teexue.com
 *
 */
@Mapper
public interface SysLogLoginDao extends BaseDao<SysLogLoginEntity> {

}