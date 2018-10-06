package com.storedsoul.dao.mappers;

import com.storedsoul.models.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User>
{
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        User user = new User();
        user.setUserId(rs.getInt(1));
        user.setEmailId(rs.getString(2));
        user.setPassword(rs.getString(3));
        return user;
    }
}
