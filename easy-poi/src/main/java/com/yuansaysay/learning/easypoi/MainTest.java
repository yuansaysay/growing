package com.yuansaysay.learning.easypoi;

import com.yuansaysay.learning.easypoi.model.UserExportCase1;
import com.yuansaysay.learning.easypoi.model.UserImportCase2;
import com.yuansaysay.learning.easypoi.model.UserManageBO;
import com.yuansaysay.learning.easypoi.utils.EasyPoiUtil;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yss<br>
 * @createDate 2021/07/17 16:50
 */
public class MainTest {


    public static void main(String[] args) throws IOException {

        // 1. 业务数据准备，准备要导出的数据
        List<UserManageBO> users = getUserBizData();

        // 2.场景1：普通导出
        FileOutputStream fileOutputStream1 = new FileOutputStream(new File("D://普通导出.xlsx"));
        Workbook workbook1 = EasyPoiUtil.createDefaultWorkbook(users, UserExportCase1.class, "用户信息");
        workbook1.write(fileOutputStream1);

        List<UserManageBO> users2 = getUserBizData();
        // 3.场景2：隐私导出
        FileOutputStream fileOutputStream2 = new FileOutputStream(new File("D://隐私导出.xlsx"));
        Workbook workbook2 = EasyPoiUtil.createDefaultWorkbook(users2, UserImportCase2.class, "用户信息");
        workbook2.write(fileOutputStream2);

    }

    private static List<UserManageBO> getUserBizData() {
        List<UserManageBO> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserManageBO userManageBO = new UserManageBO();
            userManageBO.setId(i);
            userManageBO.setName("name: " + i);
            userManageBO.setAddress("address: " + i);
            userManageBO.setSalary(i + "个亿");

            users.add(userManageBO);
        }
        return users;
    }
}
