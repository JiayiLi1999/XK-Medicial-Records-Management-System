package com.sufer.service;

import com.sufer.pojo.Patient;

import java.util.List;

/**
 * @author danger
 * @date 2020/6/1 - 14:13
 */
public interface PatientService {
    int addPatient(Patient patient);

    Patient selectPatientById(int id);

    List<Patient> selectPatientByDoctorId(int doctorId);
}
