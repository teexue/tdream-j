package com.teexue.system.service;

import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.BaseService;
import com.teexue.system.entity.SysPostEntity;
import com.teexue.system.query.SysPostQuery;
import com.teexue.system.vo.SysPostVO;

import java.util.List;

/**
 * 岗位管理
 *
 * @author teexue admin@teexue.com
 * 
 */
public interface SysPostService extends BaseService<SysPostEntity> {

    PageResult<SysPostVO> page(SysPostQuery query);

    List<SysPostVO> getList();

    void save(SysPostVO vo);

    void update(SysPostVO vo);

    void delete(List<Long> idList);
}