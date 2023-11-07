/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.Enroll;

/**
 *
 * @author quock
 */
public class EnrollView {

    public void printEnrollments(List<Enroll> enrollList) {
        System.out.println("Danh sách đăng ký:");
        for (Enroll enroll : enrollList) {
            System.out.println(enroll);
        }
    }
    
}
