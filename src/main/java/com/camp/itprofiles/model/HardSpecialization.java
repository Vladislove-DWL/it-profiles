package com.camp.itprofiles.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_hard_specializations")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HardSpecialization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "specialization_name", nullable = false, length = 50, unique = true)
    private String specializationName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private HardRole hardRole;
}
