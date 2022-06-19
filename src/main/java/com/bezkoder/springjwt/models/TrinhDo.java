package com.bezkoder.springjwt.models;

import lombok.Data;

import javax.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "trinhdo")
@Data
public class TrinhDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "trinhdo")
    private Set<Dethi> dethi =new HashSet<>();


}
