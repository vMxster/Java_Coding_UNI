package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {
        // 1)Creare 3 studenti a piacere
        Student studentMarcoRossi = new Student(1, "Marco", "Rossi", "Marcorossi123", 2020);
        Student studentAndreaRossi = new Student(2, "Andrea", "Rossi", "Andrearossi123", 2020);
        Student studentMatteoRossi = new Student(3, "Matteo", "Rossi", "Matteorossi1!", 2020);
        // 2)Creare 2 docenti a piacere
        Professor professorLuigiVerdi = new Professor(5, "Luigi", "Verdi", "Luigiverdi45", null);
        Professor professorMirkoVerdi = new Professor(6, "Mirko", "Verdi", "Mirkoverdi5", null);
        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom room1 = new ExamRoom(150, "Stanza per Scienze", false, true);
        ExamRoom room2 = new ExamRoom(250, "Stanza per Informatica", true, true);
        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
        Exam OOP = new Exam(1, 10, "OOP", professorMirkoVerdi, room2, new Student[200], 0);
        Exam POP = new Exam(2, 2, "POP", professorLuigiVerdi, room1, new Student[150], 0);
        // 5) Iscrivere tutti e 3 gli studenti agli esami
        OOP.registerStudent(studentAndreaRossi);
        OOP.registerStudent(studentMarcoRossi);
        OOP.registerStudent(studentMatteoRossi);
        POP.registerStudent(studentAndreaRossi);
        POP.registerStudent(studentMarcoRossi);
        POP.registerStudent(studentMatteoRossi);
        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(OOP.toString());
        System.out.println(POP.toString());
    }
}
