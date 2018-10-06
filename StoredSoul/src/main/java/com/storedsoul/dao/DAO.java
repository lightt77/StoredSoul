package com.storedsoul.dao;

import com.storedsoul.utilities.Constants;
import com.storedsoul.utilities.PropertiesFileReader;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Map;

public abstract class DAO<T>
{
    protected JdbcTemplate jdbcTemplate;

    public DAO()
    {
        this.jdbcTemplate = new JdbcTemplate(createDataSource());
    }

    private DataSource createDataSource()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(PropertiesFileReader.getProperty("databaseUrl"));
        dataSource.setUsername(PropertiesFileReader.getProperty("databaseUserName"));
        dataSource.setPassword(PropertiesFileReader.getProperty("databasePassword"));
        return dataSource;
    }

    protected Map<String, Object> executeStoredProc(String storedProcName, Map<String, Object> parameterMap, RowMapper<T> rowMapper)
    {
        // create new SimpleJdbcCall object for every stored-proc call to avoid metadata-cache clash issues among stored procs
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate);
        simpleJdbcCall.setProcedureName(storedProcName);
        simpleJdbcCall.returningResultSet(Constants.DEFAULT_RESULT_SET_KEY_FOR_STORED_PROCS, rowMapper);
        return simpleJdbcCall.execute(parameterMap);
    }
}
