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
 * @author MyPC
 */
public final class BanHangView extends JFrame{
    
    //Jpanel
    JPanel pnlMain = new JPanel();
    JPanel pnlTop = new JPanel();
    JPanel pnlBottom = new JPanel();
    
    //Jlable
    JLabel lblMaHang = new JLabel("Mã hàng");
    JLabel lblTenHang = new JLabel("Tên hàng");
    JLabel lblSoLuong = new JLabel("Số lượng");
    JLabel lblDonVi = new JLabel("Đơn vị");
    JLabel lblTrongLuong = new JLabel("Trọng lượng");
    JLabel lblNhaSanXuat = new JLabel("Nhà sản xuất");
    JLabel lblGiaTien = new JLabel("Đơn giá");
    
    //JTextField
    JTextField txtSoLuong = new JTextField(10);
    JTextField txtTrongLuong = new JTextField(10);
    JTextField txtNhaSanXuat = new JTextField(10);
    JTextField txtGiaTien = new JTextField(10);
    
    //JCombobox
    String Donvi[] = {"Kg", "Gam"};
    String MaHangHoa[] = {"                             "};
    String TenHangHoa[] = {"                             "};
    JComboBox cbDonVi = new JComboBox(Donvi);
    JComboBox cbbMaHH = new JComboBox(MaHangHoa);
    JComboBox cbbTenHH = new JComboBox(TenHangHoa);
    
    //JButton
    JButton btnThem = new JButton("Thêm");
    JButton btnQuayLai = new JButton("Quay Lại");
    
    public BanHangView(){
        setSize(680, 420);
        setLocationRelativeTo(null);
        pnlMain.setLayout(new BorderLayout());
        pnlTop.setLayout(new GridBagLayout());
        pnlBottom.setLayout(new FlowLayout());
        
        pnlTop.add(lblMaHang, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(cbbMaHH, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(lblTenHang, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(cbbTenHH, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
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
        pnlTop.add(lblSoLuong, new GridBagConstraints(0, 8, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(txtSoLuong, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
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
        pnlTop.add(lblGiaTien, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(txtGiaTien, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        
        pnlBottom.add(btnThem);
        pnlBottom.add(btnQuayLai);
        
        pnlMain.add(pnlTop, BorderLayout.CENTER);
        pnlMain.add(pnlBottom, BorderLayout.SOUTH);
        
        this.add(pnlMain);
    }
}
