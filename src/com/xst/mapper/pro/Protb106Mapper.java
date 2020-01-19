package com.xst.mapper.pro;

import com.xst.pro.Protb106;
import com.xst.pro.Protb106Example;
import com.xst.pro.Protb106Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb106Mapper {
    int countByExample(Protb106Example example);

    int deleteByExample(Protb106Example example);

    int deleteByPrimaryKey(Protb106Key key);

    int insert(Protb106 record);

    int insertSelective(Protb106 record);

    List<Protb106> selectByExample(Protb106Example example);

    Protb106 selectByPrimaryKey(Protb106Key key);

    int updateByExampleSelective(@Param("record") Protb106 record, @Param("example") Protb106Example example);

    int updateByExample(@Param("record") Protb106 record, @Param("example") Protb106Example example);

    int updateByPrimaryKeySelective(Protb106 record);

    int updateByPrimaryKey(Protb106 record);
}