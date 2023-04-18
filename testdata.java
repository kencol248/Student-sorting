package edu.cscc;

public class TestData {
    public static Student[] createStudents() {
        Student[] students = {
                new Student("Julia","Wicker","Computer Science",43210,"A0123",4.0),
                new Student("Quentin","Coldwater","Biology",43109,"D3902",2.7),
                new Student("Eliot","Waugh","Chemistry",12345,"Z0101",2.1),
                new Student("Penny","Adiyodi","Finance",90304,"M2030",3.1),
                new Student("Margo","Hanson","Psychology",56231,"L9832",2.91),
                new Student("Alice","Quinn","Math",89123,"U8932",4.0),
                new Student("Kady","Orloff-Diaz","English",65421,"K3949",3.2),
                new Student("Henry","Fogg","Botany",49022,"R9392",3.8),
                new Student("Josh","Hoberman","Astronomy",33021,"H3021",2.5),
                new Student("Marina","Andrieski","Marketing",76821,"J3491",3.4)
        };
        return students;
    }
}
