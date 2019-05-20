package by.grsu.coursework.fingerprinting.model.dao.interfaces;

import by.grsu.coursework.fingerprinting.model.domain.entity.User;

public interface UserDao {

    User getUserByFingerprint(String fp);

    int saveUser(User user);


}
