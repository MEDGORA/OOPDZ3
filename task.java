
public class task {

    public static void main(String[] args) {

        Person person1 = new Person("Иван", "Лебедев", 57, "мужской");
        Person person2 = new Person("Тарас", "Лебедев", 32, "мужской");
        Person person3 = new Person("Антон", "Лебедев", 18, "мужской");
        Person person4 = new Person("Аня", "Мальская", 30, "женский");
        Person person5 = new Person("Нина", "Тольская", 60, "мужской");
        Person person6 = new Person("Андрей", "Иванов", 58, "мужской");
        Person person7 = new Person("Татьяна", "Брест", 60, "женский");
        Person person8 = new Person("Кирил", "Иванов", 35, "мужской");
        Person person9 = new Person("Аня", "Мальская", 36, "женский");
        Person person10 = new Person("Андрей", "Иванов", 18, "мужской");
        Person person11 = new Person("Екатерина", "Иранская", 25, "женский");
        Person person12 = new Person("Нина", "Тольская", 1, "мужской");
        Person person13 = new Person("Нина", "Тольская", 2, "мужской");

        LebedevFamily LebedevFamily = new LebedevFamily(null, null, null, null);
        LebedevFamily.getFamily(person1);
        System.out.println();
        LebedevFamily.getFamily(person2);
        System.out.println();

        IvanovFamily IvanovFamily = new IvanovFamily(null, null, null, null);
        IvanovFamily.getFamily(person1);
        System.out.println();
        IvanovFamily.getFamily(person11);
        System.out.println();
    }
}