package com.sufer.pojo;

/**
 * Hospital实体bean
 * @author danger
 * @date 2020/6/1 - 14:17
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Hospital {
     private Integer hospitalId;
     private String hospitalName;
     private Integer doctorNum;

     @Override
     public String toString() {
          return "Hospital{" +
                  "hospitalId=" + hospitalId +
                  ", hospitalName='" + hospitalName + '\'' +
                  ", doctorNum=" + doctorNum +
                  '}';
     }
}
