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

    GenericDaoImpl() {
        Class<M> clazz = (Class<M>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        namespace = clazz.getSimpleName().toLowerCase().concat(".");
    }

    @Autowired
    private SqlSession sqlSession;

    public int add(M model) {
        return sqlSession.insert(namespace.concat("add"), model);
    }

    public List<M> queryOne(String modelAction, M model) {
        return sqlSession.selectList(modelAction,model);
    }

    public List<M> queryComplex(String modelActions, Map<String, Object> stringObjectMap) {
        return null;
    }

    public List<M> searchAll() {
        return sqlSession.selectList(namespace.concat("searchAll"));
    }

    public M searchById(PK id) {
        return sqlSession.selectOne(namespace.concat("searchById"),id);
    }

    public void modify(M model) {
        sqlSession.update(namespace.concat("modify"), model);
    }

    public void remove(PK id) {
        sqlSession.delete(namespace.concat("remove"),id);
    }
}
