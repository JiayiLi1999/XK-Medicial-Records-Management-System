package com.sufer.service;

import com.sufer.pojo.Doctor;

/**
 *
 * @author danger
 * @date 2020/6/1 - 14:12
 */
public interface DoctorService {
    int addDoctor(Doctor doctor);
    Doctor selectDoctorByUserId(Integer userId);

}
