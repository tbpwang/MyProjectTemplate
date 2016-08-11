package edu.cumtb.service;

import edu.cumtb.model.User;

/**
 * Created by tbpwang@gmail.com
 * 2016/8/10.
 */
public interface UserService extends GenericService<User, Integer> {

    User login(User user);
}
