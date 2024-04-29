/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapulasi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ContohScanner {
    
    public static void main(String[] args) {
        System.out.print("Masukkan massa: ");
        Scanner input = new Scanner(System.in);
        double massa = input.nextDouble();
        
        
        System.out.println("massa = "+massa);
    }
}
