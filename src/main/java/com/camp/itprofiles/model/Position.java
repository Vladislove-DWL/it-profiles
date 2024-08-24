package com.camp.itprofiles.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_positions")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "position_name", nullable = false, length = 50, unique = true)
    private String positionName;
}
