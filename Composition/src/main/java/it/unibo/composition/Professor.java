package it.unibo.composition;

public class Professor implements User {

    private static final String DOT = ".";
    private final int id;
    private final String name;
    private final String surname;
    private final String password;
    private String[] courses;

    public Professor (final int id, final String name, final String surname, final String password, final String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    public void replaceCourse(final String nameCourse, final int i) {
        this.courses[i] = nameCourse;
    }

    public void replaceAllCourses(final String[] newCourses) {
        this.courses = newCourses;
    }

    public String getUsername() {
        return this.name + Professor.DOT + this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return this.toString();
    }

    public String toString() {
        return "[Professor ["
            +"id=" + this.id
            + ", name=" + this.name
            + ", surname=" + this.surname
            + "]]";
    }
}
