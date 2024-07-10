/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastorageapp;

/**
 *
 * @author Kidoo
 */
// Penggunaan dalam aplikasi
public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan MemoryStorage
        DataStorage memoryStorage = new MemoryStorage();
        memoryStorage.writeData("Data stored in memory");
        System.out.println("Memory storage:\n" + memoryStorage.readData());

        // Contoh penggunaan FileStorage
        DataStorage fileStorage = new FileStorage("data.txt");
        fileStorage.writeData("Data stored in file");
        System.out.println("File storage:\n" + fileStorage.readData());

        // Contoh penggunaan DatabaseStorage
        DataStorage databaseStorage = new DatabaseStorage("database.db");
        databaseStorage.writeData("Data stored in database");
        System.out.println("Database storage:\n" + databaseStorage.readData());
    }
}
