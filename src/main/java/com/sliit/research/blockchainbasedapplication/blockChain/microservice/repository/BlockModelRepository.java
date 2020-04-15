package com.sliit.research.blockchainbasedapplication.blockChain.microservice.repository;

import com.sliit.research.blockchainbasedapplication.blockChain.microservice.model.BlockModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockModelRepository extends JpaRepository<BlockModel, Long> {
}
