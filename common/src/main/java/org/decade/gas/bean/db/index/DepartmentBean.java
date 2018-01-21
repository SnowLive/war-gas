package org.decade.gas.bean.db.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.decade.gas.bean.json.ContactObj;

/**
 * Class For:
 *  政府部门
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentBean {
    private String departmentId;/*部门id*/
    private String name;        /*部门名称*/
    private String function;    /*职能*/
    private ContactObj contact;     /*联系方式*/
    private String address;     /*地址*/
    private String info;        /*备注信息*/
    private int state;
}
