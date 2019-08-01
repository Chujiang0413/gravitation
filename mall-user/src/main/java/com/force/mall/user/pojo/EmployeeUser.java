package com.force.mall.user.pojo;

import lombok.Data;

import java.io.Serializable;
/**
 * @author 褚江江
 * @date 2019-07-05
 */
@Data
public class EmployeeUser implements Serializable {

    Long   empId;
    String empUsername;
    String empPassword;
    String submissionDate;
}
