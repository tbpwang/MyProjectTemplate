package edu.cumtb.dao.impl;

import edu.cumtb.dao.GenericDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

/**
 * Created by tbpwang@gmail.com
 * 2016/8/10.
 */
class GenericDaoImpl<M extends Serializable, PK extends Number> implements GenericDao<M, PK> {

    private String namespace;

    @Autowired
    GenericDaoImpl(SqlSession sqlSession) {
        Class<M> clazz = (Class<M>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        namespace = clazz.getSimpleName().toLowerCase().concat(".");
        this.sqlSession = sqlSession;
    }

    private final SqlSession sqlSession;

    public void add(M model) {
        sqlSession.insert(namespace.concat("create"), model);
    }

    public List<M> queryOne(String modelAction, M model) {
        return sqlSession.selectList(modelAction,model);
    }

    public List<M> queryComplex(String modelActions, Map<String, Object> stringObjectMap) {
        return null;
    }

    public List<M> searchAll() {
        return null;
    }

    public M searchById(PK id) {
        return null;
    }

    public void modify(M model) {

    }

    public void remove(PK id) {

    }
}
