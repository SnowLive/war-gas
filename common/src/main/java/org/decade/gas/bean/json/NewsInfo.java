package org.decade.gas.bean.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 * 新闻附加信息
 *
 * @auther: decade
 * @date: 18-1-1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsInfo {
    private String source;
    private String date;
    private String time;
    private String summary;
}
