package com.bezkoder.springjwt.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bailam")
public class Bailam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date ngaylam;
    private double diem;

    @ManyToOne
    @JoinColumn(name = "dethi_id")
    private Dethi dethi;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public Dethi getDethi() {
        return dethi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getNgaylam() {
        return ngaylam;
    }

    public void setNgaylam(Date ngaylam) {
        this.ngaylam = ngaylam;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void setDethi(Dethi dethi) {
        this.dethi = dethi;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
