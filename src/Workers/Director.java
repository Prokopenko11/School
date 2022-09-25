package Workers;

public class Director {
    private String fio; //ФИО
    private String sex; //пол
    private Byte age; //возраст
    private int salary; //зарплата
    private int workExperience; //опыт работы
    private String directorObligations; //обязанности директора

    public Director (String fio, String sex, Byte age, int salary, int workExperience, String directorObligations){
        this.fio = fio;
        this.sex = sex;
        this.salary = salary;
        this.age = age;
        this.workExperience = workExperience;
        this.directorObligations = directorObligations;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getDirectorObligations() {
        return directorObligations;
    }

    public void setDirectorObligations(String directorObligations) {
        this.directorObligations = directorObligations;
    }
}

