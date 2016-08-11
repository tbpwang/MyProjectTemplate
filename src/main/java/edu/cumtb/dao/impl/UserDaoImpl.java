package edu.cumtb.dao.impl;

import edu.cumtb.dao.UserDao;
import edu.cumtb.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by tbpwang@gmail.com
 * 2016/8/10.
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer>  implements UserDao{
}
