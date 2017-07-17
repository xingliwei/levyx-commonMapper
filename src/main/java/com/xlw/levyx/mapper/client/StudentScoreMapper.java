package com.xlw.levyx.mapper.client;

import com.xlw.levyx.mapper.model.StudentScore;
import com.xlw.levyx.mapper.model.StudentScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentScoreMapper {
    int countByExample(StudentScoreExample example);

    int deleteByExample(StudentScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentScore record);

    int insertSelective(StudentScore record);

    List<StudentScore> selectByExample(StudentScoreExample example);

    StudentScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentScore record, @Param("example") StudentScoreExample example);

    int updateByExample(@Param("record") StudentScore record, @Param("example") StudentScoreExample example);

    int updateByPrimaryKeySelective(StudentScore record);

    int updateByPrimaryKey(StudentScore record);
}