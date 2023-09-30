class Student {

	String name;
	String surname;
	int id;
	int matriculationYear;

    void build(String name, String surname, int id, int matriculationYear) {
        this.name = name;
		this.surname = surname;
		this.id = id;
		this.matriculationYear = matriculationYear;
    }

    void printStudentInfo() {
        System.out.println("Name: " + this.name);
		System.out.println("Surname: " + this.surname);
		System.out.println("ID: " + this.id);
		System.out.println("Matriculation Year: " + this.matriculationYear);
    }
}
