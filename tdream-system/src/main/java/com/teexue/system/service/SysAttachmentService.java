package com.teexue.system.service;

import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.mybatis.service.BaseService;
import com.teexue.system.entity.SysAttachmentEntity;
import com.teexue.system.query.SysAttachmentQuery;
import com.teexue.system.vo.SysAttachmentVO;

import java.util.List;

/**
 * 附件管理
 *
 * @author teexue admin@teexue.com
 *
 */
public interface SysAttachmentService extends BaseService<SysAttachmentEntity> {

    PageResult<SysAttachmentVO> page(SysAttachmentQuery query);

    void save(SysAttachmentVO vo);

    void update(SysAttachmentVO vo);

    void delete(List<Long> idList);
}