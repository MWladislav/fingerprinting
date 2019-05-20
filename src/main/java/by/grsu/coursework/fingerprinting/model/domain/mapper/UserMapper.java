package by.grsu.coursework.fingerprinting.model.domain.mapper;

import by.grsu.coursework.fingerprinting.model.domain.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setFingerprint(resultSet.getString("user_fingerprint"));
        user.setUsername(resultSet.getString("username"));
        return user;
    }
}
