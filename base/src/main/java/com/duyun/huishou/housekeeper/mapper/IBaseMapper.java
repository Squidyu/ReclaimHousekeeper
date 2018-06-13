package com.duyun.huishou.housekeeper.mapper;



import org.apache.ibatis.annotations.Mapper;

/**
 * @author haoshijing
 * @version 2018年01月09日 17:33
 **/

@Mapper
public interface IBaseMapper<T>{

    int insert(T entity);

    int updateByPrimaryKeySelective(T entity);

    int deleteByPrimaryKey(Integer id);


    T selectByPrimaryKey(Integer id);


}
