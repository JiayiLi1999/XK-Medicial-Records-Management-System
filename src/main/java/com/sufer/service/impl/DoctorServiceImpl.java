package com.sufer.service.impl;

import com.sufer.mapper.DoctorMapper;
import com.sufer.pojo.Doctor;
import com.sufer.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author danger
 * @date 2020/6/1 - 14:13
 */
@Service("DoctorService")
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public int addDoctor(Doctor doctor) {
        return doctorMapper.addDoctor(doctor);
    }

    @Override
    public Doctor selectDoctorByUserId(Integer userId) {
        return doctorMapper.selectDoctorByUserId(userId);
    }
}
