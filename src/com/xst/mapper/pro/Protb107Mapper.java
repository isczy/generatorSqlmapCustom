package com.xst.mapper.pro;

import com.xst.pro.Protb107;
import com.xst.pro.Protb107Example;
import com.xst.pro.Protb107Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb107Mapper {
    int countByExample(Protb107Example example);

    int deleteByExample(Protb107Example example);

    int deleteByPrimaryKey(Protb107Key key);

    int insert(Protb107 record);

    int insertSelective(Protb107 record);

    List<Protb107> selectByExample(Protb107Example example);

    Protb107 selectByPrimaryKey(Protb107Key key);

    int updateByExampleSelective(@Param("record") Protb107 record, @Param("example") Protb107Example example);

    int updateByExample(@Param("record") Protb107 record, @Param("example") Protb107Example example);

    int updateByPrimaryKeySelective(Protb107 record);

    int updateByPrimaryKey(Protb107 record);
}