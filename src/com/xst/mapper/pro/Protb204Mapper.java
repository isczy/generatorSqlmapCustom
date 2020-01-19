package com.xst.mapper.pro;

import com.xst.pro.Protb204;
import com.xst.pro.Protb204Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb204Mapper {
    int countByExample(Protb204Example example);

    int deleteByExample(Protb204Example example);

    int deleteByPrimaryKey(String protb204id);

    int insert(Protb204 record);

    int insertSelective(Protb204 record);

    List<Protb204> selectByExample(Protb204Example example);

    Protb204 selectByPrimaryKey(String protb204id);

    int updateByExampleSelective(@Param("record") Protb204 record, @Param("example") Protb204Example example);

    int updateByExample(@Param("record") Protb204 record, @Param("example") Protb204Example example);

    int updateByPrimaryKeySelective(Protb204 record);

    int updateByPrimaryKey(Protb204 record);
}