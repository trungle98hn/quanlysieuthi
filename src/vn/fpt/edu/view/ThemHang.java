/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Le Huy
 */
public final class ThemHang extends JFrame {

    //JPanal
    JPanel pnlMain = new JPanel();
    JPanel pnlTop = new JPanel();
    JPanel pnlBottom = new JPanel();

    //JLabel
    JLabel lblMaHang = new JLabel("Mã hàng");
    JLabel lblTenHang = new JLabel("Tên hàng");
    JLabel lblDonVi = new JLabel("Đơn vị");
    JLabel lblTrongLuong = new JLabel("Trọng lượng");
    JLabel lblNhaSanXuat = new JLabel("Nhà sản xuất");
    JLabel lblNgaySanXuat = new JLabel("Ngày sản xuất");
    JLabel lblHanSuDung = new JLabel("Hạn sử dụng");
    JLabel lblGiaTien = new JLabel("Giá tiền");
    JLabel lblSoLuong = new JLabel("Số lượng");

    //TextField
    JTextField txtMaHang = new JTextField(10);
    JTextField txtTenHang = new JTextField(10);
    JTextField txtTrongLuong = new JTextField(10);
    JTextField txtNhaSanXuat = new JTextField(10);
    JTextField txtNgaySanXuat = new JTextField(10);
    JTextField txtHanSuDung = new JTextField(10);
    JTextField txtGiaTien = new JTextField(10);
    JTextField txtSoLuong = new JTextField(10);

    //JCombobox
    String arr[] = {"Gam", "Kg"};
    JComboBox cbDonVi = new JComboBox(arr);
    
    //JButton
    JButton btnOk = new JButton("OK");
    JButton btnCancel = new JButton("Cancel");
    
    public ThemHang() {
        pnlMain.setLayout(new BorderLayout());
        pnlTop.setLayout(new GridBagLayout());
        pnlBottom.setLayout(new FlowLayout());
        
        pnlTop.add(lblMaHang, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(txtMaHang, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(lblTenHang, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(txtTenHang, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(lblDonVi, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(cbDonVi, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(lblTrongLuong, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(txtTrongLuong, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(lblNhaSanXuat, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(txtNhaSanXuat, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(lblNgaySanXuat, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(txtNgaySanXuat, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(lblHanSuDung, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(txtHanSuDung, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(lblGiaTien, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(txtGiaTien, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(lblSoLuong, new GridBagConstraints(0, 8, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(txtSoLuong, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        
        pnlBottom.add(btnOk);
        pnlBottom.add(btnCancel);
        
        pnlMain.add(pnlTop, BorderLayout.CENTER);
        pnlMain.add(pnlBottom, BorderLayout.SOUTH);
        
        this.add(pnlMain);
    }
}
