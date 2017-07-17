package com.xlw.levyx.mapper.client;

import com.xlw.levyx.mapper.model.BaseStudent;
import com.xlw.levyx.mapper.model.BaseStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseStudentMapper {
    int countByExample(BaseStudentExample example);

    int deleteByExample(BaseStudentExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseStudent record);

    int insertSelective(BaseStudent record);

    List<BaseStudent> selectByExample(BaseStudentExample example);

    BaseStudent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseStudent record, @Param("example") BaseStudentExample example);

    int updateByExample(@Param("record") BaseStudent record, @Param("example") BaseStudentExample example);

    int updateByPrimaryKeySelective(BaseStudent record);

    int updateByPrimaryKey(BaseStudent record);
}