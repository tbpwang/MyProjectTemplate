package edu.cumtb.dao.impl;

import edu.cumtb.dao.UserDao;
import edu.cumtb.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * Created by tbpwang@gmail.com
 * 2016/8/10.
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer>  implements UserDao{
    UserDaoImpl(SqlSession sqlSession) {
        super(sqlSession);
    }
}
