package com.xst.mapper.pro;

import com.xst.pro.Protb203;
import com.xst.pro.Protb203Example;
import com.xst.pro.Protb203Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb203Mapper {
    int countByExample(Protb203Example example);

    int deleteByExample(Protb203Example example);

    int deleteByPrimaryKey(Protb203Key key);

    int insert(Protb203 record);

    int insertSelective(Protb203 record);

    List<Protb203> selectByExample(Protb203Example example);

    Protb203 selectByPrimaryKey(Protb203Key key);

    int updateByExampleSelective(@Param("record") Protb203 record, @Param("example") Protb203Example example);

    int updateByExample(@Param("record") Protb203 record, @Param("example") Protb203Example example);

    int updateByPrimaryKeySelective(Protb203 record);

    int updateByPrimaryKey(Protb203 record);
}