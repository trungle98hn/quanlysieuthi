/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import vn.fpt.edu.connect.Connect;

/**
 *
 * @author DuongVH
 */
public class FormBanHang extends JFrame {

    //JPanel
    JPanel pnlMain = new JPanel();
    JPanel pnlTop = new JPanel();
    JPanel pnlCenter = new JPanel();
    JPanel pnlBottom = new JPanel();

    //JButton
    JButton btnThem = new JButton("Thêm");
    JButton btnSua = new JButton("Sửa");
    JButton btnXoa = new JButton("Xóa");
    JButton btnThanhToan = new JButton("Thanh Toán");

    
    public FormBanHang() {
        pnlMain.setLayout(new BorderLayout());
        pnlTop.setLayout(new GridBagLayout());
        pnlCenter.setLayout(new BorderLayout());
        pnlBottom.setLayout(new GridBagLayout());

        pnlTop.add(btnThem, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(btnSua, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(btnXoa, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));

        pnlBottom.add(btnThanhToan, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        JTable table = new JTable();
        DefaultTableModel dftb = new DefaultTableModel();
        Vector data = new Vector();
        Vector header = new Vector();
        header.add("STT");
        header.add("Mã HH");
        header.add("Tên HH");
        header.add("Đơn vị");
        header.add("Trọng Lượng");
        header.add("Nhà sản xuất");
        header.add("Số lượng");
        header.add("Đơn giá");

        Connect kn = new Connect();
        Connection cn = kn.getConnect();
        table.setPreferredScrollableViewportSize(new Dimension(1000, 230));
        Statement st = null;
        ResultSet rs = null;
        String sql = "Select * FROM HANGHOA";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            int i = 1;
            while (rs.next()) {
                Vector data1 = new Vector();

                data1.add(i);
                data1.add(rs.getString(1));
                data1.add(rs.getString(2));
                data1.add(rs.getString(3));
                data1.add(rs.getString(4));
                data1.add(rs.getString(5));
                data1.add(rs.getString(6));
                data1.add(rs.getString(7));
                data1.add(rs.getString(8));
                data.add(data1);
                table.setModel(new DefaultTableModel(data, header));
                i++;

            }

        } catch (Exception e) {
        }
        JScrollPane scrDanhsach = new JScrollPane(table);
        table.setModel(new DefaultTableModel(data, header));

        pnlCenter.add(scrDanhsach, BorderLayout.CENTER);
        
        pnlMain.add(pnlTop, BorderLayout.NORTH);
        pnlMain.add(pnlCenter, BorderLayout.CENTER);
        pnlMain.add(pnlBottom,BorderLayout.SOUTH);
        
        this.add(pnlMain);
        
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BanHangView bhv = new BanHangView();        
                bhv.setVisible(true);
                
            }
        });
    }
}

