package com.sufer.controller;

import com.sufer.pojo.Patient;
import com.sufer.pojo.Prescription;
import com.sufer.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;

/**
 * PrescriptionController
 * @author danger
 * @date 2020/6/1 - 14:30
 */
@Controller
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @RequestMapping("/newPrescription")
    public String newPrescription(
                            @RequestParam(name="doctor_id")Integer doctorId,
                            @RequestParam(name="patient_id")Integer patientId,
                            @RequestParam(name="medicine_name")String medicineName,
                            @RequestParam(name="medicine_id")Integer medicineId,
                            @RequestParam(name="medicine_num")Integer medicineNum,
                            @RequestParam(name="medicine_frequency")String medicineFrequency,
                            @RequestParam(name="medicine_day")Integer medicineDay,
                            @RequestParam(name="medicine_single_price")Double medicineSinglePrice,
                            @RequestParam(name="medicine_total_price")Double medicineTotalPrice,
                            @RequestParam(name="comment")String comment,
                            HttpSession session,
                            Model model, HttpServletResponse response) throws IOException {
        System.out.println("running new_prescription");
        Prescription prescription = new Prescription(0,doctorId,patientId,medicineName,medicineId,medicineNum,medicineFrequency,medicineDay,medicineSinglePrice,medicineTotalPrice,comment);
        System.out.println(prescription);
        int r = prescriptionService.addPrescription(prescription);
        System.out.println("r = " + r);
        model.addAttribute("msg","新建处方成功!");
        return "redirect:/new_prescription";
    }

    @RequestMapping("/selectPrescription")
    public String selectPrescription(
            @RequestParam(name="patient-id")Integer patientId,
            HttpServletRequest request, Model model){

        System.out.println(patientId);
        Collection<Prescription> Prescriptions = prescriptionService.selectPrescriptionByPatientId(patientId);
        model.addAttribute("prescriptions",Prescriptions);



        return "search_prescription";
    }
    
}
