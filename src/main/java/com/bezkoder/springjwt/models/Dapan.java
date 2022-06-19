package com.bezkoder.springjwt.models;

import javax.persistence.*;

@Entity
@Table(name = "dapan")
public class Dapan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String noidung;
    private boolean trangthai;

    @ManyToOne
    @JoinColumn(name = "cauhoi_id")
    private Cauhoi cauhoi;

    public Dapan() {
    }

    public Dapan(Long id, String noidung, boolean trangthai, Cauhoi cauhoi) {
        this.id = id;
        this.noidung = noidung;
        this.trangthai = trangthai;
        this.cauhoi = cauhoi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public Cauhoi getCauhoi() {
        return cauhoi;
    }

    public void setCauhoi(Cauhoi cauhoi) {
        this.cauhoi = cauhoi;
    }
}
