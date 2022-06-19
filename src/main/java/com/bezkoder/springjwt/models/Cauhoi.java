package com.bezkoder.springjwt.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "cauhoi")
public class Cauhoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String tieude;
    private double diem;

    @ManyToOne
    @JoinColumn(name = "dethi_id")
    private Dethi dethi;

    @OneToMany(mappedBy = "cauhoi")
    private Set<Dapan> dapan=new HashSet<>();

    public Dethi getDethi() {
        return dethi;
    }

    public Set<Dapan> getDapan() {
        return dapan;
    }

    public void setDapan(Set<Dapan> dapan) {
        this.dapan = dapan;
    }

    public void setDethi(Dethi dethi) {
        this.dethi = dethi;
    }

    public Cauhoi() {
    }

    public Cauhoi(long id) {
        this.id = id;
    }

    public Cauhoi(long id, String tieude, double diem) {
        this.id = id;
        this.tieude = tieude;
        this.diem = diem;
    }

    public long getId() {
        return id;
    }

    public String getTieude() {
        return tieude;
    }

    public double getDiem() {
        return diem;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
