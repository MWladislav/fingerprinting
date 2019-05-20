package by.grsu.coursework.fingerprinting.model.service.interfaces;

import by.grsu.coursework.fingerprinting.model.domain.entity.User;

public interface UserService {
    User getUserByFingerprint(String fp);

    int saveUser(User user);
}
