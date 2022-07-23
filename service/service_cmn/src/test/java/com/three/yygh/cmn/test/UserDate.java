package com.three.yygh.cmn.test;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author three
 * @date 2022-07-23 20:05
 */
@Data
public class UserDate {
    @ExcelProperty(value = "用户编号",index = 0)
    private int uid;

    @ExcelProperty(value = "用户名称",index = 1)
    private String username;
}
