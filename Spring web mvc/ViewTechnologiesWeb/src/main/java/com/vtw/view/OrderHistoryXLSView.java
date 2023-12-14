package com.vtw.view;

import com.vtw.dto.OrderDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import java.util.List;
import java.util.Map;

public class OrderHistoryXLSView extends AbstractXlsView {
    @Override
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Sheet sheet = null;
        Row headerRow = null;
        List<OrderDto> orders = null;

        sheet = workbook.createSheet("Order History");
        headerRow = sheet.createRow(1);

        Cell cell1 = headerRow.createCell(1);
        cell1.setCellValue("orderNo");

        Cell cell2 = headerRow.createCell(2);
        cell2.setCellValue("ordered date");

        Cell cell3 = headerRow.createCell(3);
        cell3.setCellValue("Description");

        Cell cell4 = headerRow.createCell(4);
        cell4.setCellValue("amount");

        Cell cell5 = headerRow.createCell(5);
        cell5.setCellValue("status");

        orders = (List<OrderDto>) model.get("orderlist");
        for (int i=0;i< orders.size();i++) {
            OrderDto orderDto  = orders.get(i);
            Row row = sheet.createRow(i+2);//i=1 & 1 row is header row so started with i+1
            cell1 = row.createCell(1);
            cell1.setCellValue(orderDto.getOrderNo());
            cell2 = row.createCell(2);
            cell2.setCellValue(orderDto.getOrderedDate());
            cell3 = row.createCell(3);
            cell3.setCellValue(orderDto.getDescription());
            cell4 = row.createCell(4);
            cell4.setCellValue(orderDto.getAmount());
            cell5 = row.createCell(5);
            cell5.setCellValue(orderDto.getStatus());
        }

    }
}
