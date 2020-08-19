package com.sufer.service;

import com.sufer.pojo.Medicine;

import java.util.List;

/**
 * @author danger
 * @date 2020/6/1 - 14:13
 */
public interface MedicineService {
    List<Medicine> selectMedicineByMedicineName(String medicineName);
}
