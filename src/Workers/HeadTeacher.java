package Workers;

public class HeadTeacher {

    private String fio; //ФИО
    private String sex; //пол
    private Byte age; //возраст
    private int salary; //зарплата
    private int workExperience; //опыт работы
    private String subject; //предмет
    private String additionalObligations; //дополнительные обязанности

    public HeadTeacher (String fio, String sex, Byte age, int salary, int workExperience, String subject, String additionalObligations){
        this.fio = fio;
        this.sex = sex;
        this.salary = salary;
        this.age = age;
        this.subject= subject;
        this.workExperience = workExperience;
        this.additionalObligations = additionalObligations;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAdditionalObligations() {
        return additionalObligations;
    }

    public void setAdditionalObligations(String additionalObligations) {
        this.additionalObligations = additionalObligations;
    }
}

