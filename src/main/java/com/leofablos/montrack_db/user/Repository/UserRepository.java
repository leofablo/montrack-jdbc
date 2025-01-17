package com.leofablos.montrack_db.user.Repository;

import com.leofablos.montrack_db.user.Entity.User;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;

    }

    public void save(User user){
        String sql = "INSERT INTO montrack.users (username, email, avatar, quote, created_at, updated_at, deleted_at) VALUES (?, ?, ?, ?, NOW(), NOW(), NULL)";
        jdbcTemplate.update(sql, user.getUsername(), user.getEmail(), user.getAvatar(), user.getQuote());
    }



}
