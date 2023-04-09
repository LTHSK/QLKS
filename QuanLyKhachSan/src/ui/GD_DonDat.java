/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import dao.RoomDAO;
import dao.RoomStatusTypeDAO;
import entity.Room;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author ACER
 */
public class GD_DonDat extends javax.swing.JInternalFrame {
    private String username;
    RoomDAO roomDAO;
    RoomStatusTypeDAO roomStatusTypeDAO;

    //List
    List<Room> listRoomVip;
    List<Room> listRoomNormals;
    /**
     * Creates new form QuanLyHoaDon
     */
    public GD_DonDat() {
        this.setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ui
                = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ui).setNorthPane(null);
        initComponents();
        this.setFocusable(true);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        pnlRoom = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jPanel9 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setFrameIcon(null);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setPreferredSize(new java.awt.Dimension(1015, 756));
        pnlMain.setLayout(new javax.swing.BoxLayout(pnlMain, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2000, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel1.setPreferredSize(new java.awt.Dimension(2287, 70));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(2000, 200));
        jPanel7.setMinimumSize(new java.awt.Dimension(100, 30));
        jPanel7.setPreferredSize(new java.awt.Dimension(1998, 60));

        jLabel5.setText("jLabel5");
        jPanel7.add(jLabel5);

        jTextField1.setText("jTextField1");
        jPanel7.add(jTextField1);

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(2000, 200));
        jPanel8.setMinimumSize(new java.awt.Dimension(100, 30));
        jPanel8.setPreferredSize(new java.awt.Dimension(1998, 60));

        jLabel6.setText("jLabel5");
        jPanel8.add(jLabel6);

        jTextField2.setText("jTextField1");
        jPanel8.add(jTextField2);

        jPanel1.add(jPanel8);

        pnlMain.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.X_AXIS));

        pnlRoom.setBackground(new java.awt.Color(255, 255, 255));
        pnlRoom.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách phòng"));
        pnlRoom.setLayout(new javax.swing.OverlayLayout(pnlRoom));

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        pnlRoom.add(scrollPanel);

        jPanel2.add(pnlRoom);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setMaximumSize(new java.awt.Dimension(1004, 1000));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setMaximumSize(new java.awt.Dimension(1000, 30));
        jPanel12.setMinimumSize(new java.awt.Dimension(10, 5));
        jPanel12.setPreferredSize(new java.awt.Dimension(223, 10));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel12);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 30));
        jPanel3.setMinimumSize(new java.awt.Dimension(10, 5));
        jPanel3.setPreferredSize(new java.awt.Dimension(223, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(1000, 30));
        jPanel4.setMinimumSize(new java.awt.Dimension(10, 5));
        jPanel4.setPreferredSize(new java.awt.Dimension(223, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel4);

        jToggleButton3.setText("Thêm");
        jToggleButton3.setAlignmentX(0.5F);
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton3.setMaximumSize(new java.awt.Dimension(150, 70));
        jToggleButton3.setMinimumSize(new java.awt.Dimension(20, 10));
        jToggleButton3.setPreferredSize(new java.awt.Dimension(80, 20));
        jPanel6.add(jToggleButton3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(1000, 30));
        jPanel5.setMinimumSize(new java.awt.Dimension(10, 5));
        jPanel5.setPreferredSize(new java.awt.Dimension(223, 10));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel5);

        jToggleButton2.setText("jToggleButton2");
        jToggleButton2.setAlignmentX(0.5F);
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setMaximumSize(new java.awt.Dimension(150, 70));
        jToggleButton2.setMinimumSize(new java.awt.Dimension(20, 10));
        jToggleButton2.setPreferredSize(new java.awt.Dimension(80, 20));
        jPanel6.add(jToggleButton2);

        jToggleButton4.setText("TẠO ĐƠN ĐẶT PHÒNG");
        jToggleButton4.setAlignmentX(0.5F);
        jToggleButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton4.setMaximumSize(new java.awt.Dimension(150, 70));
        jToggleButton4.setMinimumSize(new java.awt.Dimension(20, 10));
        jToggleButton4.setPreferredSize(new java.awt.Dimension(80, 20));
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton4);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(1000, 30));
        jPanel9.setMinimumSize(new java.awt.Dimension(10, 5));
        jPanel9.setPreferredSize(new java.awt.Dimension(223, 10));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9);

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.setAlignmentX(0.5F);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setMaximumSize(new java.awt.Dimension(150, 70));
        jToggleButton1.setMinimumSize(new java.awt.Dimension(20, 10));
        jToggleButton1.setPreferredSize(new java.awt.Dimension(80, 20));
        jPanel6.add(jToggleButton1);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMaximumSize(new java.awt.Dimension(1000, 30));
        jPanel10.setMinimumSize(new java.awt.Dimension(10, 5));
        jPanel10.setPreferredSize(new java.awt.Dimension(223, 10));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(1000, 30));
        jPanel11.setMinimumSize(new java.awt.Dimension(10, 5));
        jPanel11.setPreferredSize(new java.awt.Dimension(223, 10));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel11);

        jPanel2.add(jPanel6);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel13);

        pnlMain.add(jPanel2);

        getContentPane().add(pnlMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed
// Create list rooms
    private void createRoom() {
        listRoomVip = roomDAO.findRoomByIDLoaiPhong("LP001");
        listRoomNormals = roomDAO.findRoomByIDLoaiPhong("LP002");

        JLabel lblListNormal;
        // Titile Normal
        lblListNormal = new JLabel("Danh sách phòng thường");
        lblListNormal.setBounds(20, 20, 300, 30);
        lblListNormal.setFont(new Font("Segoe UI", Font.BOLD, 14));

        // Danh sách phòng
        JPanel pnlListRoom = new JPanel();
        pnlListRoom.removeAll();
        pnlListRoom.setBackground(Color.white);
        pnlListRoom.setLayout(null);
        pnlListRoom.setPreferredSize(new Dimension(600, 830));
        pnlListRoom.add(lblListNormal);

        JLabel lblListVip;

        int x = 20;
        int y = 60;
        int width = 100;
        int height = 100;
        int countHeight = 0;
        int numberRoomNormal = 1;
        int countNumberRoomNormalRemove = 0;
        int numberRoomVip = 1;
        String trangThaiPhong;
        for (Room room : listRoomNormals) {
            trangThaiPhong = room.getRoomStatusType().getRoomStatusTypeID().toUpperCase();
//            if (trangThaiPhong.equals("LTTP004")) {
//                countNumberRoomNormalRemove++;
//            }
        }
        for (Room room : listRoomNormals) {
            trangThaiPhong = room.getRoomStatusType().getRoomStatusTypeID().toUpperCase();
            if (!trangThaiPhong.equals("LTTP004")) {
                //Room
                pnlRoom = new JPanel();
                pnlRoom.setBackground(Color.white);
                pnlRoom.setLayout(new BorderLayout());
                pnlRoom.setBounds(x, y, width, height);

                if (trangThaiPhong.equals("LTTP001")) {
                    createStatusRoom(trangThaiPhong, new Color(241, 98, 86), pnlRoom);
                    createNameRoom(room.getRoomID(), pnlRoom, new Color(241, 91, 56), room);
                } else if (trangThaiPhong.equals("LTTP002")) {
                    createStatusRoom(trangThaiPhong, new Color(51, 176, 224), pnlRoom);
                    createNameRoom(room.getRoomID(), pnlRoom, new Color(113, 108, 176), room);
                } else {
                    createStatusRoom(trangThaiPhong, new Color(5, 154, 3), pnlRoom);
                    createNameRoom(room.getRoomID(), pnlRoom, Color.WHITE, room);
                }

                pnlListRoom.add(pnlRoom, BorderLayout.CENTER);
                x += width + 20;

                if (numberRoomNormal % 5 == 0 || numberRoomNormal == listRoomNormals.size() - countNumberRoomNormalRemove) {
                    y += width + 20;
                    x = 20;
                    countHeight = y + 40;
                }
                if (numberRoomNormal == listRoomNormals.size() - countNumberRoomNormalRemove) {
                    lblListVip = new JLabel("Danh sách phòng Vip");
                    lblListVip.setBounds(20, y, 300, 30);
                    lblListVip.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    pnlListRoom.add(lblListVip);
                }
                numberRoomNormal++;
            }
        }

        for (Room room : listRoomVip) {
            trangThaiPhong = room.getRoomStatusType().getRoomStatusTypeID().toUpperCase();
            if (!trangThaiPhong.equals("LTTP004")) {
                //Room
                pnlRoom = new JPanel();
                pnlRoom.setBackground(Color.white);
                pnlRoom.setLayout(new BorderLayout());
                pnlRoom.setBounds(x, countHeight, width, height);

                if (trangThaiPhong.equals("LTTP001")) {
                    createStatusRoom(trangThaiPhong, new Color(241, 98, 86), pnlRoom);
                    createNameRoom(room.getRoomID(), pnlRoom, new Color(241, 91, 56), room);
                } else if (trangThaiPhong.equals("LTTP002")) {
                    createStatusRoom(trangThaiPhong, new Color(51, 176, 224), pnlRoom);
                    createNameRoom(room.getRoomID(), pnlRoom, new Color(113, 108, 176), room);
                } else {
                    createStatusRoom(trangThaiPhong, new Color(5, 154, 3), pnlRoom);
                    createNameRoom(room.getRoomID(), pnlRoom, Color.WHITE, room);

                }
                pnlListRoom.add(pnlRoom);
                x += width + 20;

                if (numberRoomVip % 5 == 0) {
                    countHeight += width + 20;
                    x = 20;
                }
                numberRoomVip++;
            }
        }

        scrollPanel.setViewportView(pnlListRoom);
    }

// trạng thái phòng
    private void createStatusRoom(String idTrangThai, Color color, JPanel pnlRom) {
        TitledBorder titledBorder = BorderFactory.createTitledBorder(
                roomStatusTypeDAO.finRoomStatusTypeById(idTrangThai).getRoomStatusTypeName().toUpperCase());
        titledBorder.setTitleColor(color);
        titledBorder.setTitleFont(new Font("Segoe UI", Font.PLAIN, 10));
        pnlRom.setBorder(titledBorder);
    }
// tên phòng

    private void createNameRoom(String idPhong, JPanel pnlRom, Color colorBackground, Room room) {
//        lblRoom = new JButton();
//        lblRoom.setText(roomDAO.findRoomById(idPhong).getTenPhong());
//        lblRoom.setOpaque(true);
//        lblRoom.setBackground(colorBackground);
//        lblRoom.setFont(new Font("Segoe UI", Font.BOLD, 14));
//        lblRoom.setHorizontalAlignment((int) CENTER_ALIGNMENT);
//        lblRoom.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                nameRoom = room.getTenPhong();
//            }
//        });
//        pnlRom.add(lblRoom, BorderLayout.CENTER);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlRoom;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables
}
