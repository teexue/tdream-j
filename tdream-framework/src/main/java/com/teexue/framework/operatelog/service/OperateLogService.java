package com.teexue.framework.operatelog.service;

import lombok.AllArgsConstructor;
import com.teexue.framework.common.cache.RedisCache;
import com.teexue.framework.common.cache.RedisKeys;
import com.teexue.framework.operatelog.dto.OperateLogDTO;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 操作日志服务
 *
 * @author teexue admin@teexue.com
 *
 */
@Service
@AllArgsConstructor
public class OperateLogService {
    private final RedisCache redisCache;

    @Async
    public void saveLog(OperateLogDTO log) {
        String key = RedisKeys.getLogKey();

        // 保存到Redis队列
        redisCache.leftPush(key, log, RedisCache.NOT_EXPIRE);
    }
}
