public class IvanovFamily extends Family {

    IvanovFamily(String personName, String personSurname, Integer personAge, String personSex) {
        super(personName, personSurname, personAge, personSex);
    }

    private Person person1 = new Person("Андрей", "Иванов", 58, "мужской");
    private Person person2 = new Person("Татьяна", "Брест", 60, "женский");
    private Person person3 = new Person("Кирил", "Иванов", 35, "мужской");
    private Person person4 = new Person("Аня", "Мальская", 36, "женский");
    private Person person5 = new Person("Андрей", "Иванов", 18, "мужской");
    private Person person6 = new Person("Екатерина", "Иранская", 25, "женский");
    private Person person7 = new Person("Нина", "Тольская", 1, "мужской");
    private Person person8 = new Person("Нина", "Тольская", 2, "мужской");

    @Override
    public void getFamily(Person Person) {
        if (Person.hashCode() == person1.hashCode()){
            System.out.println("Жена: " + person2);
            System.out.println("Ребёнок: " + person3);
        }
        if (Person.hashCode() == person2.hashCode()){
            System.out.println("Муж: " + person1);
            System.out.println("Ребёнок: " + person3);
        }
        if (Person.hashCode() == person3.hashCode()){
            System.out.println("Жена: " + person4);
            System.out.println("Ребёнок: " + person5);
        }
        if (Person.hashCode() == person4.hashCode()){
            System.out.println("Муж: " + person3);
            System.out.println("Ребёнок: " + person4);
        }
        if (Person.hashCode() == person5.hashCode()){
            System.out.println("Жена: " + person6);
            System.out.println("Ребёнок: " + person7);
            System.out.println("Ребёнок: " + person8);
        }
        if (Person.hashCode() == person6.hashCode()){
            System.out.println("Муж: " + person5);
            System.out.println("Ребёнок: " + person7);
            System.out.println("Ребёнок: " + person8);
        }
        if (Person.hashCode() != person1.hashCode() & Person.hashCode() != person2.hashCode() 
        & Person.hashCode() != person3.hashCode() & Person.hashCode() != person4.hashCode()
        & Person.hashCode() != person5.hashCode() & Person.hashCode() != person6.hashCode()
        & Person.hashCode() != person7.hashCode() & Person.hashCode() != person8.hashCode()) {
            System.out.println("Person не из семьи Ивановых");
        }
    }
    
}