package com.camp.itprofiles.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "t_system_levels")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SystemLevel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "system_level_name",nullable = false, length = 20, unique = true)
    private String systemLevelName;
}
