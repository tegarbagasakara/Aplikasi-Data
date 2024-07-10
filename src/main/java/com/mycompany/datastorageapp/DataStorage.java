/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.datastorageapp;

/**
 *
 * @author Kidoo
 */
// Interface untuk membaca dan menulis data
public interface DataStorage {
    void writeData(String data);
    String readData();
}

