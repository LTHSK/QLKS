/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import java.awt.Desktop;

import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;

import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Trinh Cui Bap
 */
public class Form_HoaDon extends javax.swing.JFrame {

    private static String maHD;
    public DefaultTableModel modalXuatHoaDon;
//    private DAO_HoaDon dao_HD;
//    private DAO_ChiTietHoaDon dao_CTHD;
//    private DAO_NhanVien dao_NV;
//    private DAO_LoaiNhanVien dao_LNS;
//    private DAO_KhachHang kh_dao;
    DecimalFormat df = new DecimalFormat("#,##0 VND");

    /**
     * Creates new form Form_HoaDon
     */
    public Form_HoaDon(String ma) {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        maHD = ma;
        initComponents();
        setLocationRelativeTo(null);
        modalXuatHoaDon = (DefaultTableModel) tableXuatHoaDon.getModel();
        modalXuatHoaDon.addRow(new Object[]{});
        loadDL();
        this.setUndecorated(true);
    }

    private void loadDL() {
//        dao_HD = new DAO_HoaDon();
//        dao_CTHD = new DAO_ChiTietHoaDon();
//        dao_NV = new DAO_NhanVien();
//        dao_LNS = new DAO_LoaiNhanVien();
//        int tongSL = 0;
//        List<ChiTietHoaDon> list = dao_CTHD.layDSHDBangMa(maHD);
//        modalXuatHoaDon.setRowCount(0);
//        for (ChiTietHoaDon l : list) {
//            modalXuatHoaDon.addRow(new Object[]{
//                l.getSanPham().getTenSP(), l.getSoLuong(),
//                df.format(l.getSanPham().getGiaGoc()), df.format(l.getSanPham().getGiaGoc()*l.getSoLuong())
//            });
//            tongSL += l.getSoLuong();
//        }
//        lblNgay.setText(dao_HD.layHoaDonTheoMa(maHD).getNgayLap().toString());
//        NhanVien nv = dao_HD.layHoaDonTheoMa(maHD).getNhanVien();
//        lblThuNgan.setText(nv.getTenNV());
//        KhachHang kh = dao_HD.layHoaDonTheoMa(maHD).getKhachHang();
//        lblTenKH.setText(kh.getTenKH());
//        lblMaPhieu.setText(maHD);
//        txtTongSoLuong.setText("" + tongSL);
//        String km;
//        double tc;
//        if (dao_HD.layHoaDonTheoMa(maHD).getKhachHang().getLoaiKhachHang().getMaLoaiKH().equals("LKH001")) {
//            km = "10";
//            tc = dao_HD.layHoaDonTheoMa(maHD).getThanhTien();
//        } else {
//            km = "0";
//            tc = dao_HD.layHoaDonTheoMa(maHD).getThanhTien();
//
//        }
//        lblKhuyenMai.setText(km + "%");
//
//        txtTongCong.setText("" + df.format(tc));
//        lplTienKhachDua.setText("   " + df.format(dao_HD.layHoaDonTheoMa(maHD).getTienKhachDua()));
//        double thoi = dao_HD.layHoaDonTheoMa(maHD).getTienKhachDua() - tc;
//        lplTienThoi.setText("  " + df.format(thoi));
    }

//    public void PrintFrameToPDF(JPanel c) {
//        try {
//            Document document = new Document();
//            PdfWriter.getInstance(document, new FileOutputStream("HoaDon.pdf"));
//            document.open();
//            BaseFont bf = BaseFont.createFont("c:\\windows\\fonts\\times.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
//            Font font1 = new Font(bf, 16, Font.BOLD);
//            Font font2 = new Font(bf, 14, Font.NORMAL);
//            Paragraph tenCuaHang = new Paragraph("Cửa hàng thời trang BHTT", font1);
//            tenCuaHang.setAlignment(Element.ALIGN_CENTER);
//            Paragraph diaChi = new Paragraph("Địa chỉ 12 Nguyễn Văn Bảo, phường 4 \n Quận Gò Vấp, thành phố Hồ Chí mình \n Điện thoại: 08214851251", font2);
//            diaChi.setAlignment(Element.ALIGN_CENTER);
//            Paragraph tenHoaDon = new Paragraph("HÓA ĐƠN BÁN HÀNG\n\n", font1);
//            tenHoaDon.setAlignment(Element.ALIGN_CENTER);
//            PdfPTable tableTop = new PdfPTable(4);
//            PdfPCell cell1 = new PdfPCell(new Phrase("Ngày:", font2));
//            cell1.setBorder(Rectangle.NO_BORDER);
//            tableTop.addCell(cell1);
//
//            PdfPCell cell2 = new PdfPCell(new Phrase(lblNgay.getText(), font2));
//            cell2.setBorder(Rectangle.NO_BORDER);
//            tableTop.addCell(cell2);
//
//            PdfPCell cell3 = new PdfPCell(new Phrase("Mã phiếu:", font2));
//            cell3.setBorder(Rectangle.NO_BORDER);
//            tableTop.addCell(cell3);
//
//            PdfPCell cell4 = new PdfPCell(new Phrase(lblMaPhieu.getText(), font2));
//            cell4.setBorder(Rectangle.NO_BORDER);
//            tableTop.addCell(cell4);
//
//            PdfPCell cell5 = new PdfPCell(new Phrase("Thu ngân:", font2));
//            cell5.setBorder(Rectangle.NO_BORDER);
//            tableTop.addCell(cell5);
//
//            PdfPCell cell6 = new PdfPCell(new Phrase(lblThuNgan.getText(), font2));
//            cell6.setBorder(Rectangle.NO_BORDER);
//            tableTop.addCell(cell6);
//
//            PdfPCell cell7 = new PdfPCell(new Phrase("Khách hàng:", font2));
//            cell7.setBorder(Rectangle.NO_BORDER);
//            tableTop.addCell(cell7);
//
//            PdfPCell cell8 = new PdfPCell(new Phrase(lblTenKH.getText() + "\n\n\n\n", font2));
//            cell8.setBorder(Rectangle.NO_BORDER);
//            tableTop.addCell(cell8);
//
//            PdfPTable tableND = new PdfPTable(4);
//            tableND.setPaddingTop(TOP_ALIGNMENT);
//            PdfPCell cot1 = new PdfPCell(new Phrase("Sản phẩm", font2));
//            PdfPCell cot2 = new PdfPCell(new Phrase("Số lượng", font2));
//            PdfPCell cot3 = new PdfPCell(new Phrase("Giá", font2));
//            PdfPCell cot4 = new PdfPCell(new Phrase("Thành tiền", font2));
//            tableND.addCell(cot1);
//            tableND.addCell(cot2);
//            tableND.addCell(cot3);
//            tableND.addCell(cot4);
//
//            for (int i = 0; i < tableXuatHoaDon.getModel().getRowCount(); i++) {
//                tableND.addCell(new Phrase(tableXuatHoaDon.getModel().getValueAt(i, 0).toString(), font2));
//                tableND.addCell(tableXuatHoaDon.getModel().getValueAt(i, 1).toString());
//                tableND.addCell(tableXuatHoaDon.getModel().getValueAt(i, 2).toString());
//                tableND.addCell(tableXuatHoaDon.getModel().getValueAt(i, 3).toString()+"\n\n\n\n");
//
//            }
//          
//            PdfPTable tableBot = new PdfPTable(2);
//            PdfPCell bot1 = new PdfPCell(new Phrase("Tổng số lượng: ", font2));
//            bot1.setBorder(Rectangle.NO_BORDER);
//            tableBot.addCell(bot1);
//            
//             PdfPCell bot2 = new PdfPCell(new Phrase(txtTongSoLuong.getText(), font2));
//            bot2.setBorder(Rectangle.NO_BORDER);
//            tableBot.addCell(bot2);
//            
//             PdfPCell bot3 = new PdfPCell(new Phrase("Khuyến mãi: ", font2));
//            bot3.setBorder(Rectangle.NO_BORDER);
//            tableBot.addCell(bot3);
//            
//            
//            PdfPCell bot4 = new PdfPCell(new Phrase(lblKhuyenMai.getText(), font2));
//            bot4.setBorder(Rectangle.NO_BORDER);
//            tableBot.addCell(bot4);
//            
//          
//            
//             PdfPCell bot5 = new PdfPCell(new Phrase("Tổng cộng: ", font1));
//            bot5.setBorder(Rectangle.NO_BORDER);
//            tableBot.addCell(bot5);
//            
//            PdfPCell bot6 = new PdfPCell(new Phrase(txtTongCong.getText(), font2));
//            bot6.setBorder(Rectangle.NO_BORDER);
//            tableBot.addCell(bot6);
//            
//        
//            
//             PdfPCell bot7 = new PdfPCell(new Phrase("Tiền khách đưa: ", font2));
//            bot7.setBorder(Rectangle.NO_BORDER);
//            tableBot.addCell(bot7);
//            
//             PdfPCell bot8 = new PdfPCell(new Phrase(lplTienKhachDua.getText(), font2));
//            bot8.setBorder(Rectangle.NO_BORDER);
//            tableBot.addCell(bot8);
//            
//             PdfPCell bot9 = new PdfPCell(new Phrase("Tiền thối lại: ", font2));
//            bot9.setBorder(Rectangle.NO_BORDER);
//            tableBot.addCell(bot9);
//            
//            
//             PdfPCell bot10 = new PdfPCell(new Phrase(lplTienThoi.getText(), font2));
//            bot10.setBorder(Rectangle.NO_BORDER);
//            tableBot.addCell(bot10);
//            
//            
//            document.add(tenCuaHang);
//            document.add(diaChi);
//            document.add(tenHoaDon);
//            document.add(tableTop);
//            document.add(tableND);
//            document.add(tableBot);
//            document.close();
//        } catch (Exception e) {
//            //
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pnlHoaDon = new javax.swing.JPanel();
        pblTren = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblNgay = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblThuNgan = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblMaPhieu = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableXuatHoaDon = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        pnlGiua = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtTongSoLuong = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblKM = new javax.swing.JPanel();
        lblKhuyenMai = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTongCong = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lplTienKhachDua = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lplTienThoi = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        pnlDuoi = new javax.swing.JPanel();
        btnHoanThanh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnIn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlHoaDon.setPreferredSize(new java.awt.Dimension(515, 790));
        pnlHoaDon.setLayout(new javax.swing.BoxLayout(pnlHoaDon, javax.swing.BoxLayout.Y_AXIS));

        pblTren.setLayout(new javax.swing.BoxLayout(pblTren, javax.swing.BoxLayout.Y_AXIS));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HÓA ĐƠN THANH TOÁN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quận Gò Vấp,Thành phố Hồ Chí Minh");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Khách sạn H&M");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ĐT: 08214851251");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đc: 12 Nguyễn Văn Bảo, phường 4");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel2)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel3)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel4)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel5)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pblTren.add(jPanel5);

        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.X_AXIS));

        jPanel14.setMaximumSize(new java.awt.Dimension(20, 32767));
        jPanel14.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel14);

        jPanel12.setLayout(new java.awt.GridLayout(3, 2));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ngày:");
        jPanel12.add(jLabel6);

        lblNgay.setText("24/10/2022");
        jPanel12.add(lblNgay);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Thu ngân:");
        jPanel12.add(jLabel7);

        lblThuNgan.setText("Nguyễn Văn A");
        jPanel12.add(lblThuNgan);

        jLabel17.setText("Phòng:");
        jPanel12.add(jLabel17);

        jLabel18.setText("P001");
        jPanel12.add(jLabel18);

        jPanel10.add(jPanel12);

        jPanel15.setMaximumSize(new java.awt.Dimension(50, 32767));
        jPanel15.setPreferredSize(new java.awt.Dimension(50, 40));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel15);

        jPanel11.setLayout(new java.awt.GridLayout(3, 2));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mã phiếu");
        jPanel11.add(jLabel8);

        lblMaPhieu.setText("HD001");
        jPanel11.add(lblMaPhieu);

        jLabel9.setText("Khách hàng");
        jPanel11.add(jLabel9);

        lblTenKH.setText("Trần Văn Vinh");
        jPanel11.add(lblTenKH);

        jPanel10.add(jPanel11);

        jPanel13.setMaximumSize(new java.awt.Dimension(20, 32767));
        jPanel13.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel13);

        pblTren.add(jPanel10);

        pnlHoaDon.add(pblTren);

        tableXuatHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sản phẩm", "Số lượng", "Giá", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(tableXuatHoaDon);

        pnlHoaDon.add(jScrollPane1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlHoaDon.add(jPanel8);

        pnlGiua.setLayout(new javax.swing.BoxLayout(pnlGiua, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pnlGiua.add(jPanel4);

        jPanel2.setMaximumSize(new java.awt.Dimension(500, 32767));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 122));
        jPanel2.setLayout(new java.awt.GridLayout(6, 2));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Tổng số lượng :");
        jPanel2.add(jLabel10);

        txtTongSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTongSoLuong.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel2.add(txtTongSoLuong);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Khuyến mãi :");
        jPanel2.add(jLabel11);

        lblKM.setLayout(new javax.swing.BoxLayout(lblKM, javax.swing.BoxLayout.X_AXIS));

        lblKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblKhuyenMai.setText("5%");
        lblKhuyenMai.setMaximumSize(new java.awt.Dimension(700, 900));
        lblKhuyenMai.setMinimumSize(new java.awt.Dimension(80, 0));
        lblKhuyenMai.setPreferredSize(new java.awt.Dimension(80, 0));
        lblKM.add(lblKhuyenMai);

        jPanel2.add(lblKM);
        jPanel2.add(jLabel15);
        jPanel2.add(jLabel16);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Tổng Cộng");
        jPanel2.add(jLabel12);

        txtTongCong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTongCong.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel2.add(txtTongCong);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Tiền khách đưa");
        jPanel2.add(jLabel13);

        lplTienKhachDua.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel2.add(lplTienKhachDua);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Tiền thối lại");
        jPanel2.add(jLabel14);

        lplTienThoi.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel2.add(lplTienThoi);

        pnlGiua.add(jPanel2);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pnlGiua.add(jPanel9);

        pnlHoaDon.add(pnlGiua);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlHoaDon.add(jPanel7);

        pnlDuoi.setLayout(new javax.swing.BoxLayout(pnlDuoi, javax.swing.BoxLayout.X_AXIS));

        btnHoanThanh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHoanThanh.setText("Hoàn thành");
        btnHoanThanh.setMaximumSize(new java.awt.Dimension(107, 40));
        btnHoanThanh.setPreferredSize(new java.awt.Dimension(107, 40));
        btnHoanThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoanThanhActionPerformed(evt);
            }
        });
        pnlDuoi.add(btnHoanThanh);

        jPanel1.setMaximumSize(new java.awt.Dimension(50, 60));
        jPanel1.setMinimumSize(new java.awt.Dimension(20, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        pnlDuoi.add(jPanel1);

        btnIn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIn.setText("In hóa đơn");
        btnIn.setMaximumSize(new java.awt.Dimension(103, 40));
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });
        pnlDuoi.add(btnIn);

        pnlHoaDon.add(pnlDuoi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHoanThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoanThanhActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnHoanThanhActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        JOptionPane.showMessageDialog(null, "In hóa đơn thành công");
        this.setVisible(false);
//        PrintFrameToPDF(pnlHoaDon);
         try{
           File file =new File ("C:\\Users\\bohie\\OneDrive\\Documents\\GitHub\\BHTT_JAVA\\BHTT\\HoaDon.pdf");
           if(file.exists()) {
               if(Desktop.isDesktopSupported()){
                   Desktop.getDesktop().open(file);
               }else{
                   JOptionPane.showMessageDialog(this, "Not Supported");
               }
           }else{
               JOptionPane.showMessageDialog(this, "File Not Exist");
           }
       }catch(Exception e){
           e.printStackTrace();
       }

    }//GEN-LAST:event_btnInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_HoaDon(maHD).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoanThanh;
    private javax.swing.JButton btnIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lblKM;
    private javax.swing.JLabel lblKhuyenMai;
    private javax.swing.JLabel lblMaPhieu;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblThuNgan;
    private javax.swing.JLabel lplTienKhachDua;
    private javax.swing.JLabel lplTienThoi;
    private javax.swing.JPanel pblTren;
    private javax.swing.JPanel pnlDuoi;
    private javax.swing.JPanel pnlGiua;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JTable tableXuatHoaDon;
    private javax.swing.JLabel txtTongCong;
    private javax.swing.JLabel txtTongSoLuong;
    // End of variables declaration//GEN-END:variables
}
