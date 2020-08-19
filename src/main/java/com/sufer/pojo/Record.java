package com.sufer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Record实体bean
 * @author danger
 * @date 2020/6/8
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    private int recordId;
    private int patientId;
    private int doctorId;
    private double bodyTemperature;
    private int breath;
    private int pulse;
    private int bloodPressureHigh;
    private int bloodPressureLow;
    private int bloodGlucose;
    private int bloodFat;
    private String diseasesClassification;
    private String symptom;
    private String onset;
    private String isInfectious;
    private String chiefComplaint;
    private String presentIllness;
    private String pastIllness;
    private String personalIllness;
    private String familyIllness;
    private String diagnose;
    private String doctorAdvice;


    @Override
    public String toString() {
        return "Record{" +
                "recordId=" + recordId +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", bodyTemperature=" + bodyTemperature +
                ", breath=" + breath +
                ", pulse=" + pulse +
                ", bloodPressureHigh=" + bloodPressureHigh +
                ", bloodPressureLow=" + bloodPressureLow +
                ", bloodGlucose=" + bloodGlucose +
                ", bloodFat=" + bloodFat +
                ", diseasesClassification='" + diseasesClassification + '\'' +
                ", symptom='" + symptom + '\'' +
                ", onset=" + onset +
                ", isInfectious=" + isInfectious +
                ", chiefComplaint='" + chiefComplaint + '\'' +
                ", presentIllness='" + presentIllness + '\'' +
                ", pastIllness='" + pastIllness + '\'' +
                ", personalIllness='" + personalIllness + '\'' +
                ", familyIllness='" + familyIllness + '\'' +
                ", diagnose='" + diagnose + '\'' +
                ", doctorAdvice='" + doctorAdvice + '\'' +
                '}';
    }
}
