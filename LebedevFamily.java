public class LebedevFamily extends Family {

    public LebedevFamily(String personName, String personSurname, Integer personAge, String personSex){
        super(personName, personSurname, personAge, personSex);
    }

    private Person person1 = new Person("Иван", "Лебедев", 57, "мужской");
    private Person person2 = new Person("Тарас", "Лебедев", 32, "мужской");
    private Person person3 = new Person("Антон", "Лебедев", 18, "мужской");
    private Person person4 = new Person("Аня", "Мальская", 30, "женский");
    private Person person5 = new Person("Нина", "Тольская", 60, "женский");
    
    
    @Override
    public void getFamily(Person Person) {
        if (Person.hashCode() == person1.hashCode()){
            System.out.println("Жена: " + person5);
            System.out.println("Ребёнок: " + person2);
        }
        if (Person.hashCode() == person5.hashCode()){
            System.out.println("Супруг: " + person1);
            System.out.println("Ребёнок: " + person2);
        }
        if (Person.hashCode() == person2.hashCode()){
            System.out.println("Жена: " + person4);
            System.out.println("Ребёнок: " + person3);
        }
        if (Person.hashCode() == person4.hashCode()){
            System.out.println("Жена: " + person2);
            System.out.println("Ребёнок: " + person3);
        }
        if (Person.hashCode() == person3.hashCode()){
            System.out.println("Не женат, нет детей");
        }
        if (Person.hashCode() != person1.hashCode() & Person.hashCode() != person2.hashCode() 
        & Person.hashCode() != person4.hashCode() & Person.hashCode() != person2.hashCode() 
        & Person.hashCode() != person5.hashCode()) {
            System.out.println("Person не из семьи Лебедевых");
        }
    }
}
