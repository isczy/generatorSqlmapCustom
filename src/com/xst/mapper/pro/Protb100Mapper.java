package com.xst.mapper.pro;

import com.xst.pro.Protb100;
import com.xst.pro.Protb100Example;
import com.xst.pro.Protb100Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb100Mapper {
    int countByExample(Protb100Example example);

    int deleteByExample(Protb100Example example);

    int deleteByPrimaryKey(Protb100Key key);

    int insert(Protb100 record);

    int insertSelective(Protb100 record);

    List<Protb100> selectByExample(Protb100Example example);

    Protb100 selectByPrimaryKey(Protb100Key key);

    int updateByExampleSelective(@Param("record") Protb100 record, @Param("example") Protb100Example example);

    int updateByExample(@Param("record") Protb100 record, @Param("example") Protb100Example example);

    int updateByPrimaryKeySelective(Protb100 record);

    int updateByPrimaryKey(Protb100 record);
}