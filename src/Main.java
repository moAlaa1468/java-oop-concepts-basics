import Static_keyword.CustomException;
//import Static_keyword.Student;
import Static_keyword.SubStuden;
import Static_keyword.SubStudent;
import exception.NoNameBank;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.System.setOut;
public class Main {

//                public enum DayOfWeek {
//                    SUNDAY("Sunday"){
//                        @Override
//                        public void print(){
//                            System.out.println("This is just Sunday");;
//                        }
//                    },
//                    MONDAY("Monday"),
//                    TUESDAY("Tuesday"),
//                    WEDNESDAY("Wednesday"),
//                    THURSDAY("Thursday"){
//                        @Override
//                        public void print(){
//                            System.out.println("This is just Thursday");;
//                        }
//                    },
//                    FRIDAY("Friday"),
//                    SATURDAY("Saturday");
//
//                    private String name;
//                    // Constructor
//                    DayOfWeek(String name) {
//                        this.name = name;
//                    }
//                  public void print(){
//                      System.out.println("Function inside Enum Class");
//                  }
//                }

        public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
//            File file = new File("folder");
//            File file1=new File(file,"c.txt");
//            file1.createNewFile();
//            FileOutputStream fos=new FileOutputStream(file1);
//            fos.write("What is the coming task ".getBytes(StandardCharsets.UTF_8));
//            FileInputStream fin=new FileInputStream(file1);
//            int data;
//           while( (data=fin.read()) != -1){
//               System.out.print((char) data);
//           }
//
//            BufferedWriter bw = new BufferedWriter(new FileWriter("alaa.txt "));
//            //هتحتاج وسيط بين Writer وال BufferedWriter واللي هو ال FileWriter
//            bw.write(97);
//            bw.newLine();
//            bw.write("Mohamed Alaa amer is here ");
//            bw.flush();
//            bw.close(); // انت في كل الاحوال محتاج انك تقفل BufferedWriter
//
//
//            FileWriter fw = new FileWriter("alaa.txt", true);
//            BufferedWriter bufferedWriter=new BufferedWriter(fw);
//            bufferedWriter.newLine();
//            bufferedWriter.write(98);
//            bufferedWriter.newLine();
//            bufferedWriter.write("second appended Line Mohame Alaa amer ");
//            bufferedWriter.flush();
//            bufferedWriter.close();
//
//
//            FileReader file=new FileReader("names.txt");
//            BufferedReader br=new BufferedReader(file);
//            String  line=br.readLine();
//            while(line !=null){
//                System.out.println(line);
//                line=br.readLine();
//            }
//
//        }

//           FileWriter fr=new FileWriter("potter.txt",true);
//           PrintWriter pr=new PrintWriter(fr);
//        pr.println(8232398);
//        pr.println(93);
//        pr.println(false);
//        pr.print("MohamedAmer");
//        pr.flush();   // Without Using Flush() with print() Nothing will be printed
//    }

//
//         File file=new File("potter.txt");
//        Scanner scanner=new Scanner(file);
//          System.out.println(scanner.nextLine());
                //if you want to read all data in the file you could use Loop
//          while(scanner.hasNextLine()){
//                  System.out.println(scanner.nextLine());;
//                  //If you want to print word by word You could
//                  System.out.println(scanner.next());
//          }
//          while(scanner.hasNext()){
//                  //If you want to print word by word You could
//                  System.out.println(scanner.next());
//

//        Scanner scan=new Scanner("AAA,BBBB,ccc");
//        scan.useDelimiter(Pattern.compile(","));
//
//        while(scan.hasNext()){
//                System.out.println(scan.next());
//        }
//
//        }
//                File file=new File("potter.txt");
//                Scanner scanner=new Scanner(file);
//                while(scanner.hasNext()){
//                        parseLine(scanner. nextLine());
//                }
//

//                Student student=new Student("Mohamed Alaa amer ",79789,922.2f);
//                File file=new File("Student.txt");
//
//
//        }
//// Create simple function to deal with Formatted files
//        static void parseLine(String str){
//                String name, address, phone;
//                Scanner sc=new Scanner(str);
//
//                sc.useDelimiter(",");
//
//                while(sc.hasNext()){
//                        name=sc.next();
//                        address=sc.next();
//                        phone=sc.next();
//                        System.out.println("Name:"+name+" - Address :"+ address +"- Phone "+ phone);
//                }
//                sc.close();   // You need to close the scanner
//        }
          Student s1=new Student("Mohamed Alaa amer ",232,8.2f);
            Student s2=new Student("MostafaAmer ",423,8.2f);
            Student s3=new Student("HurryPotter ",234562,228.2f);

            ArrayList<Student> students=new ArrayList<>();
            students.add(s1);
            students.add(s2);
            students.add(s3);
            File file=new File("student.txt");
            ObjectOutputStream oos=new ObjectOutputStream( new FileOutputStream(file));
            oos.writeObject(students);


            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
            ArrayList<Student> studentOutputList= (ArrayList<Student>)ois.readObject();
            for (Student s: studentOutputList){
                System.out.println(s);
            }
        }

}


