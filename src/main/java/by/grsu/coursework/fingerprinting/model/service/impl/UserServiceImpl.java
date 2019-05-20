package by.grsu.coursework.fingerprinting.model.service.impl;

import by.grsu.coursework.fingerprinting.model.dao.interfaces.UserDao;
import by.grsu.coursework.fingerprinting.model.domain.entity.User;
import by.grsu.coursework.fingerprinting.model.service.interfaces.UserService;

public class UserServiceImpl implements UserService {


    private UserDao userDao;

    @Override
    public User getUserByFingerprint(String fp) {
        return userDao.getUserByFingerprint(fp);
    }

    @Override
    public int saveUser(User user) {
        return userDao.saveUser(user);
    }
}
