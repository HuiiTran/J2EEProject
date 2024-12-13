package com.example.studentmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOPHOC")
public class LopHocModel {

    @Id
    @Column(name="MaLop")
    private String maLop;

    @Column(name="TenLop")
    private String tenLop;

    @Column(name="MaGV")
    private String maGV;

    @Column(name="MaMH")
    private String maMH;

    @Column(name="NgayHoc")
    private String ngayHoc;

    @Column(name="ThoiGianBatDau")
    private String thoiGianBatDau;

    @Column(name="ThoiGianKetThuc")
    private String thoiGianKetThuc;

    @Column(name="MaKH")
    private String maKH;

    @Column(name="MaPH")
    private String maPH;

    public LopHocModel() {
    }

    public LopHocModel(String maLop, String tenLop, String maGV, String maMH, String ngayHoc, String thoiGianBatDau, String thoiGianKetThuc, String maKH, String maPH) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maGV = maGV;
        this.maMH = maMH;
        this.ngayHoc = ngayHoc;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.maKH = maKH;
        this.maPH = maPH;
    }

    public String getNgayHoc() {
        return ngayHoc;
    }

    public void setNgayHoc(String ngayHoc) {
        this.ngayHoc = ngayHoc;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaPH() {
        return maPH;
    }

    public void setMaPH(String maPH) {
        this.maPH = maPH;
    }
}
