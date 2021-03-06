package edu.cumtb.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by tbpwang@gmail.com
 * 2016/8/10.
 */
public interface GenericService<M extends Serializable, PK extends Number> {
    //CRUD
    int add(M model);

    List<M> queryOne(String modelAction, M model);

    List<M> queryComplex(String modelActions, Map<String, Object> stringObjectMap);

    List<M> searchAll();

    M searchById(PK id);

    void modify(M model);

    void remove(PK id);

}
