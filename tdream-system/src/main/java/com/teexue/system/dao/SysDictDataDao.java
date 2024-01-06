package com.teexue.system.dao;

import com.teexue.framework.mybatis.dao.BaseDao;
import com.teexue.system.entity.SysDictDataEntity;
import com.teexue.system.vo.SysDictVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 字典数据
 *
 * @author teexue admin@teexue.com
 *
 */
@Mapper
public interface SysDictDataDao extends BaseDao<SysDictDataEntity> {

    @Select("${sql}")
    List<SysDictVO.DictData> getListForSql(@Param("sql") String sql);
}
