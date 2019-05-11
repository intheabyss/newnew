package com.shop.dao;

import com.shop.domain.Other;
import com.shop.domain.OtherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtherMapper {
    int countByExample(OtherExample example);

    int deleteByExample(OtherExample example);

    int deleteByPrimaryKey(String one);

    int insert(Other record);

    int insertSelective(Other record);

    List<Other> selectByExample(OtherExample example);

    Other selectByPrimaryKey(String one);

    int updateByExampleSelective(@Param("record") Other record, @Param("example") OtherExample example);

    int updateByExample(@Param("record") Other record, @Param("example") OtherExample example);

    int updateByPrimaryKeySelective(Other record);

    int updateByPrimaryKey(Other record);
}