package com.sufer.mapper;

import com.sufer.pojo.Patient;
import com.sufer.pojo.Prescription;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PrescriptionMapper
 * @author danger
 * @date 2020/6/1 - 13:36
 */
@Mapper
@Repository

public interface PrescriptionMapper {
    int addPrescription(Prescription prescription);
    List<Prescription> selectPrescriptionByPatientId(int patientId);
}
