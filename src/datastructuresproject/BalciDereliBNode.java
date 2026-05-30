/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresproject;

/**
 *
 * @author hande
 */
public class BalciDereliBNode {

    String playerName;
    int level;
    int score;
    BalciDereliBNode left;
    BalciDereliBNode right;

    public BalciDereliBNode(String playerName, int level, int score) {
        this.score = score;
        this.playerName = playerName;
        this.level = level;
    }

  
}

