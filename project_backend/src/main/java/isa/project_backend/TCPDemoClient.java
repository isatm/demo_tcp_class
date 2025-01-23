/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isa.project_backend;

import java.util.Scanner;

/**
 *
 * @author isabela
 */
public class TCPDemoClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Tu nombre bro");
        String name = in.nextLine();
        System.out.println("Tu apellido bro");
        String lastName = in.nextLine();
        System.out.println("Name: " + name + ", Last name: "+lastName);
    }
}
