package com.yuansaysay.learning.easypoi.utils;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;

/**
 * @author yss<br>
 * @createDate 2021/07/17 16:58
 */
public class EasyPoiUtil {

    /**
     * 默认workbook, 非ExcelType.HSSF格式的
     * @return
     */
    public static Workbook createDefaultWorkbook(List<?> list, Class<?> pojoClass, String sheetName){

        ExportParams exportParams = new ExportParams();
        exportParams.setType(ExcelType.XSSF);
        exportParams.setSheetName(sheetName);

        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, pojoClass, list);

        return workbook;
    }
}
