/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresproject;

/**
 *
 * @author hande
 */
public class BalciDereliSpot {

    int id;
    BalciDereliType type;
    BalciDereliSpot next;
    BalciDereliSpot prev;
    BalciDereliSpot jumpTo;

    public BalciDereliSpot(BalciDereliType type, int id) {
        this.type = type;
        this.id = id;
    }

}
