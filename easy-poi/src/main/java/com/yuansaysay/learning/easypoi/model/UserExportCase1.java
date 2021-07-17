package com.yuansaysay.learning.easypoi.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

/**
 * 用户导出场景1, 导出 id, name, address
 * @author yss<br>
 * @createDate 2021/07/17 16:47
 */
@ExcelTarget("userExportCase1")
public class UserExportCase1 extends UserManageBO{

    @Excel(name = "ID", width = 20)
    private Integer id;

    @Excel(name = "姓名", width = 20)
    private String name;

    @Excel(name = "地址", width = 20)
    private String address;

}
