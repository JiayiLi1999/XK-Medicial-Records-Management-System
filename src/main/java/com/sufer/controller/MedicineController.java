package com.sufer.controller;

import com.sufer.pojo.Medicine;
import com.sufer.pojo.Patient;
import com.sufer.service.MedicineService;
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
 * PatientController
 * @author danger
 * @date 2020/6/1 - 14:30
 */
@Controller
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @RequestMapping("/selectMedicine")
    public String selectMedicine(HttpServletRequest request, Model model){

        String MedicineName = request.getParameter("medicine-name");

        if (!MedicineName.isEmpty()){
            System.out.println(MedicineName);
            Collection<Medicine> medicines = medicineService.selectMedicineByMedicineName(MedicineName);
            model.addAttribute("medicines",medicines);
        }


        return "search_medicine";
    }



}
