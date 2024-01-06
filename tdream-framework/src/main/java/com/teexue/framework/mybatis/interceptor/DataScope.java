package com.teexue.framework.mybatis.interceptor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 数据范围
 *
 * @author teexue admin@teexue.com
 *
 */
@Data
@AllArgsConstructor
public class DataScope {
    private String sqlFilter;

}