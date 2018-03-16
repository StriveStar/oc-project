package com.online.ocService;

import com.online.ocService.domain.CourseSection;
import com.online.ocService.mapper.CourseSectionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OcServiceApplicationTests {

	@Autowired
	private CourseSectionMapper courseSectionMapper;

	@Test
	public void contextLoads() {
		CourseSection courseSection = courseSectionMapper.selectByPrimaryKey(1);
		System.out.println(courseSection);
	}

}
