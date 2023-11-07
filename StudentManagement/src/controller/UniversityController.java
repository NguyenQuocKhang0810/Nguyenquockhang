/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.Enroll;
import model.Student;
import model.Subject;
import view.Menu;
import view.StudentView;

/**
 *
 * @author quock
 */
public class UniversityController {

    Menu menu = new Menu();
    StudentController studentController = new StudentController();
    SubjectController subjectController = new SubjectController();
    EnrollController enrollController = new EnrollController();

    public void run() {
        String[] mainMenuOptions = {"Quản lý Sinh viên", "Quản lý Môn học", "Quản lý Đăng ký", "Thoát"};
        String mainMenuPrompt = "Chọn chức năng (1-" + mainMenuOptions.length + "): ";

        while (true) {
            int choice = menu.displayMenu(mainMenuOptions, mainMenuPrompt);

            switch (choice) {
                case 1:
                    // Quản lý Sinh viên
                    manageStudents(studentController);
                    break;
                case 2:
                    // Quản lý Môn học
                    manageSubjects(subjectController);
                    break;
                case 3:
                    // Quản lý Đăng ký
                    manageEnrollments(enrollController);
                    break;
                case 4:
                    // Thoát
                    System.out.println("Chương trình kết thúc.");
                    System.exit(0);
                    break;
            }
        }
    }

    private void manageStudents(StudentController studentController) {
        while (true) {
            String[] studentMenuOptions = {"Xem danh sách sinh viên", "Thêm sinh viên", "Import sinh viên từ tệp", "Lưu danh sách sinh viên", "Quay lại"};
            int studentChoice = menu.displayMenu(studentMenuOptions, "Chọn chức năng quản lý sinh viên (1-" + studentMenuOptions.length + "): ");

            switch (studentChoice) {
                case 1:
                    studentController.displayStudent();
                    break;
                case 2:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhập thông tin sinh viên:");
                    System.out.print("ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Họ và tên đệm: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Tên: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Số điện thoại: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.print("Địa chỉ: ");
                    String address = scanner.nextLine();
                    Student student = new Student(id, firstName, lastName, phoneNumber, address);
                    studentController.addStudent(student);
                    break;
                case 3:
                    studentController.importStudentFromFile();
                    break;
                case 4:
                    studentController.saveStudentToFile();
                    break;
                case 5:
                    return; // Quay lại menu chính
            }
        }
    }

    private void manageEnrollments(EnrollController enrollController) {
        while (true) {
            String[] enrollMenuOptions = {"Xem danh sách đăng ký", "Thêm đăng ký", "Import đăng ký từ tệp", "Lưu danh sách đăng ký", "Quay lại"};
            int enrollChoice = menu.displayMenu(enrollMenuOptions, "Chọn chức năng quản lý đăng ký (1-" + enrollMenuOptions.length + "): ");

            switch (enrollChoice) {
                case 1:
                    enrollController.displayEnrollments();
                    break;
                case 2:
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Nhập thông tin đăng ký:");
                    System.out.print("Enroll ID: ");
                    String enrollID = scanner.nextLine();

                    System.out.print("Student ID: ");
                    String studentID = scanner.nextLine();

                    System.out.print("Subject ID: ");
                    String subjectID = scanner.nextLine();

                    Enroll enroll = new Enroll(enrollID, studentID, subjectID);
                    enrollController.addEnrollment(enroll);
                    break;
                case 3:
                    enrollController.importEnrollFromFile();
                    break;
                case 4:
                    enrollController.saveEnrollToFile();
                    break;
                case 5:
                    return; // Quay lại menu chính
            }
        }
    }

    private void manageSubjects(SubjectController subjectController) {
        while (true) {
            String[] subjectMenuOptions = {"Xem danh sách môn học", "Thêm môn học", "Import môn học từ tệp", "Lưu danh sách môn học", "Quay lại"};
            int subjectChoice = menu.displayMenu(subjectMenuOptions, "Chọn chức năng quản lý môn học (1-" + subjectMenuOptions.length + "): ");

            switch (subjectChoice) {
                case 1:
                    subjectController.displaySubject();
                    break;
                case 2:
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Nhập thông tin môn học:");
                    System.out.print("ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Tên môn học: ");
                    String name = scanner.nextLine();

                    System.out.print("Số tín chỉ: ");
                    int credits = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng mới

                    System.out.print("Giảng viên: ");
                    String professor = scanner.nextLine();

                    Subject subject = new Subject(id, name, credits, professor);
                    subjectController.addSubject(subject);
                    break;
                case 3:
                    subjectController.importSubjectFromFile();
                    break;
                case 4:
                    subjectController.saveSubjectToFile();
                    break;
                case 5:
                    return; // Quay lại menu chính
            }
        }
    }

    public static void main(String[] args) {
        UniversityController universityController = new UniversityController();
        universityController.run();
    }
}
