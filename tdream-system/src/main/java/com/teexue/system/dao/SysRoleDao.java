package com.teexue.system.dao;

import com.teexue.framework.mybatis.dao.BaseDao;
import com.teexue.system.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色管理
 *
 * @author teexue admin@teexue.com
 *
 */
@Mapper
public interface SysRoleDao extends BaseDao<SysRoleEntity> {

    /**
     * 根据用户ID，获取用户最大的数据范围
     */
    Integer getDataScopeByUserId(@Param("userId") Long userId);

    /**
     * 根据用户ID，获取用户角色编码
     */
    List<String> geRoleCodeByUserId(@Param("userId") Long userId);

}
