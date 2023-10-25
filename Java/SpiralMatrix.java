package com.Abhi;
import java.util.*;

public class SpiralMatrix {                                  //Nice question.
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);


        //Taking number of rows and columns as input.
        System.out.print("Enter the number of rows: ");
        int row=in.nextInt();
        System.out.print("Enter the number of columns: ");
        int col= in.nextInt();

        //Creating an 2D array
        int[][] spiral= new int[row][col];
        System.out.println("Enter the elements.");
        for (int ro = 0; ro < row; ro++) {
            for (int co = 0; co < col; co++) {
                spiral[ro][co]=in.nextInt();
            }
        }

        //Output of the array.
        System.out.println("The given array is: ");
        for(int[] ele:spiral){
            System.out.println(Arrays.toString(ele));
        }

        //Printing in form of spiral.
        System.out.println();
        System.out.println("The elements of your matrix in spiral form is: ");
        //Initiating first and last row and column.
        int a=0;
        int b=row;
        int c=0;
        int d=col;

        //Ending condition.
        while(a<b && c<d){

            //Printing the first row.
            for (int i = c; i < d; i++) {
                System.out.print(spiral[a][i]+" ");
            }
            a++;                                    //Increasing row number.

            //Printing last column.
            for (int i = a; i < b ; i++) {
                System.out.print(spiral[i][d-1]+" ");
            }
            d--;                                    //Left shift of last column.

            //Printing bottom row.
            if (a<b){
                for (int i = d-1; i >=c ; i--) {
                    System.out.print(spiral[b - 1][i]+" ");
                }
                b--;                                //Bottom row up shift.
            }

            //Printing leftmost column.
            if(c<d){
                for (int i = b-1; i >= a; i--) {
                    System.out.print(spiral[i][a-1]+" ");
                }
                c++;                                //Right shift of column.
            }
        }
    }
}

