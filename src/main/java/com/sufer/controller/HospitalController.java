package com.sufer.controller;

import com.sufer.pojo.Hospital;
import com.sufer.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author danger
 * @date 2020/6/1 - 14:29
 */
@RestController
public class HospitalController {

//    @Autowired
//    private HospitalService hospitalService;
//
//    @GetMapping("/addHospital")
//    public String addHospital(){
//        Hospital hospital = new Hospital(001,"小康诊所",1000);
//        hospitalService.addHospital(hospital);
//        return "ok";
//    }
//
//    @GetMapping("/selectAllHospital")
//    public List<Hospital> selectAllHospital(){
//        List<Hospital> hospitals = hospitalService.selectAllHospital();
//        return hospitals;
//    }
}
