package codingPractice;

public class C_7_LeftTriangleStarPattern {
    public static void main(String[] args) {
//        ////
//        Left Triangle Star Pattern
//
//*****
//****
//***
//**
//*
//
//        ////
        int n = 5;
        for (int i = n; i >=1 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }
}
