package com.vtw.view;

import com.lowagie.text.Table;
import com.vtw.dto.OrderDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import java.util.List;
import java.util.Map;

public class OrderHistoryPDFView extends AbstractPdfView {
    @Override
    protected void buildPdfDocument(Map<String, Object> model, com.lowagie.text.Document document, com.lowagie.text.pdf.PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<OrderDto> orderDtos = null;
        final Table table = new Table(5);

        orderDtos = (List<OrderDto>) model.get("orderlist");
        table.addCell("order no");
        table.addCell("ordered date");
        table.addCell("description");
        table.addCell("amount");
        table.addCell("status");

        for(int i=0;i< orderDtos.size();i++){
            OrderDto dto = orderDtos.get(i);
            table.addCell(dto.getOrderNo());
            table.addCell(String.valueOf(dto.getOrderedDate()));
            table.addCell(dto.getDescription());
            table.addCell(String.valueOf(dto.getAmount()));
            table.addCell(dto.getStatus());
        }

        document.add(table);
    }
}