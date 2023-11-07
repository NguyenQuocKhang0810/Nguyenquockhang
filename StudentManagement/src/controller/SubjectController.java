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
import model.Subject;
import view.SubjectView;

/**
 *
 * @author quock
 */
public class SubjectController {

    private List<Subject> subjectList;
    private SubjectView subjectView;

    public SubjectController() {
        this.subjectList = new ArrayList<Subject>();
        this.subjectView = new SubjectView();
    }

    public SubjectController(List<Subject> subjectList, SubjectView subjectView) {
        this.subjectList = subjectList;
        this.subjectView = subjectView;
    }
    
    public void addSubject(Subject subject){
        subjectList.add(subject);
    }
    
    public void displaySubject(){
        subjectView.printSubjects(subjectList);
    }
    
    public void importSubjectFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("subject.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String name = parts[1];
                int credits = Integer.parseInt(parts[2]);
                String professor = parts[3];
                
                subjectList.add(new Subject(id, name, credits, professor));
                
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void saveSubjectToFile(){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("subject_output.txt"));
            for (Subject subject : subjectList) {
                pw.println(subject.toString());
            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
