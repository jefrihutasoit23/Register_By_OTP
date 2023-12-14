package com.aplikasi.karyawan;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Config {

public static Integer  EROR_CODE_404 =404;
public  static  String NAME_REQUIRED = "Name is Required.";

    public  static  String ID_REQUIRED = "Id is Required.";

    public  static  String EMPLOYEE_REQUIRED = "Employee is Required.";

    public  static  String EMPLOYEE_NOT_FOUND = "Employee not found.";

    public  static  String REKENING_NOT_FOUND = "Rekening not found.";

    public  static  String SUCCESS = "Success.";

    public String convertDateToString(Date date) {

        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String strDate = dateFormat.format(date);
        return strDate;
    }

}
