package com.sufer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Medicine实体bean
 * @author danger
 * @date 2020/6/8
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Medicine {

    private Integer medicineId;
    private String medicineName;
    private String medicineType;
    private String medicineForm;
    private String usage;
    private Integer inventory;
    private Double price;
    private String comment;

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineId=" + medicineId +
                ", medicineName='" + medicineName + '\'' +
                ", medicineType='" + medicineType + '\'' +
                ", medicineForm='" + medicineForm + '\'' +
                ", usage='" + usage + '\'' +
                ", inventory=" + inventory +
                ", price=" + price +
                ", comment='" + comment + '\'' +
                '}';
    }
}
