package com.sufer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Doctor实体bean
 * @author danger
 * @date 2020/6/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Doctor {
    private int doctorId;
    private String doctorName;
    private String gender;
    private String birthday;
    private String education;
    private double mark;
    private String address;
    private String hospitalName;
    private String phoneNumber;
    private String email;
    private String position;
    private String office;
    private String webPage;
    private String introduction;
    private User user;

}
