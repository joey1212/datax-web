package com.wugui.datax.admin.tool.query;

import com.wugui.datatx.core.enums.DbType;
import com.wugui.datax.admin.entity.JobDatasource;

import java.sql.SQLException;

/**
 * sql server
 *
 * @author zhouhongfa@gz-yibo.com
 * @version 1.0
 * @since 2019/8/2
 */
public class SqlServerQueryTool extends BaseQueryTool implements QueryToolInterface {
    public SqlServerQueryTool(DbType dbType, String parameter) {
        super(dbType,parameter);
    }
}
