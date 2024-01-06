package com.teexue.system.convert;

import com.teexue.system.entity.SysLogOperateEntity;
import com.teexue.system.vo.SysLogOperateVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 操作日志
 *
 * @author teexue admin@teexue.com
 *
 */
@Mapper
public interface SysLogOperateConvert {
    SysLogOperateConvert INSTANCE = Mappers.getMapper(SysLogOperateConvert.class);

    SysLogOperateEntity convert(SysLogOperateVO vo);

    SysLogOperateVO convert(SysLogOperateEntity entity);

    List<SysLogOperateVO> convertList(List<SysLogOperateEntity> list);

}