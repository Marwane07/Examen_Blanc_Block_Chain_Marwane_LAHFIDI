package com.example.blockchainservice.dtos;

import com.example.blockchainservice.entities.Block;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
public class BlockchaineDto {
    private String name;
    private int difficulty;
    private int reward;
    private List<Block> blocks;

}
