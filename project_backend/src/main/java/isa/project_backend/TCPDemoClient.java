/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isa.project_backend;

import isa.project_backend.networklayer.TCPClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isabela
 */
public class TCPDemoClient {
    public static void main(String[] args) {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream(new File("configuration")));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TCPDemoClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TCPDemoClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sslRoute = p.getProperty("SSL_CERTIFICATE_ROUTE");
        String sslPassword = p.getProperty("SSL_PASSWORD");
        System.setProperty("javax.net.ssl.keyStore",sslRoute);
        System.setProperty("javax.net.ssl.keyStorePassword",sslPassword);
        System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
        System.setProperty("javax.net.ssl.trustStore", sslRoute);
        System.setProperty("javax.net.ssl.trustStorePassword", sslPassword);
        System.setProperty("javax.net.ssl.trustStoreType", "PKCS12");
        Scanner in = new Scanner(System.in);
        System.out.println("Tu nombre bro");
        String name = in.nextLine();
        System.out.println("Tu apellido bro");
        String lastName = in.nextLine();
        
        TCPClient client = new TCPClient( "172.24.157.33",9090);
        client.sendMessage(name, lastName);
    }
}
