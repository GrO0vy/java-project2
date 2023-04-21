package com.likelion.javaproject2.week1.day5;

public class SpaceInvaderMemberVariable {
    int location;

    public void moveLeft(){
        location = location - 1;

    }

    public void moveRight(){
        location = location + 1;

    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable simv = new SpaceInvaderMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

        System.out.println("최종위치 : " +simv.location);
        simv.moveLeft();
        System.out.println("최종위치 : " +simv.location);
    }
}
