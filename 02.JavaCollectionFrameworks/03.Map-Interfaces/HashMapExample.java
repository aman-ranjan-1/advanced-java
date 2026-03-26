// understanding the concept of HashMap

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // a hashmap to store students name and their marks
        Map<String,Integer> Studentscore = new HashMap<>(); // storing value like key : value 

        // for adding elements in hash map , put() method is used
        Studentscore.put("Adarsh", 37);
        Studentscore.put("Deo Ashish", 28);
        Studentscore.put("Aman", 85);
        Studentscore.put("Ankit", 39);

        System.out.println(Studentscore);
        // displaying the result in sorted order 
        // output - {Adarsh =37, Aman =85, Ankit =39, Deo Ashish =28}

        // student score 
        System.out.println("Student Score :");
        for (Map.Entry<String, Integer> entry : Studentscore.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        //output - Student Score :
        // Aman : 85
        // Adarsh : 37
        // Ankit : 39
        // Deo Ashish : 28
        // we can notice any random order 

        // fetching any particular student marks
        System.out.println("Enter Name of student :");
        String fetchname = in.nextLine();
        System.out.println("Marks of student "+fetchname + " is "+Studentscore.get(fetchname));
    
        // output - Enter Name of student :
        // Ankit
        // Marks of student Ankit is 39

        // particular element checking if any key exist or not method - .containsKey()
        if(Studentscore.containsKey("Rohit")){
            System.out.println("Rohit Marks is "+Studentscore.get("Rohit"));
        }
        else {
            System.out.println("Rohit was Absent");
        }
        // output - Rohit was Absent

        // removing a student 
        System.out.println("Enter name of student to remove ");
        String Student = in.nextLine();
        if(Studentscore.containsKey(Student)){
            Studentscore.remove(Student);
            System.out.println(Student +" removed successfully");
        }
        else{
            System.out.println("No such Student Exists");
        }
        System.out.println("New Studentscore = "+Studentscore);

       // output - Enter name of student to remove 
       // Adarsh
       // Adarsh removed successfully
       // New Studentscore = {Deo Ashish=28, Aman=85, Ankit=39}
       
    }
}