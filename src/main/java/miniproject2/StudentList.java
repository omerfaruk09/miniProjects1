package miniproject2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList extends Methods {

    public static void main(String[] args) {

        List<String> studentList = new ArrayList<>();
        Methods methods02 = new Methods();
        Scanner scan = new Scanner(System.in);


        int select;

        do {
            System.out.println("1.Student Name Add\n" + "2.Student Name Delete\n" + "3.Student Name Update\n"
                    + "4.Total Student Number\n" + "5.Student Search\n" + "6.Exit\n");
            System.out.println("Please select the action you want to do?");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Please enter a student name?");
                    scan.nextLine();
                    String stdName = scan.nextLine().toUpperCase();
                    methods02.Add(studentList, stdName);
                    break;
                case 2:
                    System.out.println("Please enter the student name to be deleted?");
                    scan.nextLine();
                    String stdDeleteName = scan.nextLine().toUpperCase();
                    methods02.Delete(studentList, stdDeleteName);
                    break;
                case 3:
                    System.out.println("Please enter the student name to be updated?");
                    scan.nextLine();
                    String stdRemoveName = scan.nextLine().toUpperCase();
                    methods02.Update(studentList, stdRemoveName);
                    break;
                case 4:
                    methods02.TotalNumber(studentList);
                    break;
                case 5:
                    System.out.println("Please enter the student name to be searched?");
                    scan.nextLine();
                    String stdSearchName = scan.nextLine().toUpperCase();
                    methods02.Search(studentList, stdSearchName);
                    break;
                default:
                    System.out.println("Invalid number!!. Please enter a number in list.");
            }

        } while (select != 6);


    }

}