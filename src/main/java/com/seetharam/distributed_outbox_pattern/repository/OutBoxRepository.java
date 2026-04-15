package com.seetharam.distributed_outbox_pattern.repository;

import com.seetharam.distributed_outbox_pattern.entity.OutBoxEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface OutBoxRepository extends JpaRepository<OutBoxEntity, UUID> {
    Optional<OutBoxEntity> findByPublishedAtIsNull();
}
