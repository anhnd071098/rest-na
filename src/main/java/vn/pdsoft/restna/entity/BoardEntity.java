package vn.pdsoft.restna.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
@Table(name = "tb_board")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String nameBoard;
    @Column(nullable = false)
    private int userCreated;
    @Column(nullable = false)
    private Date boardCreated;
}
