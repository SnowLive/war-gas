package org.decade.gas.entity.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 * 网上申报
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeclaresEntity {
    private int id;
    private String declareId;/*申请事件id*/
    private String publicId;/*公众id todo 转为公众实体*/
    private String officialId;/*接受申请职员id todo 转为职员实体*/
    private String departmentId;/*部门id TODO 转为部门实体*/
    private String title;       /*标题*/
    private String info;        /*备注信息*/
    private String declareFile; /*必要申请文件*/
    private String declareTime;/*申请发起时间*/
    private String solvedTime;/*解决时间*/
    private int state;/*状态*/
    private String updateTime;/*更新时间*/
    private String createTime;/*创建时间*/
}
