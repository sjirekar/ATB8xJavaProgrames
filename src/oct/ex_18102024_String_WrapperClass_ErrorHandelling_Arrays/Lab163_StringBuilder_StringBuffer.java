package oct.ex_18102024_String_WrapperClass_ErrorHandelling_Arrays;

public class Lab163_StringBuilder_StringBuffer {
    public static void main(String[] args) {
//       String name ="Pramod";
//       name= "Aramod";

        //StringBuffer -> Final class
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuffer stringBuffer1 = new StringBuffer("Dutta");
        stringBuffer.append("Dutta");
        stringBuffer1.append("Pramod");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);

        //c1, c2 ->> Toy
        //c1 - Toy 2 hrs, -> c2 -> Toy 2 hrs - Thread Safety
        //String Builder -> Not thread safe
        //Appending to StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World ");
        System.out.println(sb);

        //Inserting into StringBuilder
        sb.insert(5,",");
        System.out.println(sb);

        //Deleting from StringBuilder
        sb.delete(5,6);
        System.out.println(sb);

        //Reversing StringBuilder
        sb.reverse();
        System.out.println(sb);



    }
}
