/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import dao.BookRoomDAO;
import dao.CustomerDAO;
import dao.OrderDAO;
import dao.ServiceDAO;
import entity.Order;
import entity.Room;
import entity.Service;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thule
 */
public class GD_DichVu_NhanVien extends javax.swing.JInternalFrame {
    private DefaultTableModel dtmPhong,dtmDichVu,dtmChiTietDichVu;
    private final OrderDAO oDAO=new OrderDAO();
    private ArrayList<Order> listOrders;
    private ArrayList<Service> listServices;
    private final BookRoomDAO  brDAO=new BookRoomDAO();
    private final CustomerDAO cDAO=new CustomerDAO();
    private final ServiceDAO sDAO=new ServiceDAO();
    
    /**
     * Creates new form GD_DichVu_NhanVien
     */
    public GD_DichVu_NhanVien() throws ClassNotFoundException, SQLException {
        this.setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ui
                = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ui).setNorthPane(null);
        
        
        initComponents();
        dtmDichVu=(DefaultTableModel) tblDichVu.getModel();
        dtmPhong=(DefaultTableModel) tblPhong.getModel();
        dtmChiTietDichVu=(DefaultTableModel) tblChiTietDichVu.getModel();
        loadPhongToTable(dtmPhong,listOrders);
        loadServiceToTable(dtmDichVu,listServices);
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlPhong = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtTim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhong = new javax.swing.JTable();
        pnlOption = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        btnXemChiTiet = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel11 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDichVu = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblPhong = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblChiTietDichVu = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblThanhTien = new javax.swing.JLabel();

        Main.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Dịch Vụ");
        jPanel1.add(jLabel1, java.awt.BorderLayout.NORTH);

        Main.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.X_AXIS));

        pnlPhong.setLayout(new javax.swing.BoxLayout(pnlPhong, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 300));
        jPanel3.setPreferredSize(new java.awt.Dimension(138, 70));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setMaximumSize(new java.awt.Dimension(500, 300));
        jPanel5.setMinimumSize(new java.awt.Dimension(80, 50));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 65));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(txtTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 340, 30));

        jLabel2.setText("Tìm phòng:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        pnlPhong.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách các phòng đang sử dụng"));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        tblPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Tên phòng", "CCCD khách hàng", "Tên khách hàng"
            }
        ));
        jScrollPane2.setViewportView(tblPhong);

        jPanel4.add(jScrollPane2);

        pnlPhong.add(jPanel4);

        jPanel2.add(pnlPhong);

        pnlOption.setLayout(new javax.swing.BoxLayout(pnlOption, javax.swing.BoxLayout.Y_AXIS));

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.X_AXIS));

        jPanel7.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 304));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));
        jPanel7.add(jPanel14);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.Y_AXIS));

        btnXemChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXemChiTiet.setText("Xem chi tiết dịch vụ");
        btnXemChiTiet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXemChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietActionPerformed(evt);
            }
        });
        jPanel12.add(btnXemChiTiet);

        jPanel13.add(jPanel12);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Số lượng: ");
        jPanel10.add(jLabel3);

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel10.add(jSpinner1);

        jPanel13.add(jPanel10);

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThem.setText("Thêm dịch vụ vào phòng");
        btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel11.add(btnThem);

        jPanel13.add(jPanel11);

        jPanel7.add(jPanel13);

        jPanel6.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách dịch vụ"));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        tblDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã dịch vụ", "Tên Dịch Vụ", "Đơn Giá", "Số lượng tồn"
            }
        ));
        jScrollPane1.setViewportView(tblDichVu);

        jPanel8.add(jScrollPane1);

        jPanel6.add(jPanel8);

        pnlOption.add(jPanel6);

        jPanel15.setLayout(new javax.swing.BoxLayout(jPanel15, javax.swing.BoxLayout.Y_AXIS));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết dịch vụ trong phòng"));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.Y_AXIS));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Danh sách dịch vụ ");
        jPanel16.add(jLabel4);

        lblPhong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel16.add(lblPhong);

        jPanel9.add(jPanel16);

        tblChiTietDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Số lượng", "Giá"
            }
        ));
        jScrollPane3.setViewportView(tblChiTietDichVu);

        jPanel9.add(jScrollPane3);

        jPanel15.add(jPanel9);

        pnlOption.add(jPanel15);

        jPanel17.setLayout(new javax.swing.BoxLayout(jPanel17, javax.swing.BoxLayout.Y_AXIS));

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.setLayout(new javax.swing.BoxLayout(jPanel18, javax.swing.BoxLayout.Y_AXIS));

        jPanel19.setLayout(new java.awt.GridLayout(1, 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Thành tiền: ");
        jPanel19.add(jLabel5);

        lblThanhTien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel19.add(lblThanhTien);

        jPanel18.add(jPanel19);

        jPanel17.add(jPanel18);

        pnlOption.add(jPanel17);

        jPanel2.add(pnlOption);

        Main.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(Main, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietActionPerformed
        int index= tblPhong.getSelectedRow();
        if(index==-1){
            JOptionPane.showMessageDialog(null, "Hãy chọn phòng cần muốn xem chi tiết!");
        }else{
            
        }
    }//GEN-LAST:event_btnXemChiTietActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXemChiTiet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblPhong;
    private javax.swing.JLabel lblThanhTien;
    private javax.swing.JPanel pnlOption;
    private javax.swing.JPanel pnlPhong;
    private javax.swing.JTable tblChiTietDichVu;
    private javax.swing.JTable tblDichVu;
    private javax.swing.JTable tblPhong;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables

    private void loadPhongToTable(DefaultTableModel dtm, ArrayList<Order> list) {
//        Cần sửa thành get all order có trạng thái chưa thanh toán
        list=oDAO.getAlLOrder();
        
        dtm.setRowCount(0);
        
        for(Order o:list){
            Room r=o.getBookRooms().get(0).getRoom();
            dtm.addRow(new String []{r.getRoomID(),r.getRoomName(),o.getEmployee().getCCCD(),o.getEmployee().getEmployeeName()});
        }
    }

    private void loadServiceToTable(DefaultTableModel dtm, List<Service> list) throws ClassNotFoundException, SQLException {
        list=sDAO.getAllService();
        
        dtm.setRowCount(0);
        
        for(Service s:list){
            dtm.addRow(new String []{s.getServiceID(),s.getServiceName(),s.getPrice()+"",s.getInventory()+""});
        }
    }
}
