/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.view;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
          
        FormBanHang m = new FormBanHang();
        m.setTitle("Quản lý siêu thị mini");
        m.setSize(680, 420);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
    }
}
