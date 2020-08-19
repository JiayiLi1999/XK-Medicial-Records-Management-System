package com.sufer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Prescription实体bean
 * @author danger
 * @date 2020/6/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Prescription {

    private Integer prescriptionId;
    private Integer doctorId;
    private Integer patientId;
    private String medicineName;
    private Integer medicineId;
    private Integer medicineNum;
    private String medicineFrequency;
    private Integer medicineDay;
    private Double medicineSinglePrice;
    private Double medicineTotalPrice;
    private String comment;

    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId=" + prescriptionId +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", medicineName=" + medicineName +
                ", medicine=" + medicineId +
                ", medicineNum=" + medicineNum +
                ", medicineFrequency='" + medicineFrequency + '\'' +
                ", medicineDay=" + medicineDay +
                ", medicineSinglePrice=" + medicineSinglePrice +
                ", medicineTotalPrice=" + medicineTotalPrice +
                ", comment='" + comment + '\'' +
                '}';
    }
}
