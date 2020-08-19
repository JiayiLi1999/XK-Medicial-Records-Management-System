package com.sufer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Patient实体bean
 * @author danger
 * @date 2020/6/8
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int patientId;
    private String patientName;
    private int doctorId;
    private String gender;
    private int age;
    private String contact;
    private String IDCardNo;
    private String addressCity;
    private String addressDistrict;
    private String addressStreet;
    private String relatedName;
    private String relatedPhoneNumber;
    private double height;
    private int weight;


    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                ", IDCardNo='" + IDCardNo + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressDistrict='" + addressDistrict + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", relatedName='" + relatedName + '\'' +
                ", relatedPhoneNumber='" + relatedPhoneNumber + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
