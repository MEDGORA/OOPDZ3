import java.util.Objects;

abstract class Family implements iPrinter {
    private String name;
    private String surname;
    private Integer age;
    private String sex;
    Family(String personName, String personSurname, Integer personAge, String personSex){
        this.name = personName;
        this.surname = personSurname;
        this.age = personAge;
        this.sex = personSex;
    }
    
    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public Integer getAge(){
        return this.age;
    }

    public String getSex(){
        return this.sex;
    }

    public String toString(){
        return "[Имя: " + name + ", Фамилия: " + surname + ", Возраст:" + age + ", Пол: " + sex + "]";
    }

    public int hashCode(){
        return Objects.hash(name, surname, age, sex);
    }
}
