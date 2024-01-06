package com.teexue.system.service;

import com.teexue.framework.mybatis.service.BaseService;
import com.teexue.system.entity.SysOrgEntity;
import com.teexue.system.vo.SysOrgVO;

import java.util.List;

/**
 * 机构管理
 * 
 * @author teexue admin@teexue.com
 *
 */
public interface SysOrgService extends BaseService<SysOrgEntity> {

	List<SysOrgVO> getList();

	void save(SysOrgVO vo);

	void update(SysOrgVO vo);

	void delete(Long id);

	/**
	 * 根据机构ID，获取子机构ID列表(包含本机构ID)
	 * @param id   机构ID
	 */
	List<Long> getSubOrgIdList(Long id);
}