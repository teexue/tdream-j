package com.teexue.system.service;

import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.BaseService;
import com.teexue.system.entity.SysRoleEntity;
import com.teexue.system.query.SysRoleQuery;
import com.teexue.system.vo.SysRoleDataScopeVO;
import com.teexue.system.vo.SysRoleVO;

import java.util.List;

/**
 * 角色
 * 
 * @author teexue admin@teexue.com
 *
 */
public interface SysRoleService extends BaseService<SysRoleEntity> {

	PageResult<SysRoleVO> page(SysRoleQuery query);

	List<SysRoleVO> getList(SysRoleQuery query);

	void save(SysRoleVO vo);

	void update(SysRoleVO vo);

	void dataScope(SysRoleDataScopeVO vo);

	void delete(List<Long> idList);
}
