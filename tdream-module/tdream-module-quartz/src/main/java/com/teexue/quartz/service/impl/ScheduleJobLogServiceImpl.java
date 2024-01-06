package com.teexue.quartz.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.AllArgsConstructor;
import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.impl.BaseServiceImpl;
import com.teexue.quartz.convert.ScheduleJobLogConvert;
import com.teexue.quartz.dao.ScheduleJobLogDao;
import com.teexue.quartz.entity.ScheduleJobLogEntity;
import com.teexue.quartz.query.ScheduleJobLogQuery;
import com.teexue.quartz.service.ScheduleJobLogService;
import com.teexue.quartz.vo.ScheduleJobLogVO;
import org.springframework.stereotype.Service;

/**
 * 定时任务日志
 *
 * @author teexue admin@teexue.com
 * 
 */
@Service
@AllArgsConstructor
public class ScheduleJobLogServiceImpl extends BaseServiceImpl<ScheduleJobLogDao, ScheduleJobLogEntity> implements ScheduleJobLogService {

    @Override
    public PageResult<ScheduleJobLogVO> page(ScheduleJobLogQuery query) {
        IPage<ScheduleJobLogEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(ScheduleJobLogConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<ScheduleJobLogEntity> getWrapper(ScheduleJobLogQuery query){
        LambdaQueryWrapper<ScheduleJobLogEntity> wrapper = Wrappers.lambdaQuery();
        wrapper.like(StrUtil.isNotBlank(query.getJobName()), ScheduleJobLogEntity::getJobName, query.getJobName());
        wrapper.like(StrUtil.isNotBlank(query.getJobGroup()), ScheduleJobLogEntity::getJobGroup, query.getJobGroup());
        wrapper.eq(query.getJobId() != null, ScheduleJobLogEntity::getJobId, query.getJobId());
        wrapper.orderByDesc(ScheduleJobLogEntity::getId);
        return wrapper;
    }

}