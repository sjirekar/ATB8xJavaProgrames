package codingPractice;

public class C_8_PyramidPattern {
    public static void main(String[] args) {

//        ✅ Pyramid pattern in Java
//
//    *
//   ***
//  *****
// *******
//*********


        int rows = 5; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }


    }
}
