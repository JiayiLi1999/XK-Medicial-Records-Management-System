package com.sufer.controller;

import com.sufer.pojo.Record;
import com.sufer.pojo.Patient;
import com.sufer.service.RecordService;
import com.sufer.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * RecordController
 * @author danger
 * @date 2020/6/1 - 14:30
 */
@Controller
public class RecordController {

    @Autowired
    private RecordService recordService;

    @Autowired
    private  PatientService patientService;

    @RequestMapping("/newRecord")
    public String newRecord(@RequestParam(name="patient_id")Integer patientId,
                            @RequestParam(name="doctor_id",required = false)Integer doctorId,
                            @RequestParam(name="body_temperature",required = false)Double bodyTemperature,
                            @RequestParam(name="breath",required = false)Integer breath,
                            @RequestParam(name="pulse",required = false)Integer pulse,
                            @RequestParam(name="blood_pressure_high",required = false)Integer bloodPressureHigh,
                            @RequestParam(name="blood_pressure_low",required = false)Integer bloodPressureLow,
                            @RequestParam(name="blood_glucose",required = false)Integer bloodGlucose,
                            @RequestParam(name="blood_fat",required = false)Integer bloodFat,
                            @RequestParam(name="diseases_classification")String diseasesClassification,
                            @RequestParam(name="symptom")String symptom,
                            @RequestParam(name="onset")String onset,
                            @RequestParam(name="is_infectious")String isInfectious,
                            @RequestParam(name="chief_complaint")String chiefComplaint,
                            @RequestParam(name="present_illness")String presentIllness,
                            @RequestParam(name="past_illness")String pastIllness,
                            @RequestParam(name="personal_illness")String personalIllness,
                            @RequestParam(name="family_illness")String familyIllness,
                            @RequestParam(name="diagnose")String diagnose,
                            @RequestParam(name="doctor_advice")String doctorAdvice,
                            HttpSession session,
                            Model model, HttpServletResponse response) throws IOException {
        System.out.println("running new_record");
        Record record = new Record(0,patientId,doctorId,bodyTemperature,breath,pulse,bloodPressureHigh,bloodPressureLow,bloodGlucose,bloodFat,diseasesClassification,symptom,onset,isInfectious,chiefComplaint,presentIllness,pastIllness,personalIllness,familyIllness,diagnose,doctorAdvice);
        System.out.println(record);
        int r = recordService.addRecord(record);
        System.out.println("r = " + r);
        model.addAttribute("msg","新建病例成功!");
        return "redirect:/new_record";
    }

    @RequestMapping("/newRecords")
    public String newRecords(Model model){

        return "new_record";
    }
}
