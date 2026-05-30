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
public class BalciDereliTrap extends BalciDereliType{

    public BalciDereliTrap() {
        super(-5,new ImageIcon(BalciDereliTrap.class.getResource("/datastructuresproject/images/trap.png")));
    }

    @Override
    public String toString() {
        return "Trap";
    }
}
