package com.xst.mapper.pro;

import com.xst.pro.Protb102;
import com.xst.pro.Protb102Example;
import com.xst.pro.Protb102Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb102Mapper {
    int countByExample(Protb102Example example);

    int deleteByExample(Protb102Example example);

    int deleteByPrimaryKey(Protb102Key key);

    int insert(Protb102 record);

    int insertSelective(Protb102 record);

    List<Protb102> selectByExample(Protb102Example example);

    Protb102 selectByPrimaryKey(Protb102Key key);

    int updateByExampleSelective(@Param("record") Protb102 record, @Param("example") Protb102Example example);

    int updateByExample(@Param("record") Protb102 record, @Param("example") Protb102Example example);

    int updateByPrimaryKeySelective(Protb102 record);

    int updateByPrimaryKey(Protb102 record);
}