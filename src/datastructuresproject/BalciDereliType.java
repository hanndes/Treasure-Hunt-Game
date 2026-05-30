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
public abstract class BalciDereliType {
     int receive;
     ImageIcon img;

      public BalciDereliType(int receive) {
        this.receive = receive;
    }

    public BalciDereliType(int receive, ImageIcon img) {
        this.receive = receive;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Type";
    }

    
    
}
