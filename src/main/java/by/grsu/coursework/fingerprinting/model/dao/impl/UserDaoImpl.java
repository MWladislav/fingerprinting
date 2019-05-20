package by.grsu.coursework.fingerprinting.model.dao.impl;

import by.grsu.coursework.fingerprinting.model.dao.interfaces.FingerprintDetailsDao;
import by.grsu.coursework.fingerprinting.model.dao.interfaces.UserDao;
import by.grsu.coursework.fingerprinting.model.domain.entity.User;
import by.grsu.coursework.fingerprinting.model.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    private static final String SQL_GET_USER_BY_FINGERPRINT = "select * from users u where u.user_fingerprint=?";

    private static final String SQL_SAVE_USER = "insert into users(user_fingerprint,username) values(?,?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private FingerprintDetailsDao fingerprintDetailsDao;

    @Override
    public User getUserByFingerprint(String fp) {
        User user = jdbcTemplate.queryForObject(SQL_GET_USER_BY_FINGERPRINT,new UserMapper());
        if (user != null) {
            user.setFingerprintDetails(fingerprintDetailsDao.getFingerprintDetailsByFingerprint(fp));
        }
        return user;
    }

    @Override
    public int saveUser(User user) {
        return jdbcTemplate.update(SQL_SAVE_USER, user.getFingerprint(), user.getUsername());
    }
}
