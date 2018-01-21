package org.decade.gas.exception;

import org.decade.gas.enums.QuestionsEnum;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-6
 */

public class QuestionException extends BaseException {

    public QuestionException(QuestionsEnum en) {
        super(en.getCode(), en.getMsg());
    }


    public QuestionException(int code, String msg) {
        super(code, msg);
    }
}
