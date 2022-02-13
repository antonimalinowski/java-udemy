package section05;

public class Exercise01 {
    public static void main(String[] args) {
        // Let H    G    F    E    D    C    B    A  -  be assigned values
        //    128   64   32   16   8    4    2    1
        byte ABC = 1 | 2 | 4; // 7
        byte AC = 1 | 4; // 5
        byte AD = 1 | 8; //9

        // test if signal D is present in AD
        System.out.println((AD & 8) == 8); // Logical AND of original signal (9) AND 'D' (8) will equal 8 IF and only IF 'D' was present in original signal
    }
}
