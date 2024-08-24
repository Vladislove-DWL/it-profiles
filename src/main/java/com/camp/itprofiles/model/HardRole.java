package com.camp.itprofiles.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_hard_roles")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HardRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name", nullable = false, length = 50, unique = true)
    private String roleName;
}