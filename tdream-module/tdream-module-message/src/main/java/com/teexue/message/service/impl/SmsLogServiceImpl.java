package com.teexue.message.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.AllArgsConstructor;
import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.impl.BaseServiceImpl;
import com.teexue.message.convert.SmsLogConvert;
import com.teexue.message.dao.SmsLogDao;
import com.teexue.message.entity.SmsLogEntity;
import com.teexue.message.query.SmsLogQuery;
import com.teexue.message.service.SmsLogService;
import com.teexue.message.vo.SmsLogVO;
import org.springframework.stereotype.Service;

/**
 * 短信日志
 *
 * @author teexue admin@teexue.com
 *
 */
@Service
@AllArgsConstructor
public class SmsLogServiceImpl extends BaseServiceImpl<SmsLogDao, SmsLogEntity> implements SmsLogService {

    @Override
    public PageResult<SmsLogVO> page(SmsLogQuery query) {
        IPage<SmsLogEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SmsLogConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SmsLogEntity> getWrapper(SmsLogQuery query){
        LambdaQueryWrapper<SmsLogEntity> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(query.getPlatform() != null, SmsLogEntity::getPlatform, query.getPlatform());
        wrapper.like(query.getPlatformId() != null, SmsLogEntity::getPlatformId, query.getPlatformId());
        wrapper.orderByDesc(SmsLogEntity::getId);
        return wrapper;
    }

}