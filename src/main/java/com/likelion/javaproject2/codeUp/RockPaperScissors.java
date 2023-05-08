package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class RockPaperScissors {
    public String play(int user , int computer){
        if(user == 0 && computer ==1) return "win";
        else if(user == 1 && computer == 2) return "win";
        else if(user == 2 && computer == 0) return "win";
        else if(user == computer) return "tie";
        else return "lose";
    }

    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
        Scanner sc = new Scanner(System.in);

        System.out.println(rps.play(sc.nextInt(), sc.nextInt()));
    }
}
