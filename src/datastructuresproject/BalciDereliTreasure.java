/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresproject;

import javax.swing.ImageIcon;

/**
 *
 * @author hande
 */
public class BalciDereliTreasure extends BalciDereliType{

    public BalciDereliTreasure() {
        super(10,new ImageIcon(BalciDereliTreasure.class.getResource("/datastructuresproject/images/treasure.png")));
    }  

    @Override
    public String toString() {
        return "Treasure"; 
    }
    
}
