package com.example.blockchainservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blockchain {
    @Id
    private String id;
    private String nom;
    private int difficulté;
    private double miningReward;
    @OneToMany
    private List<Block> blocks = new LinkedList<>();



}
