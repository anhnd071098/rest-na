package vn.pdsoft.restna.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

/*
 * Phân quyền
 * censor : Người kiểm duyệt
 * author : Tác giả
 * Reader : Độc giả
 * */
@Data
@Entity
@Table(name = "tb_user")
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 255)
    private String email;
    private String name;
    @Column(nullable = false, length = 255)
    private String userId;
    @Column(nullable = false, length = 255)
    private String password;
    private String address;
    @Column(nullable = false)
    private Date dateCreated;
}
