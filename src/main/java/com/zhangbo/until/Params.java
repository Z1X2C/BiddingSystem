package com.zhangbo.until;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Params {
    private  String checkcode;
    private  String newpass;
    private String userPhone;
    private String userType;
    private String userEmail;
    private String userName;
}
