package com.pro.game.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

import com.pro.game.entity.Player;

public class GameController{
    private String[] artifacts={"gold", "diamond", "silver", "gun", "crap", "tiger"};
    private Random random;
    private BufferedReader reader;
    private Player player;

    public GameController(Random random, BufferedReader reader, Player player){
        this.random=random;
        this.reader=reader;
        this.player=player;
    }

    private void menu() throws IOException{
        System.out.println("Enter your name : ");
        player.setName(reader.readLine());
        System.out.println("Hello "+player.getName());
        System.out.println("Welcome To The Jungle\n");
    }

    private int score=0;
    private void process() throws IOException{
        System.out.print(">");
        String cmd=reader.readLine();
        String[] tokens=cmd.split(" ");
        if(tokens[0].equalsIgnoreCase("go")){
            System.out.println("You are going "+ tokens[1]);
            String current=artifacts[random.nextInt(artifacts.length)];
            System.out.println("you found "+current+"\n");
            
            if(current.equals("gold")){
                score=score+100;
            }else if(current.equals("silver")){
                score=score+50;
            }else if(current.equals("diamond")){
                score=score+500;
            }else if(current.equals("crap")){
                score=score-50;
            }else if(current.equals("gun")){
                score=score+50;
            }else if(current.equals("tiger")){
                System.out.println("You came in contact with a tiger \nYou died");
                System.out.println("Score : "+score);
                System.exit(0);;
            }
        }else if(tokens[0].equalsIgnoreCase("exit")){
            System.out.println("Score : "+score); 
            System.exit(0);
        }else{
            System.out.println("Invalid command");
        }    
    }

    public void tryProcess(){
        try{
            menu();
            while(true){
                process();  
            }
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}