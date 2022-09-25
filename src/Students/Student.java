package Students;

public class Student {

    private String fio; //ФИО
    private String sex; //пол
    private String classNumber; //номер класса
    private Byte age; //возраст

    public Student(String fio, String classNumber, Byte age, String sex){
        this.fio = fio;
        this.classNumber = classNumber;
        this.age = age;
        this.sex = sex;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

