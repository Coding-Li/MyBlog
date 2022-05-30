package cn.lijunhaoit.myblog.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 核心Mapper,配置与Mapper4
 * @param <T>
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
