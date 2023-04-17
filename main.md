package edu.cscc;
//Kenyah Collins, 4/16/2023
//This program uses the Comparator interface and the Arrays.sort() method to sort an array of Student objects based on
//various criteria, including last name, major, zip code, and GPA.
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student[] students = TestData.createStudents();
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String lastname1 = s1.getLastName();
                String lastname2 = s2.getLastName();
                return lastname1.compareTo(lastname2);
            }
        });
        printStudentList("Students Sorted By LastName",students);

        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                String major1 = s1.getMajor();
                String major2 = s2.getMajor();
                return major1.compareTo(major2);
            }
        });
        printStudentList("Students Sorted By Major",students);

        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                int zipcode1 = s1.getZipcode();
                int zipcode2 = s2.getZipcode();
                return Integer.compare(zipcode1, zipcode2);
            }
        });
        printStudentList("Students Sorted By Zip Code",students);

        Arrays.sort(students, new Comparator<Student>() {
                    public int compare(Student s1, Student s2) {
                        double gpa1 = s1.getGpa();
                        double gpa2 = s2.getGpa();
                        return Double.compare(gpa2, gpa1);
                    }
                });
                printStudentList("Students Sorted By GPA",students);
    }

    public static void printStudentList(String title,Student[] list) {
        final String format = "%-12s %-12s %-18s %-12s %-12s\n";
        System.out.println(title);
        System.out.printf(format,"First Name","Last Name","Major","Zip Code","GPA");
        for (Student s : list) {
            System.out.printf(format,s.getFirstName(),s.getLastName(),s.getMajor(),s.getZipcode(),s.getGpa());
        }
        System.out.println("==============================================================\n");
    }
}
