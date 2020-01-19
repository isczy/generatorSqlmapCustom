package com.xst.mapper.pro;

import com.xst.pro.Protb103;
import com.xst.pro.Protb103Example;
import com.xst.pro.Protb103Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb103Mapper {
    int countByExample(Protb103Example example);

    int deleteByExample(Protb103Example example);

    int deleteByPrimaryKey(Protb103Key key);

    int insert(Protb103 record);

    int insertSelective(Protb103 record);

    List<Protb103> selectByExample(Protb103Example example);

    Protb103 selectByPrimaryKey(Protb103Key key);

    int updateByExampleSelective(@Param("record") Protb103 record, @Param("example") Protb103Example example);

    int updateByExample(@Param("record") Protb103 record, @Param("example") Protb103Example example);

    int updateByPrimaryKeySelective(Protb103 record);

    int updateByPrimaryKey(Protb103 record);
}