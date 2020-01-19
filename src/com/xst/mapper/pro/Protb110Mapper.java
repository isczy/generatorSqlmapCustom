package com.xst.mapper.pro;

import com.xst.pro.Protb110;
import com.xst.pro.Protb110Example;
import com.xst.pro.Protb110Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb110Mapper {
    int countByExample(Protb110Example example);

    int deleteByExample(Protb110Example example);

    int deleteByPrimaryKey(Protb110Key key);

    int insert(Protb110 record);

    int insertSelective(Protb110 record);

    List<Protb110> selectByExample(Protb110Example example);

    Protb110 selectByPrimaryKey(Protb110Key key);

    int updateByExampleSelective(@Param("record") Protb110 record, @Param("example") Protb110Example example);

    int updateByExample(@Param("record") Protb110 record, @Param("example") Protb110Example example);

    int updateByPrimaryKeySelective(Protb110 record);

    int updateByPrimaryKey(Protb110 record);
}