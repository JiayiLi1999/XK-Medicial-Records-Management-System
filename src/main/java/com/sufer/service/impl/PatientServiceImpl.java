package com.sufer.service.impl;

import com.sufer.mapper.PatientMapper;
import com.sufer.pojo.Patient;
import com.sufer.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author danger
 * @date 2020/6/1 - 14:14
 */

@Service("PatientService")
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientMapper patientMapper;

    @Override
    public int addPatient(Patient patient) {
        return patientMapper.addPatient(patient);
    }

    @Override
    public Patient selectPatientById(int id) {
        return patientMapper.selectPatientById(id);
    }

    @Override
    public List<Patient> selectPatientByDoctorId(int doctorId) {
        return patientMapper.selectPatientByDoctorId(doctorId);
    }

}
