/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package isa.tcpdemoserver;

import tcpdemoserver.networklayer.TCPServer;

/**
 *
 * @author isabela
 */
public class TCPDemoServer {

    public static void main(String[] args) {
        TCPServer server = new TCPServer(9090); 
        server.start();
    }
}
