package com.pluralsight.recipts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {
    private static DateTimeFormatter fileNameFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static DateTimeFormatter receiptDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private String receiptFileName(LocalDateTime orderDate) {
        return  orderDate.format(fileNameFormatter) + "txt";
    }

}
