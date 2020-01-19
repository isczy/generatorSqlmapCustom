package com.xst.mapper.pro;

import com.xst.pro.Protb113;
import com.xst.pro.Protb113Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb113Mapper {
    int countByExample(Protb113Example example);

    int deleteByExample(Protb113Example example);

    int deleteByPrimaryKey(String protb113id);

    int insert(Protb113 record);

    int insertSelective(Protb113 record);

    List<Protb113> selectByExample(Protb113Example example);

    Protb113 selectByPrimaryKey(String protb113id);

    int updateByExampleSelective(@Param("record") Protb113 record, @Param("example") Protb113Example example);

    int updateByExample(@Param("record") Protb113 record, @Param("example") Protb113Example example);

    int updateByPrimaryKeySelective(Protb113 record);

    int updateByPrimaryKey(Protb113 record);
}