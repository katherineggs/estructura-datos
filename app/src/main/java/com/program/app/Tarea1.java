package com.program.app;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
public class Tarea1 {
    @RequestMapping("/")
    public String index() {
        String grade;
        System.out.print("Enter de mark: ");
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();

        if ((mark >= 75) && (mark < 100)) {
            grade = "Your grade is: O";
            return grade;
        } else if ((mark >= 60) && (mark < 75)) {
            grade = "Your grade is: A";
            return grade;
        } else if ((mark >= 50) && (mark < 59)) {
            grade = "Your grade is: B";
            return grade;
        } else if ((mark >= 40) && (mark < 49)) {
            grade = "Your grade is: C";
            return grade;
        } else if ((mark < 40) && (mark >= 0)) {
            grade = "Your grade is: D";
            return grade;
        }else{
            return "Not valid";
        }
    }
}
