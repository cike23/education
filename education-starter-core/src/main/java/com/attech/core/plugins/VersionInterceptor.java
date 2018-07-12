package com.attech.core.plugins;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.Properties;

/**
 * 乐观锁：数据库版本插件
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-12 20:42
 **/
@Intercepts(
        @Signature(
                type = StatementHandler.class,
                method = "prepare",
                args = {Connection.class, Integer.class}
        )
)
public class VersionInterceptor implements Interceptor {

    private static final String VERSION_COLUMN_NAME = "version";

    private static final Logger log = LoggerFactory.getLogger(VersionInterceptor.class);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {






        return null;
    }

    @Override
    public Object plugin(Object o) {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}