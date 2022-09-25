package Workers;

public class OtherWorkers {
    private String fio; //ФИО
    private String sex; //пол
    private Byte age; //возраст
    private int salary; // зарплата
    private int workExperience; //опыт работы
    private String kindOfActivity; //вид деятельности

    public OtherWorkers (String fio, String sex, Byte age, int salary, int workExperience, String kindOfActivity){
        this.fio = fio;
        this.sex = sex;
        this.salary = salary;
        this.age = age;
        this.kindOfActivity= kindOfActivity;
        this.workExperience = workExperience;
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

    public String getKindOfActivity() {
        return kindOfActivity;
    }

    public void setKindOfActivity(String kindOfActivity) {
        this.kindOfActivity = kindOfActivity;
    }
}
