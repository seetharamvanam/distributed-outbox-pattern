package com.seetharam.distributed_outbox_pattern.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "orderDetails")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "productID")
    private String productID;
    @Column(name = "location")
    private String location;
    @Column(name = "orderDate")
    private LocalDateTime orderDate;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;

}
