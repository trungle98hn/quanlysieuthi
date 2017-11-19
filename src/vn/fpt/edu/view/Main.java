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
          
        FormDangNhap m = new FormDangNhap();
        // Thuoc thuoc=new Thuoc();

        //Thuoc.setTitle("Quản lý cửa hàng thuốc");
        // thuoc.setSize(740, 420);
        // m.setResizable(false);
        // m.setLocationRelativeTo(null);
        // m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //thuoc.setVisible(true);
        m.setTitle("Quản lý cửa hàng thuốc");
        m.setSize(1050, 600);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
    }
}
