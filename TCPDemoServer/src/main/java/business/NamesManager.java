/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author isabela
 */
public class NamesManager {
    public String generateMessage(String name, String lastname){
    StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name)
        .append(" last Name: ").append(lastname);
    
    return sb.toString();
    }
}
