package oct.ex_25102024_Arrays;

public class Lab188_Arrays {
    //bread, paneer, milk, chai
    //Arrays are collection od data for similar data type
    public static void main(String[] args) {
        //Marks 10th -> English  -51 , Math -100, Science - 91, Hindi - 87, SST - 90
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println(marks.length);
        System.out.println(marks[0]); // First - Index =0;
        System.out.println(marks[1]); // Second - Index =1;
        System.out.println(marks[2]); // Third - Index =2;
        System.out.println(marks[3]); // Four - Index =3;
        System.out.println(marks[4]); // Five - Index =4;

        System.out.println("*******************");
        //another way to declare array

        int[] marks_2 = new int[5];
        // 5 - Length of array
        marks_2[0] = 11;
        marks_2[1] = 12;
        marks_2[2] = 13;
        marks_2[3] = 14;
        marks_2[4] = 15;
        System.out.println(marks_2[0]);
        System.out.println(marks_2[1]);
        System.out.println(marks_2[2]);
        System.out.println(marks_2[3]);
        System.out.println(marks_2[4]);
        //System.out.println(marks_2[5]); // Will give -> ArrayIndexOutOfBoundsException


    }
}
