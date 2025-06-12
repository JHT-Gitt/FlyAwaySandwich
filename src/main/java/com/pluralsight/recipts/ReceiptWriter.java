package com.pluralsight.recipts;

import com.pluralsight.menu.Sandwich;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {
    private static DateTimeFormatter fileNameFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static DateTimeFormatter receiptDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void writeReceipt(String receipt) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);


        String fileName = "src/main/java/Receipt/receipt_" + timestamp + ".txt";

        try (FileWriter writer = new FileWriter(fileName)) { // No append mode — new file each time
            writer.write(receipt);
            writer.write("\n------------------------------\n");
        } catch (IOException e) {
            System.out.println("Error writing to receipt file: " + e.getMessage());
        }

    }

//    public static String writeReceipt(Sandwich sandwich) {
//        LocalDateTime now = LocalDateTime.now();
//        String fileName = "receipt_" + now.format(fileNameFormatter) + ".txt";
//        String receiptContent = String.format("Receipt - %s\n\n%s", now.format(receiptDateFormatter), sandwich.toString());
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
//            writer.write(receiptContent);
//            System.out.println("🧾 Receipt saved as: " + fileName);
//        } catch (IOException e) {
//            System.err.println("Error writing receipt: " + e.getMessage());
//        }
//
//        return fileName;
//    }
//        public static String getFormattedDateTime() {
//            return LocalDateTime.now().format(receiptDateFormatter);
//        }

    }

