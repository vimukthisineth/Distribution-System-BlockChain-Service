package com.sliit.research.blockchainbasedapplication.blockChain.microservice.controller;

import com.sliit.research.blockchainbasedapplication.blockChain.microservice.blockChain.Block;
import com.sliit.research.blockchainbasedapplication.blockChain.microservice.blockChain.BlockChain;
import com.sliit.research.blockchainbasedapplication.blockChain.microservice.model.BlockModel;
import com.sliit.research.blockchainbasedapplication.blockChain.microservice.repository.BlockModelRepository;
import com.sliit.research.blockchainbasedapplication.blockChain.microservice.service.BlockChainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BlockChainController {

    @Autowired
    BlockChainService blockChainService;

    @Autowired
    BlockModelRepository blockModelRepository;

    @GetMapping("/blockChain")
    public BlockChain getBlockChain(){
        return BlockChain.getInstance();
    }

    @GetMapping("/getAllBlocksFromDb")
    public List<Block> getAllBlocksFromDb() {
        return blockChainService.getBlockChain();
    }

    @PostMapping("/newBlock")
    public BlockModel newBlock(@Valid @RequestBody BlockModel blockModel){
        return blockModelRepository.save(blockModel);
    }

}
