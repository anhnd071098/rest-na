package vn.pdsoft.restna.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "tb_post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String postTitle;
    @Column(nullable = false)
    private String postDesc;
    @Column(nullable = false)
    private String postContent;
    @Column(nullable = false)
    private Date postCreated;
    @Column(nullable = false)
    private int userCreated;
}
