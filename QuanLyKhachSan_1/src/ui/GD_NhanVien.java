/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.RoundRectangle2D;
import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.tools.DocumentationTool;
import keeptoo.KGradientPanel;

/**
 *
 * @author ACER
 */
public class GD_NhanVien extends javax.swing.JFrame {

    private static String username;
    private final GD_GioiThieu frGioiThieu;
    private final GD_DonDat gdDonDat;
    

    /**
     * Creates new form MainEmployee
     */
    public GD_NhanVien(String user) {
        this.setUndecorated(true);
        this.setResizable(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);

        initComponents();
//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/tuisach.png")));
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        pnlGioiThieu.setkEndColor(new java.awt.Color(235,144,46));
        pnlGioiThieu.setkStartColor(new java.awt.Color(235,144,46));
        lblGioiThieu.setForeground(new Color(255,255,255));
        
        frGioiThieu = new GD_GioiThieu(username);
        gdDonDat=new GD_DonDat();
        openComponent(frGioiThieu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlForm = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        pnlNguoiDung = new javax.swing.JPanel();
        lblChucVu = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        pnlGioiThieu = new keeptoo.KGradientPanel();
        lblGioiThieu = new javax.swing.JLabel();
        pnlDonDat = new keeptoo.KGradientPanel();
        lblDonDat = new javax.swing.JLabel();
        pnlDichVu = new keeptoo.KGradientPanel();
        lblDichVu = new javax.swing.JLabel();
        pnlHoaDon = new keeptoo.KGradientPanel();
        lblHoaDon = new javax.swing.JLabel();
        pnlTraCuu = new keeptoo.KGradientPanel();
        lblTraCuu = new javax.swing.JLabel();
        pnlThongKe = new keeptoo.KGradientPanel();
        lblThongKe = new javax.swing.JLabel();
        pnlTroGiup = new keeptoo.KGradientPanel();
        lblTroGiup = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDoiMatKhau = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(200, 200));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        pnlMain.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        pnlMain.setLayout(new java.awt.BorderLayout());

        pnlForm.setBackground(new java.awt.Color(255, 255, 255));
        pnlForm.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        pnlForm.setLayout(new java.awt.BorderLayout());
        pnlMain.add(pnlForm, java.awt.BorderLayout.CENTER);

        pnlMenu.setBackground(new java.awt.Color(249, 234, 249));
        pnlMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMenu.setPreferredSize(new java.awt.Dimension(250, 200));
        pnlMenu.setLayout(new javax.swing.BoxLayout(pnlMenu, javax.swing.BoxLayout.Y_AXIS));

        pnlNguoiDung.setBackground(new java.awt.Color(255, 255, 255));

        lblChucVu.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblChucVu.setForeground(new java.awt.Color(79, 51, 22));
        lblChucVu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblChucVu.setText("Nhân viên");

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTen.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblTen.setForeground(new java.awt.Color(79, 51, 22));
        lblTen.setText("Trần Văn A");

        javax.swing.GroupLayout pnlNguoiDungLayout = new javax.swing.GroupLayout(pnlNguoiDung);
        pnlNguoiDung.setLayout(pnlNguoiDungLayout);
        pnlNguoiDungLayout.setHorizontalGroup(
            pnlNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguoiDungLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlNguoiDungLayout.createSequentialGroup()
                        .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlNguoiDungLayout.setVerticalGroup(
            pnlNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguoiDungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNguoiDungLayout.createSequentialGroup()
                        .addComponent(lblChucVu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTen)
                        .addGap(30, 30, 30))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMenu.add(pnlNguoiDung);

        kGradientPanel2.setkEndColor(new java.awt.Color(240, 160, 75));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setMaximumSize(new java.awt.Dimension(999, 2000));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(245, 814));
        kGradientPanel2.setLayout(new javax.swing.BoxLayout(kGradientPanel2, javax.swing.BoxLayout.PAGE_AXIS));

        pnlGioiThieu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlGioiThieu.setkEndColor(new java.awt.Color(252, 210, 165));
        pnlGioiThieu.setkGradientFocus(10);
        pnlGioiThieu.setkStartColor(new java.awt.Color(252, 210, 165));
        pnlGioiThieu.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        pnlGioiThieu.setPreferredSize(new java.awt.Dimension(250, 40));
        pnlGioiThieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlGioiThieuMousePressed(evt);
            }
        });
        pnlGioiThieu.setLayout(new java.awt.BorderLayout());

        lblGioiThieu.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblGioiThieu.setForeground(new java.awt.Color(79, 51, 22));
        lblGioiThieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGioiThieu.setText("GIỚI THIỆU");
        pnlGioiThieu.add(lblGioiThieu, java.awt.BorderLayout.CENTER);

        kGradientPanel2.add(pnlGioiThieu);

        pnlDonDat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlDonDat.setkEndColor(new java.awt.Color(252, 210, 165));
        pnlDonDat.setkGradientFocus(10);
        pnlDonDat.setkStartColor(new java.awt.Color(252, 210, 165));
        pnlDonDat.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        pnlDonDat.setPreferredSize(new java.awt.Dimension(250, 40));
        pnlDonDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDonDatMousePressed(evt);
            }
        });
        pnlDonDat.setLayout(new java.awt.BorderLayout());

        lblDonDat.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblDonDat.setForeground(new java.awt.Color(79, 51, 22));
        lblDonDat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonDat.setText("ĐƠN ĐẶT");
        pnlDonDat.add(lblDonDat, java.awt.BorderLayout.CENTER);

        kGradientPanel2.add(pnlDonDat);

        pnlDichVu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlDichVu.setkEndColor(new java.awt.Color(252, 210, 165));
        pnlDichVu.setkGradientFocus(10);
        pnlDichVu.setkStartColor(new java.awt.Color(252, 210, 165));
        pnlDichVu.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        pnlDichVu.setPreferredSize(new java.awt.Dimension(250, 40));
        pnlDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDichVuMousePressed(evt);
            }
        });
        pnlDichVu.setLayout(new java.awt.BorderLayout());

        lblDichVu.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblDichVu.setForeground(new java.awt.Color(79, 51, 22));
        lblDichVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDichVu.setText("DỊCH VỤ");
        pnlDichVu.add(lblDichVu, java.awt.BorderLayout.CENTER);

        kGradientPanel2.add(pnlDichVu);

        pnlHoaDon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlHoaDon.setkEndColor(new java.awt.Color(252, 210, 165));
        pnlHoaDon.setkGradientFocus(10);
        pnlHoaDon.setkStartColor(new java.awt.Color(252, 210, 165));
        pnlHoaDon.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        pnlHoaDon.setPreferredSize(new java.awt.Dimension(250, 40));
        pnlHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHoaDonMousePressed(evt);
            }
        });
        pnlHoaDon.setLayout(new java.awt.BorderLayout());

        lblHoaDon.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(79, 51, 22));
        lblHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDon.setText("HÓA ĐƠN");
        pnlHoaDon.add(lblHoaDon, java.awt.BorderLayout.CENTER);

        kGradientPanel2.add(pnlHoaDon);

        pnlTraCuu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlTraCuu.setkEndColor(new java.awt.Color(252, 210, 165));
        pnlTraCuu.setkGradientFocus(10);
        pnlTraCuu.setkStartColor(new java.awt.Color(252, 210, 165));
        pnlTraCuu.setMaximumSize(new java.awt.Dimension(300, 40));
        pnlTraCuu.setMinimumSize(new java.awt.Dimension(50, 40));
        pnlTraCuu.setPreferredSize(new java.awt.Dimension(250, 40));
        pnlTraCuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTraCuuMousePressed(evt);
            }
        });
        pnlTraCuu.setLayout(new java.awt.BorderLayout());

        lblTraCuu.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTraCuu.setForeground(new java.awt.Color(79, 51, 22));
        lblTraCuu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTraCuu.setText("TRA CỨU");
        lblTraCuu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlTraCuu.add(lblTraCuu, java.awt.BorderLayout.CENTER);

        kGradientPanel2.add(pnlTraCuu);

        pnlThongKe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlThongKe.setkEndColor(new java.awt.Color(252, 210, 165));
        pnlThongKe.setkGradientFocus(10);
        pnlThongKe.setkStartColor(new java.awt.Color(252, 210, 165));
        pnlThongKe.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        pnlThongKe.setPreferredSize(new java.awt.Dimension(250, 40));
        pnlThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlThongKeMousePressed(evt);
            }
        });
        pnlThongKe.setLayout(new java.awt.BorderLayout());

        lblThongKe.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(79, 51, 22));
        lblThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongKe.setText("THỐNG KÊ");
        pnlThongKe.add(lblThongKe, java.awt.BorderLayout.CENTER);

        kGradientPanel2.add(pnlThongKe);

        pnlTroGiup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlTroGiup.setkEndColor(new java.awt.Color(252, 210, 165));
        pnlTroGiup.setkGradientFocus(10);
        pnlTroGiup.setkStartColor(new java.awt.Color(252, 210, 165));
        pnlTroGiup.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        pnlTroGiup.setPreferredSize(new java.awt.Dimension(250, 40));
        pnlTroGiup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTroGiupMousePressed(evt);
            }
        });
        pnlTroGiup.setLayout(new java.awt.BorderLayout());

        lblTroGiup.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTroGiup.setForeground(new java.awt.Color(79, 51, 22));
        lblTroGiup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTroGiup.setText("TRỢ GIÚP");
        pnlTroGiup.add(lblTroGiup, java.awt.BorderLayout.CENTER);

        kGradientPanel2.add(pnlTroGiup);

        pnlMenu.add(kGradientPanel2);

        jPanel1.setLayout(new java.awt.BorderLayout());

        btnDoiMatKhau.setBackground(new java.awt.Color(235, 144, 46));
        btnDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        btnDoiMatKhau.setText("ĐỔI MẬT KHẨU");
        btnDoiMatKhau.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 210, 165), 3, true));
        btnDoiMatKhau.setMaximumSize(new java.awt.Dimension(254, 42));
        btnDoiMatKhau.setPreferredSize(new java.awt.Dimension(254, 40));
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoiMatKhau, java.awt.BorderLayout.SOUTH);

        pnlMenu.add(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        btnDangXuat.setBackground(new java.awt.Color(252, 249, 250));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(183, 31, 31));
        btnDangXuat.setText("ĐĂNG XUẤT");
        btnDangXuat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 210, 165), 3, true));
        btnDangXuat.setMaximumSize(new java.awt.Dimension(254, 42));
        btnDangXuat.setPreferredSize(new java.awt.Dimension(254, 40));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jPanel2.add(btnDangXuat, java.awt.BorderLayout.PAGE_END);

        pnlMenu.add(jPanel2);

        pnlMain.add(pnlMenu, java.awt.BorderLayout.WEST);
        pnlMenu.getAccessibleContext().setAccessibleParent(this);

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkGradientFocus(2600);
        kGradientPanel1.setkStartColor(new java.awt.Color(240, 160, 75));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1155, 45));
        kGradientPanel1.setLayout(new java.awt.GridLayout(1, 1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PHẦN MỀM QUẢN LÝ KHÁCH SẠN");
        jLabel3.setToolTipText("");
        jLabel3.setAlignmentX(1.0F);
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel1.add(jLabel3);

        pnlMain.add(kGradientPanel1, java.awt.BorderLayout.NORTH);

        getContentPane().add(pnlMain);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlGioiThieuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGioiThieuMousePressed
        doiMauPnl();
        
        pnlGioiThieu.setkEndColor(new java.awt.Color(235,144,46));
        pnlGioiThieu.setkStartColor(new java.awt.Color(235,144,46));
        lblGioiThieu.setForeground(new Color(255,255,255)); 
        openComponent(frGioiThieu);
    }//GEN-LAST:event_pnlGioiThieuMousePressed
private void doiMauPnl(){
        pnlGioiThieu.setkEndColor(new java.awt.Color(252,210,165));
        pnlGioiThieu.setkStartColor(new java.awt.Color(252,210,165));
        lblGioiThieu.setForeground(new java.awt.Color(79,51,22));
        
       pnlDonDat.setkEndColor(new java.awt.Color(252,210,165));
        pnlDonDat.setkStartColor(new java.awt.Color(252,210,165));
        lblDonDat.setForeground(new java.awt.Color(79,51,22));

        pnlHoaDon.setkEndColor(new java.awt.Color(252,210,165));
        pnlHoaDon.setkStartColor(new java.awt.Color(252,210,165));
        lblHoaDon.setForeground(new java.awt.Color(79,51,22));
        
        pnlDichVu.setkEndColor(new java.awt.Color(252,210,165));
        pnlDichVu.setkStartColor(new java.awt.Color(252,210,165));
        lblDichVu.setForeground(new java.awt.Color(79,51,22));
        
        pnlTraCuu.setkEndColor(new java.awt.Color(252,210,165));
        pnlTraCuu.setkStartColor(new java.awt.Color(252,210,165));
        lblTraCuu.setForeground(new java.awt.Color(79,51,22));
        
        pnlThongKe.setkEndColor(new java.awt.Color(252,210,165));
        pnlThongKe.setkStartColor(new java.awt.Color(252,210,165));
        lblThongKe.setForeground(new java.awt.Color(79,51,22));
        
        pnlTroGiup.setkEndColor(new java.awt.Color(252,210,165));
        pnlTroGiup.setkStartColor(new java.awt.Color(252,210,165));
        lblTroGiup.setForeground(new java.awt.Color(79,51,22));
}
    private void pnlTroGiupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTroGiupMousePressed
        doiMauPnl();
        
        pnlTroGiup.setkEndColor(new java.awt.Color(235,144,46));
        pnlTroGiup.setkStartColor(new java.awt.Color(235,144,46));
        lblTroGiup.setForeground(new Color(255,255,255)); 
    }//GEN-LAST:event_pnlTroGiupMousePressed

    private void pnlHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonMousePressed
        doiMauPnl();
        
        pnlHoaDon.setkEndColor(new java.awt.Color(235,144,46));
        pnlHoaDon.setkStartColor(new java.awt.Color(235,144,46));
        lblHoaDon.setForeground(new Color(255,255,255)); 
    }//GEN-LAST:event_pnlHoaDonMousePressed

    private void pnlThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMousePressed
        doiMauPnl();
        
        pnlThongKe.setkEndColor(new java.awt.Color(235,144,46));
        pnlThongKe.setkStartColor(new java.awt.Color(235,144,46));
        lblThongKe.setForeground(new Color(255,255,255)); 
    }//GEN-LAST:event_pnlThongKeMousePressed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát ?", "Thoát", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GD_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(GD_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(GD_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(GD_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            Frm_Login dn =new Frm_Login();
            dn.setVisible(true);
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirmed = JOptionPane.showConfirmDialog(null,
                "Bạn có chắc muốn tắt chương trình ?", "Tắt chương trình",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
        }else{
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        GD_DoiMatKhau gd=new GD_DoiMatKhau(username);
        gd.setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void pnlDichVuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDichVuMousePressed
        doiMauPnl();
        
        pnlDichVu.setkEndColor(new java.awt.Color(235,144,46));
        pnlDichVu.setkStartColor(new java.awt.Color(235,144,46));
        lblDichVu.setForeground(new Color(255,255,255)); 
    }//GEN-LAST:event_pnlDichVuMousePressed

    private void pnlTraCuuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTraCuuMousePressed
        doiMauPnl();
        
        pnlTraCuu.setkEndColor(new java.awt.Color(235,144,46));
        pnlTraCuu.setkStartColor(new java.awt.Color(235,144,46));
        lblTraCuu.setForeground(new Color(255,255,255)); 
        GD_TraCuu gdTraCuu=new GD_TraCuu();
        openComponent(gdTraCuu);
    }//GEN-LAST:event_pnlTraCuuMousePressed

    private void pnlDonDatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDonDatMousePressed
        doiMauPnl();
        
        pnlDonDat.setkEndColor(new java.awt.Color(235,144,46));
        pnlDonDat.setkStartColor(new java.awt.Color(235,144,46));
        lblDonDat.setForeground(new Color(255,255,255)); 
        
        

        openComponent(gdDonDat);
    }//GEN-LAST:event_pnlDonDatMousePressed
    // open frame when click panel
    void openComponent(JInternalFrame frame) {
        Component[] components = pnlForm.getComponents();
        Component component = null;
        for (int i = 0; i < components.length; i++) {
            component = components[i];
            if (component != null) {
                component.setVisible(false);
            }
        }
        pnlForm.add(frame);
        frame.setVisible(true);
    }

    // set color
    void setColor(JPanel panel, JLabel label) {
        panel.setBackground(new Color(204, 232, 255));
        label.setForeground(new Color(33, 162, 72));
    }

    // rest color
    void resetColor(JPanel panel, JLabel label) {
        panel.setBackground(new Color(255, 255, 255));
        label.setForeground(new Color(0, 0, 0));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
//        com.jtattoo.plaf.mcwin.McWinLookAndFeel.setTheme("Green", "INSERT YOUR LICENSE KEY HERE", "my company");
//        UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GD_NhanVien(username);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblDichVu;
    private javax.swing.JLabel lblDonDat;
    private javax.swing.JLabel lblGioiThieu;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblTraCuu;
    private javax.swing.JLabel lblTroGiup;
    private keeptoo.KGradientPanel pnlDichVu;
    private keeptoo.KGradientPanel pnlDonDat;
    private javax.swing.JPanel pnlForm;
    private keeptoo.KGradientPanel pnlGioiThieu;
    private keeptoo.KGradientPanel pnlHoaDon;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNguoiDung;
    private keeptoo.KGradientPanel pnlThongKe;
    private keeptoo.KGradientPanel pnlTraCuu;
    private keeptoo.KGradientPanel pnlTroGiup;
    // End of variables declaration//GEN-END:variables

    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;

        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }

}
