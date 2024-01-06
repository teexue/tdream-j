package com.teexue.system.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.teexue.framework.common.query.Query;

/**
 * 参数管理查询
 *
 * @author teexue admin@teexue.com
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "参数管理查询")
public class SysParamsQuery extends Query {
    @Schema(description = "系统参数")
    private Integer paramType;

    @Schema(description = "参数键")
    private String paramKey;

    @Schema(description = "参数值")
    private String paramValue;

}