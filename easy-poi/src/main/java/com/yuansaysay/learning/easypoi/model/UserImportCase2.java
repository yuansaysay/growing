package com.yuansaysay.learning.easypoi.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 导出 id, name, address, salary
 * @author yss<br>
 * @createDate 2021/07/17 16:47
 */
public class UserImportCase2 extends UserManageBO{

    @Excel(name = "ID", width = 20)
    private Integer id;

    @Excel(name = "姓名", width = 20)
    private String name;

    @Excel(name = "地址", width = 20)
    private String address;

    @Excel(name = "工资", width = 20)
    private String salary;

}
