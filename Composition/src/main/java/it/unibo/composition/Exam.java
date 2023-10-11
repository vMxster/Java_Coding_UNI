package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    
    private final int id;
    private final int maxStudents;
    private final String courseName;
    private final Professor professor;
    private final ExamRoom room;
    private final Student[] students;
    int registeredStudents;


    public Exam (final int id, final int maxStudents, final String courseName, final Professor professor, final ExamRoom room, final Student[] students, final int registeredStudents) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = students;
        this.registeredStudents = registeredStudents;
    }

    public int getId() {
        return this.id;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public ExamRoom getExamRoom() {
        return this.room;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public int getRegisteredStudents() {
        return this.registeredStudents;
    }

    public void registerStudent (Student student) {
        if (students.length==maxStudents) {
            return;
        } else if (registeredStudents==0){
            students[registeredStudents] = student;
            registeredStudents++;
        } else {
            students[registeredStudents-1] = student;
            registeredStudents++;
        }
    }
    
    public String toString () {
        return "[ " + id + " ] [ " + maxStudents + " ] [ " + courseName + " ] " + professor.toString() + " " + room.toString() + " " + Arrays.toString(students) + " [ " + registeredStudents + " ]";
    }
}
