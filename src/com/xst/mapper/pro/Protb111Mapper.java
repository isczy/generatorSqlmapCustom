package com.xst.mapper.pro;

import com.xst.pro.Protb111;
import com.xst.pro.Protb111Example;
import com.xst.pro.Protb111Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb111Mapper {
    int countByExample(Protb111Example example);

    int deleteByExample(Protb111Example example);

    int deleteByPrimaryKey(Protb111Key key);

    int insert(Protb111 record);

    int insertSelective(Protb111 record);

    List<Protb111> selectByExample(Protb111Example example);

    Protb111 selectByPrimaryKey(Protb111Key key);

    int updateByExampleSelective(@Param("record") Protb111 record, @Param("example") Protb111Example example);

    int updateByExample(@Param("record") Protb111 record, @Param("example") Protb111Example example);

    int updateByPrimaryKeySelective(Protb111 record);

    int updateByPrimaryKey(Protb111 record);
}