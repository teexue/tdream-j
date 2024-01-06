package com.teexue.message.convert;

import com.teexue.message.entity.SmsPlatformEntity;
import com.teexue.message.sms.config.SmsConfig;
import com.teexue.message.vo.SmsPlatformVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
* 短信平台
*
* @author teexue admin@teexue.com
*/
@Mapper
public interface SmsPlatformConvert {
    SmsPlatformConvert INSTANCE = Mappers.getMapper(SmsPlatformConvert.class);

    SmsPlatformEntity convert(SmsPlatformVO vo);

    SmsPlatformVO convert(SmsPlatformEntity entity);

    List<SmsPlatformVO> convertList(List<SmsPlatformEntity> list);

    SmsConfig convert2(SmsPlatformEntity entity);

    List<SmsConfig> convertList2(List<SmsPlatformEntity> list);

}