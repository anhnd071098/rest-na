package vn.pdsoft.restna.entity;

import jakarta.persistence.*;
import lombok.Data;

/*
* Phân quyền
* censor : Người kiểm duyệt
* author : Tác giả
* Reader : Độc giả
* */
@Data
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String email;
    private String name;
    @Column(nullable=false)
    private String userId;
    private String password;
    private String address;
}
