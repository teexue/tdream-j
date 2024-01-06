package com.teexue.message.service;

import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.BaseService;
import com.teexue.message.entity.SmsPlatformEntity;
import com.teexue.message.query.SmsPlatformQuery;
import com.teexue.message.sms.config.SmsConfig;
import com.teexue.message.vo.SmsPlatformVO;

import java.util.List;

/**
 * 短信平台
 *
 * @author teexue admin@teexue.com
 *
 */
public interface SmsPlatformService extends BaseService<SmsPlatformEntity> {

    PageResult<SmsPlatformVO> page(SmsPlatformQuery query);

    /**
     * 启用的短信平台列表
     */
    List<SmsConfig> listByEnable();

    void save(SmsPlatformVO vo);

    void update(SmsPlatformVO vo);

    void delete(List<Long> idList);

}