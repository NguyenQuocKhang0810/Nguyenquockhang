/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.Student;

/**
 *
 * @author quock
 */
public class StudentView {
    
    public void printStudents(List<Student> studentList) {
        System.out.println("Danh sách sinh viên:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
