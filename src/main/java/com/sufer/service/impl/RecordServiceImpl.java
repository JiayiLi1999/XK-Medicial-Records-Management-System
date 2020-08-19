package com.sufer.service.impl;

import com.sufer.mapper.RecordMapper;
import com.sufer.pojo.Record;
import com.sufer.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author danger
 * @date 2020/6/1 - 14:14
 */

@Service("RecordService")
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;

    @Override
    public int addRecord(Record record) {
        return recordMapper.addRecord(record);
    }

}
