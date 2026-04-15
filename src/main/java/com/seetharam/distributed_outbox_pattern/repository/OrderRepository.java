package com.seetharam.distributed_outbox_pattern.repository;

import com.seetharam.distributed_outbox_pattern.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {
}
