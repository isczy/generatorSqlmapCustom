package com.xst.mapper.pro;

import com.xst.pro.Protb114;
import com.xst.pro.Protb114Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb114Mapper {
    int countByExample(Protb114Example example);

    int deleteByExample(Protb114Example example);

    int deleteByPrimaryKey(String protb114id);

    int insert(Protb114 record);

    int insertSelective(Protb114 record);

    List<Protb114> selectByExample(Protb114Example example);

    Protb114 selectByPrimaryKey(String protb114id);

    int updateByExampleSelective(@Param("record") Protb114 record, @Param("example") Protb114Example example);

    int updateByExample(@Param("record") Protb114 record, @Param("example") Protb114Example example);

    int updateByPrimaryKeySelective(Protb114 record);

    int updateByPrimaryKey(Protb114 record);
}