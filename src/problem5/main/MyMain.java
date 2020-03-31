/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "kb", 0, 7));
        studentList.add(new Student(2, "amy", 7, 1));
        studentList.add(new Student(3, "bb", 7, 3));
        studentList.add(new Student(4, "thor", 1, 5));
        studentList.add(new Student(5, "Dr_nf", 5, 2));
        MyCircularQueue queue = new MyCircularQueue();
        queue.enQueue(studentList);
        queue.printQueue();
    }
}
