package com.pluralsight.recipts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {
    private static DateTimeFormatter fileNameFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static DateTimeFormatter receiptDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    //builds a full file
    private static String receiptFileName(LocalDateTime orderDate) {
        return  orderDate.format(fileNameFormatter) + "txt";
    }
    public static void writeReceipt(String receiptText) {
        LocalDateTime now = LocalDateTime.now();
        String fileName = receiptFileName(now);
        Path folder = Paths.get("receipts"); // Folder name
        Path fullPath = folder.resolve(fileName);

        try {
            Files.createDirectories(folder); // Ensure "receipts/" folder exists
            Files.write(fullPath, receiptText.getBytes());
            System.out.println("✅ Receipt saved to " + fullPath);
        } catch (IOException e) {
            System.out.println("⚠️ Error writing receipt: " + e.getMessage());
        }
    }

    public static String getFormattedDateTime() {
        return LocalDateTime.now().format(receiptDateFormatter);
    }

}
