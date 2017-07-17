package com.xlw.levyx.mapper.client;

import com.xlw.levyx.mapper.model.StudentSubject;
import com.xlw.levyx.mapper.model.StudentSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentSubjectMapper {
    int countByExample(StudentSubjectExample example);

    int deleteByExample(StudentSubjectExample example);

    int deleteByPrimaryKey(String id);

    int insert(StudentSubject record);

    int insertSelective(StudentSubject record);

    List<StudentSubject> selectByExample(StudentSubjectExample example);

    StudentSubject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") StudentSubject record, @Param("example") StudentSubjectExample example);

    int updateByExample(@Param("record") StudentSubject record, @Param("example") StudentSubjectExample example);

    int updateByPrimaryKeySelective(StudentSubject record);

    int updateByPrimaryKey(StudentSubject record);
}