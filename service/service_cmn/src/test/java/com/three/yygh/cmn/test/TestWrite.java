package com.three.yygh.cmn.test;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author three
 * @date 2022-07-23 20:07
 */
public class TestWrite {
    public static void main(String[] args) {
        List<UserDate> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserDate userDate = new UserDate();
            userDate.setUid(i);
            userDate.setUsername("lucy" + i);
            list.add(userDate);
        }

        String fileName = "D:\\01.xlsx";
        EasyExcel.write(fileName,UserDate.class).sheet("用户信息")
                .doWrite(list);
    }
}
