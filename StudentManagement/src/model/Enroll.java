/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author quock
 */
public class Enroll {

    private String enrollID;
    private String studentID;
    private String subjectID;

    public Enroll(String enrollID, String studentID, String subjectID) {
        this.enrollID = enrollID;
        this.studentID = studentID;
        this.subjectID = subjectID;
    }

    public String getEnrollID() {
        return enrollID;
    }

    public void setEnrollID(String enrollID) {
        this.enrollID = enrollID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enroll other = (Enroll) obj;
        if (!Objects.equals(this.enrollID, other.enrollID)) {
            return false;
        }
        if (!Objects.equals(this.studentID, other.studentID)) {
            return false;
        }
        return Objects.equals(this.subjectID, other.subjectID);
    }

    @Override
    public String toString() {
        return "Enroll{" + "enrollID=" + enrollID + ", studentID=" + studentID + ", subjectID=" + subjectID + '}';
    }
    
    
}
