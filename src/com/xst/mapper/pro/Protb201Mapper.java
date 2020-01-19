package com.xst.mapper.pro;

import com.xst.pro.Protb201;
import com.xst.pro.Protb201Example;
import com.xst.pro.Protb201Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb201Mapper {
    int countByExample(Protb201Example example);

    int deleteByExample(Protb201Example example);

    int deleteByPrimaryKey(Protb201Key key);

    int insert(Protb201 record);

    int insertSelective(Protb201 record);

    List<Protb201> selectByExample(Protb201Example example);

    Protb201 selectByPrimaryKey(Protb201Key key);

    int updateByExampleSelective(@Param("record") Protb201 record, @Param("example") Protb201Example example);

    int updateByExample(@Param("record") Protb201 record, @Param("example") Protb201Example example);

    int updateByPrimaryKeySelective(Protb201 record);

    int updateByPrimaryKey(Protb201 record);
}