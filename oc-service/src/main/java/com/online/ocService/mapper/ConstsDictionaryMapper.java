package com.online.ocService.mapper;

import com.online.ocService.domain.ConstsDictionary;

public interface ConstsDictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConstsDictionary record);

    int insertSelective(ConstsDictionary record);

    ConstsDictionary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConstsDictionary record);

    int updateByPrimaryKey(ConstsDictionary record);
}