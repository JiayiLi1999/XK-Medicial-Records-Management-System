package com.sufer.mapper;

import com.sufer.pojo.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * DoctorMapper
 * @author danger
 * @date 2020/6/1 - 13:35
 */
@Mapper
@Repository
public interface DoctorMapper {
    int addDoctor(Doctor doctor);
    Doctor selectDoctorByUserId(Integer userId);
}
