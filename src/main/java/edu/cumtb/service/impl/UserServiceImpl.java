package edu.cumtb.service.impl;

import edu.cumtb.dao.GenericDao;
import edu.cumtb.model.User;
import edu.cumtb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tbpwang@gmail.com
 * 2016/8/10.
 */

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {

    @Autowired
    public void setGenericDao(GenericDao<User, Integer> genericDao){
        super.genericDao = genericDao;
    }

    public User login(User user) {
        return super.genericDao.queryOne("user.login", user).get(0);
    }
}
