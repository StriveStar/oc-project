package com.online.ocService.mapper;

import com.online.ocService.domain.CourseSection;

public interface CourseSectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseSection record);

    int insertSelective(CourseSection record);

    CourseSection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseSection record);

    int updateByPrimaryKey(CourseSection record);
}