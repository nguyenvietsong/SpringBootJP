package com.bezkoder.springjwt.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "dethi")
@Data
public class Dethi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tendethi;

    private int thoigianthi;

    @ManyToOne
    private TrinhDo trinhdo;

    @OneToMany(mappedBy = "dethi")
    private Set<Cauhoi> cauhoi=new HashSet<>();

    public Dethi() {
    }

    public Dethi(Long id) {
        this.id = id;
    }

    public Dethi(Long id, String tendethi, int thoigianthi, TrinhDo trinhdo) {
        this.id = id;
        this.tendethi = tendethi;
        this.thoigianthi = thoigianthi;
        this.trinhdo = trinhdo;
    }


}
