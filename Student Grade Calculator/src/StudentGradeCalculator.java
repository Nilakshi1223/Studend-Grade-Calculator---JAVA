import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //input accessing

        System.out.print("Enter your number of subjects : ");
        int noOfSubject = sc.nextInt();
        int total = 0;

        for(int i=1; i<= noOfSubject; i++){
            System.out.print("Enter your marks of subject " + i + " : ");
            int mark = sc.nextInt();
            total+=mark;   //calculation of total marks
        }

        double average = (double)total/noOfSubject;  // average calculation

        String grade;
        if(average>=90){
            grade="A";
        } else if(average>=80){
            grade="B";
        } else if(average>=70){
        grade="C";
        } else if(average>=60){
            grade="D";
        } else {
            grade="F";
        }

        System.out.println("\nYour total marks : " + total);
        System.out.println("Your average     : " + average);
        System.out.println("Your grade       : " + grade);

        sc.close();
    }
}
