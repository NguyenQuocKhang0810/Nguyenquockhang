/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import view.Menu;
import view.StudentView;

/**
 *
 * @author quock
 */
public class StudentController extends Menu{

    private List<Student> studentList;
    private StudentView studentView;

    public StudentController() {
        this.studentList = new ArrayList<Student>();
        this.studentView = new StudentView();
    }

    public StudentController(List<Student> studentList, StudentView studentView) {
        this.studentList = studentList;
        this.studentView = studentView;
    }

    public void addStudent(Student st) {
        studentList.add(st);
    }

    public void displayStudent() {
        studentView.printStudents(studentList);
    }
    
    public void importStudentFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String firstName = parts[1];
                String lastName = parts[2];
                String phoneNumber = parts[3];
                String address = parts[4];
                
                studentList.add(new Student(id, firstName, lastName, phoneNumber, address));
                
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void saveStudentToFile(){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("student_output.txt"));
            for (Student student : studentList) {
                pw.println(student.toString());
            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
