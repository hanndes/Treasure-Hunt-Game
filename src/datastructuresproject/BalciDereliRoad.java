/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresproject;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author hande
 */
public class BalciDereliRoad { //LinkedList

    BalciDereliSpot head;
    BalciDereliSpot tail;
    BalciDereliType[] types = {new BalciDereliTreasure(), new BalciDereliTrap(), new BalciDereliEmpty(), new BalciDereliMoveForeward(), new BalciDereliMoveBackward()};
    Random random;

    public BalciDereliRoad createLevel1() {
        random = new Random();

        for (int i = 1; i < 31; i++) {
            BalciDereliType randomType = types[random.nextInt(3)];
            BalciDereliSpot newSpot = new BalciDereliSpot(randomType, i);
          //  System.out.println("id: " + i); // SILINECEK
            if (head == null) {
                head = tail = newSpot;
            } else {
                tail.next = newSpot;
                newSpot.prev = tail;
                tail = newSpot;
            }
        }
        return this;
    }

    public BalciDereliRoad createLevel2() {
        random = new Random();

        for (int i = 1; i < 31; i++) {
            BalciDereliType randomType = types[random.nextInt(types.length)]; // 0 ve 5 arası 5 dahil degil
            BalciDereliSpot newSpot = new BalciDereliSpot(randomType, i);
            if (head == null) {
                head = tail = newSpot;
            } else {
                tail.next = newSpot;
                newSpot.prev = tail;
                tail = newSpot;
            }
        }

        BalciDereliSpot temp = head;
        while (temp != null) {
            if (temp.type instanceof BalciDereliMoveBackward) {
                BalciDereliMoveBackward type = (BalciDereliMoveBackward) temp.type;
          //      System.out.println("58. ZIPLAMA DEGERİ: " + type.offset);
                BalciDereliSpot jump = temp;
                for (int i = 0; i < type.offset; i++) {
                    if (jump.prev != null) {
                        jump = jump.prev;
                    } else // ilk konumda geriye ısınlanmanın offseti harita dısındaysa oraya gitmez
                    {
                        break;
                    }
                }
                temp.jumpTo = jump;

            } else if (temp.type instanceof BalciDereliMoveForeward) {
                BalciDereliMoveForeward type = (BalciDereliMoveForeward) temp.type;
          //      System.out.println("70. ZIPLAMA DEGERİ: " + type.offset);
                BalciDereliSpot jump = temp;
                for (int i = 0; i < type.offset; i++) {
                    if (jump.next != null) {
                        jump = jump.next;
                    } else {
                        break;
                    }
                }
                temp.jumpTo = jump;
            }
            temp = temp.next;
        }
        return this;
    }

    public void printRoad() {
        BalciDereliSpot current = head;
        while (current != null) {
            System.out.print(current.id + " " + current.type.toString() + " " + current.type.receive + " -> ");
            current = current.next;
        }
    }

    public void renderToLabels(JLabel[] labels) {
        BalciDereliSpot current = head; 
        while (current != null) {
            int index = current.id - 1;
            if (index >= 0 && index < labels.length) {
                labels[index].setIcon(current.type.img);
            }
            current = current.next;
        }
    }
}
