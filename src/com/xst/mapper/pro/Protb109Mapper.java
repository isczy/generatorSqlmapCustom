package com.xst.mapper.pro;

import com.xst.pro.Protb109;
import com.xst.pro.Protb109Example;
import com.xst.pro.Protb109Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb109Mapper {
    int countByExample(Protb109Example example);

    int deleteByExample(Protb109Example example);

    int deleteByPrimaryKey(Protb109Key key);

    int insert(Protb109 record);

    int insertSelective(Protb109 record);

    List<Protb109> selectByExample(Protb109Example example);

    Protb109 selectByPrimaryKey(Protb109Key key);

    int updateByExampleSelective(@Param("record") Protb109 record, @Param("example") Protb109Example example);

    int updateByExample(@Param("record") Protb109 record, @Param("example") Protb109Example example);

    int updateByPrimaryKeySelective(Protb109 record);

    int updateByPrimaryKey(Protb109 record);
}