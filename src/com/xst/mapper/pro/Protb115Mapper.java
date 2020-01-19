package com.xst.mapper.pro;

import com.xst.pro.Protb115;
import com.xst.pro.Protb115Example;
import com.xst.pro.Protb115Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb115Mapper {
    int countByExample(Protb115Example example);

    int deleteByExample(Protb115Example example);

    int deleteByPrimaryKey(Protb115Key key);

    int insert(Protb115 record);

    int insertSelective(Protb115 record);

    List<Protb115> selectByExample(Protb115Example example);

    Protb115 selectByPrimaryKey(Protb115Key key);

    int updateByExampleSelective(@Param("record") Protb115 record, @Param("example") Protb115Example example);

    int updateByExample(@Param("record") Protb115 record, @Param("example") Protb115Example example);

    int updateByPrimaryKeySelective(Protb115 record);

    int updateByPrimaryKey(Protb115 record);
}