package com.sufer.service.impl;

import com.sufer.mapper.MedicineMapper;
import com.sufer.pojo.Medicine;
import com.sufer.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author danger
 * @date 2020/6/1 - 14:14
 */

@Service("MedicineService")
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    private MedicineMapper medicineMapper;

    @Override
    public List<Medicine> selectMedicineByMedicineName(String medicineName) {
        return medicineMapper.selectMedicineByMedicineName(medicineName);
    }

}
