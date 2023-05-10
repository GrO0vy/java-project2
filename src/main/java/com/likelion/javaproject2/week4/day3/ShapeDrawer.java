package com.likelion.javaproject2.week4.day3;

public abstract class ShapeDrawer {

    public abstract String makeALine(int height , int i);/*{
        return String.format("%s\n","*".repeat(i));
    }*/

    public void printShape(int height){
        for(int i=0; i<height; i++){
            System.out.print(makeALine(height,i));
        }
    }
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RightTriangleDraw rtd = new RightTriangleDraw();
        int height = sc.nextInt();

        rtd.printShape(height);
    }*/
}
