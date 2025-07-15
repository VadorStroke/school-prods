// Name: Modisnae Gomolemo
// Student number: MDSGOM004
// Date: 18 October 2024;
// Student class;

public class Student extends Person {
    private int year;
    private String nameOfStudy;
    private String hobbies;
    private String program;

    public Student(String name, int age, String gender, String nameOfStudy, String hobbies, int year, String program) {
        super(name, age, gender);
        this.year = year;
        this.nameOfStudy = nameOfStudy;
        this.hobbies = hobbies;
        this.program = program;
    }

    public Student(Student student) {// copy constructor
        super(student.getName(), student.getAge(), student.getGender());
        this.nameOfStudy = student.nameOfStudy;
        this.hobbies = student.hobbies;
        this.program = student.program;
    }

    public int getYearOfStudy() {
        return year;// getter
    }

    public String getHobbies() {
        return hobbies;// getter
    }

    public String getNameOfInstitution() {
        return nameOfStudy;// getter
    }

    public String getProgramOfStudy() {
        return program; // getter
    }

    public void setHobbies(String hobby) {
        this.hobbies = hobby;// setter
    }

    public void setNameOfInstitution(String name) {
        this.nameOfStudy = name;// setter
    }

    public void setProgramOfStudy(String program) {
        this.program = program; // setter
    }

    public void setYearOfStudy(int year) {
        this.year = year; // setter
    }

}
