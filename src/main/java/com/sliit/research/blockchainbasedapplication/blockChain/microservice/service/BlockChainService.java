package com.sliit.research.blockchainbasedapplication.blockChain.microservice.service;

import com.sliit.research.blockchainbasedapplication.blockChain.microservice.blockChain.Block;
import com.sliit.research.blockchainbasedapplication.blockChain.microservice.model.BlockModel;

import java.util.List;

public interface BlockChainService {
    BlockModel addBlock(Block block);
    List<Block> getBlockChain();
    void getBlockChainFromDb();
}
