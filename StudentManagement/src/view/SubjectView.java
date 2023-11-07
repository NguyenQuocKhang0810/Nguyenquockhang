/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.Subject;

/**
 *
 * @author quock
 */
public class SubjectView {

    public void printSubjects(List<Subject> subjectList) {
        System.out.println("Danh sách môn học:");
        for (Subject subject : subjectList) {
            System.out.println(subject);
        }
    }
    
}
