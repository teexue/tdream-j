package com.teexue.system.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import com.teexue.framework.common.utils.PageResult;
import com.teexue.framework.common.utils.Result;
import com.teexue.system.query.SysLogOperateQuery;
import com.teexue.system.service.SysLogOperateService;
import com.teexue.system.vo.SysLogOperateVO;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 操作日志
 *
 * @author teexue admin@teexue.com
 *
 */
@RestController
@RequestMapping("sys/log/operate")
@Tag(name = "操作日志")
@AllArgsConstructor
public class SysLogOperateController {
    private final SysLogOperateService sysLogOperateService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @PreAuthorize("hasAuthority('sys:operate:all')")
    public Result<PageResult<SysLogOperateVO>> page(@ParameterObject @Valid SysLogOperateQuery query) {
        PageResult<SysLogOperateVO> page = sysLogOperateService.page(query);

        return Result.ok(page);
    }
}