package com.xst.mapper.pro;

import com.xst.pro.Protb108;
import com.xst.pro.Protb108Example;
import com.xst.pro.Protb108Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Protb108Mapper {
    int countByExample(Protb108Example example);

    int deleteByExample(Protb108Example example);

    int deleteByPrimaryKey(Protb108Key key);

    int insert(Protb108 record);

    int insertSelective(Protb108 record);

    List<Protb108> selectByExample(Protb108Example example);

    Protb108 selectByPrimaryKey(Protb108Key key);

    int updateByExampleSelective(@Param("record") Protb108 record, @Param("example") Protb108Example example);

    int updateByExample(@Param("record") Protb108 record, @Param("example") Protb108Example example);

    int updateByPrimaryKeySelective(Protb108 record);

    int updateByPrimaryKey(Protb108 record);
}