package miniproject2;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Methods {
    public void Add(List<String> list, String name){

        if(list.contains(name)){
            System.out.println("Please enter a new name, this " + name + " has in list.");
        }else {
            System.out.println(name +" add successfull.");
            list.add(name);
        }
        System.out.println("--------------------------");

    }
    public void Delete(List<String>list,String deleteName){

        if (list.contains(deleteName)) {
            list.remove(deleteName);
            System.out.println("Delete successfull.");
        } else {
            System.out.println("Please enter a new name, this " + deleteName +" has not in list.");
        }
        System.out.println("--------------------------");
    }
    public void Update(List<String>list,String removeName){
        Scanner scan=new Scanner(System.in);
        if (list.contains(removeName)) {
            int idx=list.indexOf(removeName);
            System.out.println("Please enter the new student name?");
            String stdUpdateName=scan.nextLine().toUpperCase();
            list.set(idx,stdUpdateName);
            System.out.println(removeName + " name of student update to " + stdUpdateName);
        } else {
            System.out.println("Please enter a new name, this name has not in list.");

        }
        System.out.println("--------------------------");



    }
    public void TotalNumber(List<String>list) {
        System.out.println("Total Student Number: " + list.size());
        int i=1;
        for (String w: list) {
            System.out.println(i + ". " + w);
            i++;
        }
        System.out.println("--------------------------");

    }
    public void Search(List<String>list,String name) {

        if (list.contains(name)) {
            System.out.println("This name has in list.");
        } else {
            System.out.println("Please enter a new name, this name has not in list.");
        }
    }
    public void sort(List<String>list) {
        Collections.sort(list);

        int i = 1;
        for (String w : list) {
            System.out.println(i + ". " + w);
            i++;
        }
        System.out.println("--------------------------");


    }
    public void deleteList(List<String>list) {
        list.clear();
        System.out.println("Song list delete successfully.");
        System.out.println("--------------------------");

    }

}
