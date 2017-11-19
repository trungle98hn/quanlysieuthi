/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.view;

/**
 *
 * @author Admin
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import vn.fpt.edu.connect.Connect;

/**
 *
 * @author admin
 */
public class BaoCaoView extends JFrame {

    //jpanel
    JPanel pnlMain = new JPanel();
    JPanel pnlTieude = new JPanel();
    JPanel pnlTop = new JPanel();
    JPanel pnlTopB = new JPanel();
    JPanel pnlBottom = new JPanel();

    //jlabel
    JLabel lblTieude = new JLabel("Doanh thu bán thuốc theo tháng");
    JLabel lblTungay = new JLabel("Từ ngày");
    JLabel lblDenngay = new JLabel("Đến ngày");

    //JTEXTFILE
    JTextField txtTungay = new JTextField();
    JTextField txtDengay = new JTextField();

    //jbutton
    JButton btnLoc = new JButton("Lọc");
    JButton btnInBaoCao=new JButton("In báo cáo");
    //Jdate
    JDateChooser jdate1 = new JDateChooser();
    JDateChooser jdate2 = new JDateChooser();
    //Jcombobox
    String[] bookTitles = new String[]{"nhập", "xuất"};

    JComboBox<String> bookList = new JComboBox<>(bookTitles);

    public BaoCaoView() {

        pnlMain.setLayout(new BorderLayout());
        pnlTieude.setLayout(new FlowLayout());
        pnlTopB.setLayout(new GridBagLayout());
        pnlTop.setLayout(new BorderLayout());
        pnlBottom.setLayout(new BorderLayout());
        pnlTopB.add(bookList, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTopB.add(lblTungay, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTopB.add(jdate1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 120, 0));
        pnlTopB.add(lblDenngay, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTopB.add(jdate2, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 120, 0));

        pnlTopB.add(btnLoc, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));
        pnlTopB.add(btnInBaoCao, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST,
                GridBagConstraints.NONE,
                new Insets(10, 20, 0, 0), 0, 0));

        //table
        JTable table = new JTable();
        DefaultTableModel dftb = new DefaultTableModel();
        Vector data = new Vector();
        Vector header = new Vector();
        header.add("STT");
        header.add("Mã HĐ");
        header.add("Ngày Xuất");
        header.add("Mã nhân viên");
        header.add("Giá");

        Connect kn = new Connect();
        Connection cn = kn.getConnect();
        table.setPreferredScrollableViewportSize(new Dimension(1000, 230));
        Statement st = null;
        ResultSet rs = null;
        String sql = "Select * FROM USERS";
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
                data.add(data1);
                table.setModel(new DefaultTableModel(data, header));
                i++;

            }

        } catch (Exception e) {
        }
        JScrollPane scrDanhsach = new JScrollPane(table);
        table.setModel(new DefaultTableModel(data, header));

        //
        lblTieude.setForeground(Color.red);
        lblDenngay.setForeground(Color.red);
        lblTungay.setForeground(Color.red);
        //
        pnlMain.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlTop.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlTopB.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        pnlTieude.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlTieude.add(lblTieude);

        pnlTop.add(pnlTieude, BorderLayout.NORTH);
        pnlTop.add(pnlTopB, BorderLayout.CENTER);

        pnlBottom.add(scrDanhsach, BorderLayout.CENTER);

        pnlMain.add(pnlTop, BorderLayout.NORTH);
        pnlMain.add(pnlBottom, BorderLayout.CENTER);

        this.add(pnlMain);
    }
//    public static void main(String[] args) {
//        Baocaodoanhthungaythang B = new Baocaodoanhthungaythang();
//        B.setSize(900, 550);
//        B.setLocationRelativeTo(null);
//        B.setVisible(true);
//        
//    }
}
