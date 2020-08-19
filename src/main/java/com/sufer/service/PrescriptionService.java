package com.sufer.service;

import com.sufer.pojo.Patient;
import com.sufer.pojo.Prescription;

import java.util.List;

/**
 * @author danger
 * @date 2020/6/1 - 14:13
 */
public interface PrescriptionService {
    int addPrescription(Prescription prescription);
    List<Prescription> selectPrescriptionByPatientId(int patientId);
}
