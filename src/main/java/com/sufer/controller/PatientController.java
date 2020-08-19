package com.sufer.controller;

import com.sufer.pojo.Patient;
import com.sufer.service.PatientService;
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
import java.util.List;

/**
 * PatientController
 * @author danger
 * @date 2020/6/1 - 14:30
 */
@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping("/selectPatient")
    public String selectPatient(HttpServletRequest request, Model model){

        String doctorId = request.getParameter("doctor-id");

        if (!doctorId.isEmpty()){
            Collection<Patient> patients = patientService.selectPatientByDoctorId(Integer.parseInt(doctorId));
            model.addAttribute("patients",patients);
        }


        return "search_personalInfo";
    }

    @RequestMapping("/newPatient")
    public String newPatient(@RequestParam(name="patient_name")String patientName,
                             @RequestParam(name="doctor_id")Integer doctorId,
                             @RequestParam(name="gender")String gender,
                             @RequestParam(name="age")Integer age,
                             @RequestParam(name="contact")String contact,
                             @RequestParam(name="IDcard_No")String IDCardNo,
                             @RequestParam(name="city")String addressCity,
                             @RequestParam(name="district")String addressDistrict,
                             @RequestParam(name="street")String addressStreet,
                             @RequestParam(name="related_name")String relatedName,
                             @RequestParam(name="related_phonenumber")String relatedPhoneNumber,
                             @RequestParam(name="height")Double height,
                             @RequestParam(name="weight")Integer weight,
                             HttpSession session,
                             Model model, HttpServletResponse response) throws IOException {
        System.out.println("running new_record");
        Patient patient = new Patient(0,patientName,doctorId,gender,age,contact,IDCardNo,addressCity,addressDistrict,addressStreet,relatedName,relatedPhoneNumber,height,weight);
        System.out.println(patient);
        int p = patientService.addPatient(patient);
        System.out.println("p = " + p);
        model.addAttribute("msg","新建病例成功!");
        return "redirect:/new_patient";
    }



}
