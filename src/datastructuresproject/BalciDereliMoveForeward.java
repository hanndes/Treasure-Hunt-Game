/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresproject;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author hande
 */
public class BalciDereliMoveForeward extends BalciDereliType {

    int offset;
    Random random = new Random();

    public BalciDereliMoveForeward() {
        super(0,new ImageIcon(BalciDereliMoveForeward.class.getResource("/datastructuresproject/images/move_foreward.png")));
        this.offset = random.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return "MoveForeward"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
