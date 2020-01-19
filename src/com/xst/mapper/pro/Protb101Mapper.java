package com.xst.mapper.pro;

import com.xst.pro.Protb101;
import com.xst.pro.Protb101Example;
import com.xst.pro.Protb101Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb101Mapper {
    int countByExample(Protb101Example example);

    int deleteByExample(Protb101Example example);

    int deleteByPrimaryKey(Protb101Key key);

    int insert(Protb101 record);

    int insertSelective(Protb101 record);

    List<Protb101> selectByExample(Protb101Example example);

    Protb101 selectByPrimaryKey(Protb101Key key);

    int updateByExampleSelective(@Param("record") Protb101 record, @Param("example") Protb101Example example);

    int updateByExample(@Param("record") Protb101 record, @Param("example") Protb101Example example);

    int updateByPrimaryKeySelective(Protb101 record);

    int updateByPrimaryKey(Protb101 record);
}