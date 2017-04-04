package Package1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class LagopusClass {
  String className;
  List<Student>students;
  List<Mentor>mentors;

  public LagopusClass(String className) {
    this.className = className;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    this.students.add(student);
  }

  public void addMentor(Mentor mentor) {
    this.mentors.add(mentor);
  }

  public void info() {
    System.out.println("Lagopus " + className + " has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
}
