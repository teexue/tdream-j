package com.teexue.message.convert;

import com.teexue.message.entity.SmsLogEntity;
import com.teexue.message.vo.SmsLogVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
* 短信日志
*
* @author teexue admin@teexue.com
*/
@Mapper
public interface SmsLogConvert {
    SmsLogConvert INSTANCE = Mappers.getMapper(SmsLogConvert.class);

    SmsLogVO convert(SmsLogEntity entity);

    List<SmsLogVO> convertList(List<SmsLogEntity> list);

}