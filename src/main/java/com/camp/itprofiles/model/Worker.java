package com.camp.itprofiles.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;


@Entity
@Table(name = "t_workers")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "badge", unique = true)
    private Long badge;

    @Column(name = "last_name",nullable = false, length = 50)
    private String lastName;

    @Column(name = "first_name",nullable = false, length = 50)
    private String firstName;

    @Column(name = "middle_name",nullable = false, length = 50)
    private String middleName;

    @Column(name = "birthday",nullable = false, length = 20)
    private String birthday;

    @Column(name = "city",nullable = false, length = 50)
    private String city;

    @Column(name = "email",nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "phone",nullable = false, length = 50)
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "system_level_id", nullable = false)
    private SystemLevel systemLevel;
}
