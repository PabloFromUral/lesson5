public class Main {
    public static void main(String[] args) {

        Person[] persons = new Person[5]; // Вначале объявляем массив объектов
        persons[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30); // потом для каждой ячейки массива задаем объект
        persons[1] = new Person("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", 1892312312, 40000, 40);
        persons[2] = new Person("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", 289231231, 50000, 50);
        persons[3] = new Person("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", 389231231, 60000, 60);
        persons[4] = new Person("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", 489231231, 70000, 70);

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge()>40){
                persons[i].getFullInfo();
            }
        }
    }
}