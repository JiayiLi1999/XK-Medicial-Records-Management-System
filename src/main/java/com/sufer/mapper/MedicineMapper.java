package com.sufer.mapper;

import com.sufer.pojo.Medicine;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MedicineMapper
 * @author danger
 * @date 2020/6/1 - 13:36
 */
@Mapper
@Repository

public interface MedicineMapper {
    List<Medicine> selectMedicineByMedicineName(String medicineName);
}
