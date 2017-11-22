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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import vn.fpt.edu.connect.Connect;

/**
 *
 * @author Le Huy
 */
public final class KhoHangView extends JFrame {

    //JPanel
    JPanel pnlMain = new JPanel();
    JPanel pnlTop = new JPanel();
    JPanel pnlCenter = new JPanel();
    JPanel pnlBottom = new JPanel();

    //JButton
    JButton btnThem = new JButton("Thêm");
    JButton btnSua = new JButton("Sửa");
    JButton btnXoa = new JButton("Xóa");
    JButton btnTim = new JButton("Tìm");

    //JTextField
    JTextField txtTim = new JTextField(10);

    public KhoHangView() {
        pnlMain.setLayout(new BorderLayout());
        pnlTop.setLayout(new GridBagLayout());
        pnlCenter.setLayout(new GridBagLayout());
        pnlBottom.setLayout(new BorderLayout());

        pnlCenter.add(btnThem, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlCenter.add(btnSua, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlCenter.add(btnXoa, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(txtTim, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTop.add(btnTim, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
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
        header.add("Ngày sản xuất");
        header.add("Hạn sử dụng");
        header.add("Giá tiền");
        header.add("Số lượng");

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
                data1.add(rs.getString(9));
                data.add(data1);
                table.setModel(new DefaultTableModel(data, header));
                i++;

            }

        } catch (Exception e) {
        }
        JScrollPane scrDanhsach = new JScrollPane(table);
        table.setModel(new DefaultTableModel(data, header));
        table.getColumnModel().getColumn(0).setPreferredWidth(2);
        table.getColumnModel().getColumn(9).setPreferredWidth(2);
        pnlBottom.add(scrDanhsach, BorderLayout.CENTER);

        pnlMain.add(pnlTop, BorderLayout.NORTH);
        pnlMain.add(pnlCenter, BorderLayout.CENTER);
        pnlMain.add(pnlBottom, BorderLayout.SOUTH);

        this.add(pnlMain);

        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connect cn = new Connect();
                Connection cnn = cn.getConnect();
                try {
                    PreparedStatement ps = cnn.prepareStatement("Delete HANGHOA Where MAHANGHOA=?");
                    ps.setString(1, table.getValueAt(table.getSelectedRow(), 1) + "");
                    if (JOptionPane.showConfirmDialog(null, "ban co muon xoa ko?", "config", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        ps.executeUpdate();

                        table.setModel(new DefaultTableModel(data, header));
                        Connection cn1 = kn.getConnect();
                        table.setPreferredScrollableViewportSize(new Dimension(930, 230));
                        Statement st = null;
                        ResultSet rs = null;
                        String sql = "Select * form HANGHOA";
                        try {
                            st = cn1.createStatement();
                            rs = st.executeQuery(sql);
                            int i = 1;
                            while (rs.next()) {
                                Vector data1 = new Vector();

                                data1.add(i);
                                data1.add(rs.getString(1));
                                data1.add(rs.getString(3));
                                data1.add(rs.getString(3));
                                data1.add(rs.getString(4));
                                data1.add(rs.getString(5));
                                data1.add(rs.getString(6));
                                data1.add(rs.getString(7));
                                data.add(rs.getString(8));
                                data.add(rs.getString(9));
                                data.add(data1);

                                table.setModel(new DefaultTableModel(data, header));
                                i++;
                                ps.close();
                            }

                        } catch (SQLException ex) {
                        }

                    }
                } catch (SQLException ex) {
                }

            }
        });
        
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThemHangView t = new ThemHangView();
                t.setVisible(true);
                t.setSize(1000, 350);
                t.setLocationRelativeTo(null);
            }
        });
    }
}
