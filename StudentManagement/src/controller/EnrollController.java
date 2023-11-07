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
import model.Enroll;
import model.Student;
import model.Subject;
import view.EnrollView;
import view.Menu;

/**
 *
 * @author quock
 */
public class EnrollController {

    private List<Enroll> enrollList;
    private EnrollView enrollView;

    public EnrollController() {
        this.enrollList = new ArrayList<Enroll>();
        this.enrollView = new EnrollView();
    }

    public EnrollController(List<Enroll> enrollList, EnrollView enrollView) {
        this.enrollList = enrollList;
        this.enrollView = enrollView;
    }
    
    public void addEnrollment(Enroll er){
        enrollList.add(er);
    }
    
    public void displayEnrollments(){
        enrollView.printEnrollments(enrollList);
    }
    
    public void importEnrollFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("enroll.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String enrollID = parts[0];
                String studentID = parts[1];
                String subjectID = parts[2];
                
                enrollList.add(new Enroll(enrollID, studentID, subjectID));
                
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void saveEnrollToFile(){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("enroll_output.txt"));
            for (Enroll enroll : enrollList) {
                pw.println(enroll.toString());
            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
