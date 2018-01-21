package org.decade.gas.bean.json;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-1
 */
@Data
@NoArgsConstructor
public class PageBean<T> implements Serializable {
    private int current;/*当前页*/
    private int total;/*item总数*/
    private int size;/*每页item数*/
    private List<T> data;/*数据列表*/

    public PageBean(int currentPage, int total, int size, List<T> data) {
        this.current = currentPage;
        this.total = total;
        this.size = size;
        this.data = data;
    }
}
