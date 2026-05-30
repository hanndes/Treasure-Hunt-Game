/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresproject;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hande
 */
public class BalciDereliBST {

    BalciDereliBNode root;

    public void insert(String playerName, int level, int score) {
        BalciDereliBNode newNode = new BalciDereliBNode(playerName, level, score);
        System.out.println("19." + level);
        if (root == null) {
            root = newNode;
            return;
        }

        BalciDereliBNode current = root;
        while (current != null) {
            if (score < current.score) {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                }
                current = current.right;
            }
        }

    }

    public void AllTheScores(BalciDereliBNode node, StringBuilder result) { //gelen StringBuiler text i değişir in-order traverse
        if (node == null) {
            return;
        }
        AllTheScores(node.left, result);
        System.out.println("46 BST OYUNCU LEVEL" + node.level);
        result.append(node.score).append(" (level").append(node.level).append("),").append("\n");
        AllTheScores(node.right, result);
    }

    public BalciDereliBNode findMin(BalciDereliBNode node) {
        if (node == null) {
            return null;
        }
        if (node.left == null) {
            return node;
        }
        return findMin(node.left);
    }

    public BalciDereliBNode findMax(BalciDereliBNode node) {
        if (node == null) {
            return null;
        }
        if (node.right == null) {
            return node;
        }
        return findMax(node.right);
    }

    public boolean readScoreFile(String searchPlayerName) {
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("score.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim().toLowerCase();
                    String levelStr = parts[1].trim();
                    int score = Integer.parseInt(parts[2].trim());
                    if (name.equals(searchPlayerName)) {
                        this.insert(name, levelStr.equals("level1") ? 1 : 2, score); // name ile eşleşen satırlardan bstnode oluşturulup ağaç oluşturulacak        
                        found = true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return found;
    }

}
