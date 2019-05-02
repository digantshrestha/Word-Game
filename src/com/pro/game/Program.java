package com.pro.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import com.pro.game.entity.Player;
import com.pro.game.util.GameController;

public class Program{
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Player player=new Player();
        Random random=new Random();

        GameController gc=new GameController(random, reader, player);
        gc.tryProcess();
    }
}