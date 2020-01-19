package com.xst.mapper.pro;

import com.xst.pro.Protb105;
import com.xst.pro.Protb105Example;
import com.xst.pro.Protb105Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb105Mapper {
    int countByExample(Protb105Example example);

    int deleteByExample(Protb105Example example);

    int deleteByPrimaryKey(Protb105Key key);

    int insert(Protb105 record);

    int insertSelective(Protb105 record);

    List<Protb105> selectByExample(Protb105Example example);

    Protb105 selectByPrimaryKey(Protb105Key key);

    int updateByExampleSelective(@Param("record") Protb105 record, @Param("example") Protb105Example example);

    int updateByExample(@Param("record") Protb105 record, @Param("example") Protb105Example example);

    int updateByPrimaryKeySelective(Protb105 record);

    int updateByPrimaryKey(Protb105 record);
}