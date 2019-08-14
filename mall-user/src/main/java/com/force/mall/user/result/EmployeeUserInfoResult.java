package com.force.mall.user.result;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author 褚江江
 * @date 2019-08-07
 */
@Data
public class EmployeeUserInfoResult implements Serializable {


    private static final long serialVersionUID = -1662389968986240514L;

    String code = "0";
    String msg = "success";
    Map<String, Object> data;
}
