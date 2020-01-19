package com.xst.mapper.pro;

import com.xst.pro.Protb104;
import com.xst.pro.Protb104Example;
import com.xst.pro.Protb104Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb104Mapper {
    int countByExample(Protb104Example example);

    int deleteByExample(Protb104Example example);

    int deleteByPrimaryKey(Protb104Key key);

    int insert(Protb104 record);

    int insertSelective(Protb104 record);

    List<Protb104> selectByExample(Protb104Example example);

    Protb104 selectByPrimaryKey(Protb104Key key);

    int updateByExampleSelective(@Param("record") Protb104 record, @Param("example") Protb104Example example);

    int updateByExample(@Param("record") Protb104 record, @Param("example") Protb104Example example);

    int updateByPrimaryKeySelective(Protb104 record);

    int updateByPrimaryKey(Protb104 record);
}