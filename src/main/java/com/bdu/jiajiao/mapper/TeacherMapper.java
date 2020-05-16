package com.bdu.jiajiao.mapper;

import com.bdu.jiajiao.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 123
 * @create 2019/11/21
 * @since 1.0.0
 */
public interface TeacherMapper {

    List<Teacher> queryAllTeacher();

    List<Teacher> queryAllTeachers();

    Teacher queryTeacherById(@Param(value = "id") int id);

    Teacher queryTeacherByName(@Param(value = "username") String username);

    int addTeacher(Teacher teacher);

    Teacher login(@Param(value = "username")String username, @Param(value = "password")String password);

    int updateTeacher(Teacher teacher);

    Teacher findByToken(String token);

    List<Teacher> search(@Param("item") String item, @Param("area") String area);

    int delete(@Param(value = "id") int id);

    List<Teacher> queryTeachersInfo();

    List<Teacher> queryTeacherByItem(String item);
}
