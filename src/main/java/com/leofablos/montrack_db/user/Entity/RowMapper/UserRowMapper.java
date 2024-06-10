package com.leofablos.montrack_db.user.Entity.RowMapper;

import com.leofablos.montrack_db.user.Entity.User;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNumber) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setUsername(rs.getString("username"));
        user.setEmail(rs.getString("email"));
        user.setAvatar(rs.getString("avatar"));
        user.setQuote(rs.getString("quote"));
        user.setCreateAt(rs.getTimestamp("created_at").toInstant());
        user.setDeteledAt(rs.getTimestamp("deteled_at").toInstant());
        user.setIsDeleted(rs.getTimestamp("is_deleted").toInstant());
        return user;
    }
}
