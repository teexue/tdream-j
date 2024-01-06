package com.teexue.system.service;

import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.BaseService;
import com.teexue.system.entity.SysDictDataEntity;
import com.teexue.system.query.SysDictDataQuery;
import com.teexue.system.vo.SysDictDataVO;

import java.util.List;

/**
 * 数据字典
 *
 * @author teexue admin@teexue.com
 *
 */
public interface SysDictDataService extends BaseService<SysDictDataEntity> {

    PageResult<SysDictDataVO> page(SysDictDataQuery query);

    void save(SysDictDataVO vo);

    void update(SysDictDataVO vo);

    void delete(List<Long> idList);

}