package com.force.mall.user.context;

import com.force.mall.user.pojo.EmployeeInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
/**
 * @author 褚江江
 * @date 2019-07-05
 */
@Data
public class EmpContext implements Serializable {

    private static final long serialVersionUID = -3445867049129756881L;

    private int code;
    private String msg;
    private int count;
    private List<EmployeeInfo> data;


}
