package edu.cumtb.service.impl;

import edu.cumtb.dao.GenericDao;
import edu.cumtb.model.User;
import edu.cumtb.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by tbpwang@gmail.com
 * 2016/8/10.
 */
abstract class GenericServiceImpl<M extends Serializable, PK extends Number> implements GenericService<M, PK> {

    //    @Autowired
    GenericDao<M, PK> genericDao;

    public int add(M model) {
        return genericDao.add(model);
    }

    public List<M> queryOne(String modelAction, M model) {
        return genericDao.queryOne(modelAction, model);
    }

    public List<M> queryComplex(String modelActions, Map<String, Object> stringObjectMap) {
        return genericDao.queryComplex(modelActions, stringObjectMap);
    }

    public List<M> searchAll() {
        return genericDao.searchAll();
    }

    public M searchById(PK id) {
        return genericDao.searchById(id);
    }

    public void modify(M model) {
        genericDao.modify(model);
    }

    public void remove(PK id) {
        genericDao.remove(id);
    }

    public abstract void setGenericDao(GenericDao<M, PK> genericDao);
}
