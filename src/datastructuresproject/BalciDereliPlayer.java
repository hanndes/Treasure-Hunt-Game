/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresproject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author hande
 */
public class BalciDereliPlayer {

    String name;
    int score;
    BalciDereliSpot location;
    int level;

    public BalciDereliPlayer(String name) {
        this.name = name;
    }

    public void move(int dice, BalciDereliSpot head, JLabel[] labels) { // head ilk lokasyon için atılıyor
        System.out.println("");
        System.out.println("Zar: " + dice);
        if (location == null) { //ilk konum icin
            location = head;
            dice--;
        }
        for (int i = 0; i < dice && location.next != null; i++) { // 26 - 27 - 28 - 29 - 30 30 nexti null çıktı TEK TEK GIDERSE
            location = location.next;
        }
        score += location.type.receive; //KONUMUN PUANI
        System.out.println(location.type + " Yeni konum: " + (location.id) + ", Skor: " + score); //PUAN ALDIKTAN SONRA YAZDIR
        int counter = 0;
        while ((location.type instanceof BalciDereliMoveBackward) || (location.type instanceof BalciDereliMoveForeward)) {
            labels[location.id - 1].setIcon(null);
            location.type = new BalciDereliEmpty(); //atlamadan once empty
        //    System.out.println(location.jumpTo);
            location = location.jumpTo;
            score += location.type.receive;
            System.out.println("Isınlanma Yeni konum: " + (location.id) + ", Skor: " + score);
         //   location.type = new BalciDereliEmpty(); // offset değerleri aynıysa sonsuz donguden çıkabilmek için spot type empty yazpıldı.
        //   System.out.println("44." + location.type.toString());
            location.type.img = null;
        }
        location.type = new BalciDereliEmpty();
    }

    public int levelInfo(JFrame fr) {
        return JOptionPane.showOptionDialog(
                fr,
                "Tebrikler " + this.name + "! Level tamamlandı.\nSkorun: " + this.score + "\nLevel 2'ye geçmek ister misin?",
                "Level 1 Bitti",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Evet", "Hayır, Ana Menüye Dön"},
                "Evet"
        );

    }

    @Override
    public String toString() {
        return "Player's name: " + this.name + ", Score: " + this.score;
    }

}
