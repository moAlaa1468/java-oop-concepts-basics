package Static_keyword;

import javax.swing.plaf.SeparatorUI;

public class Student {
    private static int min_password_length;
    private static int objectCount;
    private static String correctPassword="defaultPassword";
    final static float AMER;
    private String name;
    static {
        AMER=22;
    }

//    public Student( int STUDENT_ID, final String name){
//        this.name=name;
//        this.STUDENT_ID=STUDENT_ID;
//        objectCount++;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean isPasswordValid(String x){
     boolean isCorrect=   x.equals(correctPassword);
     boolean isLengthValid=x.length() >= correctPassword.length();

        System.out.println("Password Correct : "+ isCorrect);
        System.out.println("password length : "+ isLengthValid);

     return isCorrect && isLengthValid ;
    }

    public static int getObjectCount(){
        return objectCount;
    }

   final public double sum(int x, int y){
        return x+y;
    }

    public void print(){
        System.out.println("This is the student class");
    }

}
