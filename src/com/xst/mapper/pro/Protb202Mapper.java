package com.xst.mapper.pro;

import com.xst.pro.Protb202;
import com.xst.pro.Protb202Example;
import com.xst.pro.Protb202Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb202Mapper {
    int countByExample(Protb202Example example);

    int deleteByExample(Protb202Example example);

    int deleteByPrimaryKey(Protb202Key key);

    int insert(Protb202 record);

    int insertSelective(Protb202 record);

    List<Protb202> selectByExample(Protb202Example example);

    Protb202 selectByPrimaryKey(Protb202Key key);

    int updateByExampleSelective(@Param("record") Protb202 record, @Param("example") Protb202Example example);

    int updateByExample(@Param("record") Protb202 record, @Param("example") Protb202Example example);

    int updateByPrimaryKeySelective(Protb202 record);

    int updateByPrimaryKey(Protb202 record);
}