package ui;

import dao.RoomDAO;
import entity.Room;
import entity.RoomStatusType;
import entity.RoomType;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import regex.RegexHelper;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author KHANH PC
 */


public class GD_QLPhong extends javax.swing.JInternalFrame {

    /**
     * Creates new form GD_QLPhong
     */
    private int Rows; 
    ArrayList<UI_Phong> ds_UIPhong = null;
    List<Room> ds = null; 
    
    public void loadData() {
        ds = new RoomDAO().getAllRooms(); 
        Collections.sort(ds, new Comparator<Room>() {
            @Override
            public int compare(Room room1, Room room2) {
                return room1.getRoomID().compareTo(room2.getRoomID());
            }
        });
        Rows = (ds.size()+4)/5; 
        
        ds_UIPhong = new ArrayList<UI_Phong>(); 
        for( Room r : ds ) 
            ds_UIPhong.add(new UI_Phong(r)); 
        
        jPanel4.removeAll();
        for( UI_Phong ui_p : ds_UIPhong ) {
            jPanel4.add(ui_p); 
            ui_p.addMouseListener(new java.awt.event.MouseAdapter() {
                Color bgr = ui_p.getBGR().getBackground(); 
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    int mg = 30; 
                    ui_p.getBGR().setBackground(new Color(bgr.getRed()-mg, bgr.getGreen()-mg, bgr.getBlue()));
                }
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    ui_p.getBGR().setBackground(bgr);
                    
                    Room room = ui_p.getRoom(); 
                    txtMaPhong.setText(room.getRoomID());
                    txtTenPhong.setText(room.getRoomName()); 
                    String type = room.getRoomType().getRoomTypeID(); 
                    String status = room.getRoomStatusType().getRoomStatusTypeID(); 
                    txtMoTa.setText(room.getDescribe());
                    txtGia.setText(room.getRoomType().getPrice() + "");
                    if(type.equals("LP001")){
                        cbbLoaiPhong.setSelectedIndex(0);
                    } else if( type.equals("LP002")) {
                        cbbLoaiPhong.setSelectedIndex(1);
                    } else {
                        cbbLoaiPhong.setSelectedIndex(2);
                    }
                    
                    if( status.equals("LTTP001") ) {
                        cbbTrangThai.setSelectedIndex(0);
                    } else if( status.equals("LTTP002") ) {
                        cbbTrangThai.setSelectedIndex(1);
                    } else if( status.equals("LTTP003") ) {
                        cbbTrangThai.setSelectedIndex(2);
                    } else if( status.equals("LTTP004") ) {
                        cbbTrangThai.setSelectedIndex(3);
                    } else if( status.equals("LTTP005") ) {
                        cbbTrangThai.setSelectedIndex(4);
                    }
                    btnLuu.setText("Cập nhật");
                    btnLuu.setIcon( new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-update-done-25.png")) );
                }
            }); 
        }
            
        jPanel4.revalidate(); // Cập nhật layout cho JPanel
        jPanel4.repaint(); // Vẽ lại JPanel
        
        // thêm số lượng của mỗi loại phòng 
        int cntTrong = 0, cntDangO = 0, cntDaDAt = 0, cntDonDep = 0, cntBaoTri = 0;  
        for( Room r : ds ) {
            String s = r.getRoomStatusType().getRoomStatusTypeID(); 
            if(s.equals("LTTP001")) cntTrong++; 
            else if(s.equals("LTTP002")) cntDangO++; 
            else if(s.equals("LTTP003")) cntDaDAt++; 
            else if(s.equals("LTTP004")) cntBaoTri++; 
            else cntDonDep++; 
        }
        btnTrong.setText( "Trống" + "("+cntTrong+")" );
        btnDangSuDung.setText( "Đang ở" + "("+cntDangO+")" );
        btnDaDat.setText( "Đã đặt" + "("+cntDaDAt+")" );
        btnDonDep.setText( "Dọn dẹp" + "("+cntDonDep+")" );
        btnBaoTri.setText( "Bảo trì" + "("+cntBaoTri+")" );
        btnTatCa.setText("Tất cả"+ "("+ ds.size() +")"); 
    }
 
    private boolean checkData() {
        if(txtTenPhong.getText().isBlank() || txtGia.getText().isBlank() ) {
            JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ thông tin!");
            return false;
        } else {
            String thongBao = ""; 
            if( !RegexHelper.regexGia(txtGia.getText()) )
                thongBao += "*Giá tiền không hợp lệ\n"; 
            if(thongBao.isEmpty()) 
                return true; 
            JOptionPane.showMessageDialog(this, thongBao);
            return false; 
        }
    }
    
    public GD_QLPhong() {
        this.setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ui
                = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ui).setNorthPane(null);
        initComponents();
        loadData();        
        // tăng tốc độ scroll
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtTenPhong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        cbbLoaiPhong = new javax.swing.JComboBox<>();
        cbbTrangThai = new javax.swing.JComboBox<>();
        txtMoTa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtMaPhongTK = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbbTrangThaiTK = new javax.swing.JComboBox<>();
        cbbLoaiPhongTK = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        btnTrong = new javax.swing.JButton();
        btnDangSuDung = new javax.swing.JButton();
        btnDaDat = new javax.swing.JButton();
        btnDonDep = new javax.swing.JButton();
        btnBaoTri = new javax.swing.JButton();
        btnXoaPhong = new javax.swing.JButton();
        btnTatCa = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 244, 244));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setFrameIcon(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÊM VÀ CẬP NHẬT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên phòng:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Trạng thái: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Mô tả:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-file-25.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton1.setLabel("Thêm ");
        jButton1.setName("btnLuu"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnThemMoiMouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 120, 40));

        txtTenPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenPhongActionPerformed(evt);
            }
        });
        jPanel1.add(txtTenPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Mã phòng: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtMaPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMaPhong.setEnabled(false);
        txtMaPhong.setName(""); // NOI18N
        jPanel1.add(txtMaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 350, 30));

        cbbLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giường đơn", "Giường đôi", "Giường đôi lớn" }));
        jPanel1.add(cbbLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, 30));

        cbbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trống", "Đang sử dụng", "Đã đặt", "Bảo trì", "Dọn dẹp", " " }));
        jPanel1.add(cbbTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 120, 30));

        txtMoTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoTaActionPerformed(evt);
            }
        });
        jPanel1.add(txtMoTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 350, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Loại phòng: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        btnLuu.setBackground(new java.awt.Color(0, 102, 102));
        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-save-25.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnLuu.setName("btnLuu"); // NOI18N
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLuuMouseReleased(evt);
            }
        });
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 120, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Giá tiền:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 70, -1));

        txtGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaActionPerformed(evt);
            }
        });
        jPanel1.add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 120, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMaPhongTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhongTKActionPerformed(evt);
            }
        });
        jPanel2.add(txtMaPhongTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 130, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Mã phòng: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Trạng thái:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        cbbTrangThaiTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Trống", "Đang sử dụng", "Đã đặt", "Bảo trì", "Dọn dẹp" }));
        cbbTrangThaiTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTrangThaiTKActionPerformed(evt);
            }
        });
        jPanel2.add(cbbTrangThaiTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 130, 30));

        cbbLoaiPhongTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Giường đơn", "Giường đôi", "Giường đôi lớn" }));
        cbbLoaiPhongTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiPhongTKActionPerformed(evt);
            }
        });
        jPanel2.add(cbbLoaiPhongTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 130, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Loại phòng: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btnTimKiem.setBackground(new java.awt.Color(0, 102, 102));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-25.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnTimKiem.setName("btnTimKiem"); // NOI18N
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseReleased(evt);
            }
        });
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 130, 40));
        btnTimKiem.getAccessibleContext().setAccessibleDescription("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DANH SÁCH PHÒNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel3.setFocusable(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new java.awt.GridLayout(Rows, 5));
        jScrollPane2.setViewportView(jPanel4);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 890, 410));

        btnTrong.setBackground(new java.awt.Color(70, 141, 188));
        btnTrong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTrong.setForeground(new java.awt.Color(255, 255, 255));
        btnTrong.setText("Trống");
        btnTrong.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnTrong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrong.setName("btnTrong"); // NOI18N
        btnTrong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTrongMouseReleased(evt);
            }
        });
        btnTrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrongActionPerformed(evt);
            }
        });
        jPanel3.add(btnTrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, 40));

        btnDangSuDung.setBackground(new java.awt.Color(219, 51, 60));
        btnDangSuDung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangSuDung.setForeground(new java.awt.Color(255, 255, 255));
        btnDangSuDung.setText("Đang ở");
        btnDangSuDung.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnDangSuDung.setName("btnDangO"); // NOI18N
        btnDangSuDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDangOMouseReleased(evt);
            }
        });
        btnDangSuDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangSuDungActionPerformed(evt);
            }
        });
        jPanel3.add(btnDangSuDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 40));

        btnDaDat.setBackground(new java.awt.Color(46, 139, 87));
        btnDaDat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDaDat.setForeground(new java.awt.Color(255, 255, 255));
        btnDaDat.setText("Đã đặt");
        btnDaDat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnDaDat.setName("btnDaDat"); // NOI18N
        btnDaDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDaDatMouseReleased(evt);
            }
        });
        btnDaDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaDatActionPerformed(evt);
            }
        });
        jPanel3.add(btnDaDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, 40));

        btnDonDep.setBackground(new java.awt.Color(181, 171, 107));
        btnDonDep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDonDep.setForeground(new java.awt.Color(255, 255, 255));
        btnDonDep.setText("Dọp dẹp");
        btnDonDep.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnDonDep.setName("btnDonDep"); // NOI18N
        btnDonDep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDonDepMouseReleased(evt);
            }
        });
        btnDonDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonDepActionPerformed(evt);
            }
        });
        jPanel3.add(btnDonDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 40));

        btnBaoTri.setBackground(new java.awt.Color(240, 119, 37));
        btnBaoTri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBaoTri.setForeground(new java.awt.Color(255, 255, 255));
        btnBaoTri.setText("Bảo trì");
        btnBaoTri.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnBaoTri.setName("btnBaoTri"); // NOI18N
        btnBaoTri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBaoTriMouseReleased(evt);
            }
        });
        btnBaoTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaoTriActionPerformed(evt);
            }
        });
        jPanel3.add(btnBaoTri, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, 40));

        btnXoaPhong.setBackground(new java.awt.Color(0, 102, 102));
        btnXoaPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaPhong.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-25.png"))); // NOI18N
        btnXoaPhong.setText("Xoá");
        btnXoaPhong.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnXoaPhong.setName("bntXoa"); // NOI18N
        btnXoaPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnXoaPhongMouseReleased(evt);
            }
        });
        btnXoaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhongActionPerformed(evt);
            }
        });
        jPanel3.add(btnXoaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 110, 40));

        btnTatCa.setBackground(new java.awt.Color(0, 102, 102));
        btnTatCa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTatCa.setForeground(new java.awt.Color(255, 255, 255));
        btnTatCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-select-all-25.png"))); // NOI18N
        btnTatCa.setText("Tất cả");
        btnTatCa.setToolTipText("");
        btnTatCa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnTatCa.setName("btnXemTatCa"); // NOI18N
        btnTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTatCaMouseReleased(evt);
            }
        });
        jPanel3.add(btnTatCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jPanel3.getAccessibleContext().setAccessibleParent(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTimKiemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtMaPhongTKActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtMaPhongTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhongTKActionPerformed

    private void btnBaoTriActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnBaoTriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBaoTriActionPerformed

    private void btnTrongActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnTrongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrongActionPerformed

    private void btnDangSuDungActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDangSuDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangSuDungActionPerformed

    private void btnDaDatActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDaDatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDaDatActionPerformed

    private void btnDonDepActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDonDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDonDepActionPerformed

    private void txtMoTaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtMoTaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoTaActionPerformed

    private void txtTenPhongActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtTenPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenPhongActionPerformed

    private void cbbTrangThaiTKActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cbbTrangThaiTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTrangThaiTKActionPerformed

    private void cbbLoaiPhongTKActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cbbLoaiPhongTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbLoaiPhongTKActionPerformed

    private void btnTrongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrongMouseReleased
        // TODO add your handling code here:
        jPanel4.removeAll();
        
        for( UI_Phong u : ds_UIPhong ) {
            if(u.getRoom().getRoomStatusType().getRoomStatusTypeID().equals("LTTP001")) 
                jPanel4.add(u); 
        }
        jPanel4.revalidate(); // Cập nhật layout cho JPanel
        jPanel4.repaint(); // Vẽ lại JPanel
    }//GEN-LAST:event_btnTrongMouseReleased

    private void btnDangOMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangOMouseReleased
        // TODO add your handling code here:
        jPanel4.removeAll();
        for( UI_Phong u : ds_UIPhong ) {
            if(u.getRoom().getRoomStatusType().getRoomStatusTypeID().equals("LTTP002")) 
                jPanel4.add(u); 
        }
        jPanel4.revalidate(); // Cập nhật layout cho JPanel
        jPanel4.repaint(); // Vẽ lại JPanel
    }//GEN-LAST:event_btnDangOMouseReleased

    private void btnDaDatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaDatMouseReleased
        // TODO add your handling code here:
        jPanel4.removeAll();
        for( UI_Phong u : ds_UIPhong ) {
            if(u.getRoom().getRoomStatusType().getRoomStatusTypeID().equals("LTTP003")) 
                jPanel4.add(u); 
        }
        jPanel4.revalidate(); // Cập nhật layout cho JPanel
        jPanel4.repaint(); // Vẽ lại JPanel
    }//GEN-LAST:event_btnDaDatMouseReleased

    private void btnDonDepMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDonDepMouseReleased
        // TODO add your handling code here:
        jPanel4.removeAll();
        for( UI_Phong u : ds_UIPhong ) {
            if(u.getRoom().getRoomStatusType().getRoomStatusTypeID().equals("LTTP005")) 
                jPanel4.add(u); 
        }
        jPanel4.revalidate(); // Cập nhật layout cho JPanel
        jPanel4.repaint(); // Vẽ lại JPanel
    }//GEN-LAST:event_btnDonDepMouseReleased

    private void btnBaoTriMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaoTriMouseReleased
        // TODO add your handling code here:
        jPanel4.removeAll();
        for( UI_Phong u : ds_UIPhong ) {
            
            if(u.getRoom().getRoomStatusType().getRoomStatusTypeID().equals("LTTP004")) 
                jPanel4.add(u); 
        }
        jPanel4.revalidate(); // Cập nhật layout cho JPanel
        jPanel4.repaint(); // Vẽ lại JPanel
    }//GEN-LAST:event_btnBaoTriMouseReleased
    
    // Xem tất cả
    private void btnTatCaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTatCaMouseReleased
        // TODO add your handling code here:
        jPanel4.removeAll();
        for( UI_Phong u : ds_UIPhong ) {
            jPanel4.add(u); 
        }
        jPanel4.revalidate(); // Cập nhật layout cho JPanel
        jPanel4.repaint(); // Vẽ lại JPanel
    }//GEN-LAST:event_btnTatCaMouseReleased

    private void btnXoaPhongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaPhongMouseReleased
        // TODO add your handling code here:
        ArrayList<Room> roomSelects = new ArrayList<Room>(); 
        for( UI_Phong u : ds_UIPhong ) {
            if( u.isSelect() ) 
                roomSelects.add(u.getRoom()); 
        }
        if( roomSelects.isEmpty() ) {
            JOptionPane.showMessageDialog(rootPane, "Chưa chọn phòng nào");
            return; 
        }

        int luaChon = JOptionPane.showConfirmDialog(rootPane, "Bạn đã chắc chắn chưa", "", JOptionPane.YES_NO_OPTION);
        if(luaChon==0) {
            for( UI_Phong u : ds_UIPhong ) {
                if( u.isSelect() ) 
                    new RoomDAO().deleteRoom(u.getRoom().getRoomID());
            }
        }
        loadData();
    }//GEN-LAST:event_btnXoaPhongMouseReleased

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnThemMoiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMoiMouseReleased
        // mã phòng tự sinh
        txtMaPhong.setText(new RoomDAO().getMaPhong()); 
        cbbTrangThai.setSelectedItem("Bảo trì");
        txtTenPhong.setText( "Phòng "+ txtMaPhong.getText()); 
        btnLuu.setText("Lưu");
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-save-25.png")));
    }//GEN-LAST:event_btnThemMoiMouseReleased

    private void btnTimKiemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseReleased
        // TODO add your handling code here:
        if( txtMaPhongTK.getText().isBlank() ){
            String status = (String) cbbTrangThaiTK.getSelectedItem();
            String type = (String) cbbLoaiPhongTK.getSelectedItem(); 
            
            jPanel4.removeAll();
            for( UI_Phong u : ds_UIPhong ) {
                String roomType = u.getRoom().getRoomType().getRoomTypeName(); 
                String roomStatus = u.getRoom().getRoomStatusType().getRoomStatusTypeName();  
                if( (type.equalsIgnoreCase(roomType) || type.equalsIgnoreCase("Tất cả")) 
                     && (status.equalsIgnoreCase(roomStatus) || status.equalsIgnoreCase("Tất cả")) )
                    jPanel4.add(u); 
            }
            jPanel4.revalidate(); // Cập nhật layout cho JPanel
            jPanel4.repaint(); // Vẽ lại JPanel
        } 
        
        // tìm kiếm theo mã
        else {
            cbbTrangThaiTK.setSelectedIndex(0);
            cbbLoaiPhongTK.setSelectedIndex(0);
            jPanel4.removeAll();
            for( UI_Phong u : ds_UIPhong ) {
                if( u.getRoom().getRoomID().equals(txtMaPhongTK.getText()) ){
                    jPanel4.add(u); 
                    break; 
                } 
            }
            jPanel4.revalidate(); // Cập nhật layout cho JPanel
            jPanel4.repaint(); // Vẽ lại JPanel     
        }
        
        
    }//GEN-LAST:event_btnTimKiemMouseReleased

    private void txtGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaActionPerformed


    
    private void btnLuuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseReleased
        
        if(checkData()) {
            try {
                Room phong = new Room(); 
                phong.setRoomID(txtMaPhong.getText());
                phong.setRoomName(txtTenPhong.getText());
                phong.setDescribe(txtMoTa.getText());

                String type = cbbLoaiPhong.getSelectedItem()+""; 
                String status = cbbTrangThai.getSelectedItem()+""; 

                String IDtype="", IDstatus = ""; 
                if(type.equals("Giường đơn")) IDtype = "LP001";
                else if(type.equals("Giường đôi")) IDtype = "LP002";
                else if(type.equals("Giường đôi lớn")) IDtype = "LP003";

                if(status.equals("Trống")) IDstatus = "LTTP001"; 
                else if(status.equals("Đang sử dụng")) IDstatus = "LTTP002"; 
                else if(status.equals("Đã đặt")) IDstatus = "LTTP003"; 
                else if(status.equals("Bảo trì")) IDstatus = "LTTP004"; 
                else if(status.equals("Dọn dẹp")) IDstatus = "LTTP005"; 


                double price = Double.parseDouble(txtGia.getText()); 

                phong.setRoomStatusType(new RoomStatusType(IDstatus, status));
                phong.setRoomType(new RoomType(IDtype, type, price));

                if(btnLuu.getText().equals("Lưu"))
                    new RoomDAO().SaveRoom(phong); 
                else 
                    new RoomDAO().updateRoom(phong); 

                txtMaPhong.setText("");
                txtTenPhong.setText("");
                txtGia.setText("");
                cbbLoaiPhong.setSelectedIndex(0);
                cbbTrangThai.setSelectedIndex(0);
                loadData(); 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnLuuMouseReleased

    private void btnXoaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhongActionPerformed
   
    }//GEN-LAST:event_btnXoaPhongActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaoTri;
    private javax.swing.JButton btnDaDat;
    private javax.swing.JButton btnDangSuDung;
    private javax.swing.JButton btnDonDep;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnTatCa;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTrong;
    private javax.swing.JButton btnXoaPhong;
    private javax.swing.JComboBox<String> cbbLoaiPhong;
    private javax.swing.JComboBox<String> cbbLoaiPhongTK;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private javax.swing.JComboBox<String> cbbTrangThaiTK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtMaPhongTK;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtTenPhong;
    // End of variables declaration//GEN-END:variables

}
