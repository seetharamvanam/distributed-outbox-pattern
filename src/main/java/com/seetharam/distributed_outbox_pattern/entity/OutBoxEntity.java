package com.seetharam.distributed_outbox_pattern.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "outbox")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class OutBoxEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "eventType")
    private String eventType;
    @Column(name = "payload")
    private String payload;
    @Column(name = "publishedAt")
    private LocalDateTime publishedAt;
}
