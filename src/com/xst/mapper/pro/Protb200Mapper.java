package com.xst.mapper.pro;

import com.xst.pro.Protb200;
import com.xst.pro.Protb200Example;
import com.xst.pro.Protb200Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb200Mapper {
    int countByExample(Protb200Example example);

    int deleteByExample(Protb200Example example);

    int deleteByPrimaryKey(Protb200Key key);

    int insert(Protb200 record);

    int insertSelective(Protb200 record);

    List<Protb200> selectByExample(Protb200Example example);

    Protb200 selectByPrimaryKey(Protb200Key key);

    int updateByExampleSelective(@Param("record") Protb200 record, @Param("example") Protb200Example example);

    int updateByExample(@Param("record") Protb200 record, @Param("example") Protb200Example example);

    int updateByPrimaryKeySelective(Protb200 record);

    int updateByPrimaryKey(Protb200 record);
}