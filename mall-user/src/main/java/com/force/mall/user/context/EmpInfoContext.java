package com.force.mall.user.context;

import com.force.mall.user.pojo.EmployeeUserInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 褚江江
 * @date 2019-07-08
 */
@Data
public class EmpInfoContext implements Serializable {

    private static final long serialVersionUID = -1697478956889665586L;

    private int code;
    private String msg;
    private int count;
    private List<EmployeeUserInfo> data;

}
