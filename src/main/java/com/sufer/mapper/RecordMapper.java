package com.sufer.mapper;

import com.sufer.pojo.Record;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * RecordMapper
 * @author danger
 * @date 2020/6/1 - 13:36
 */
@Mapper
@Repository

public interface RecordMapper {
    int addRecord(Record record);
}
