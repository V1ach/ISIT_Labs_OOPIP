public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Caroline", 18, 0);      // вызов первого конструктора без параметров
        p1.displayInfo();
        Person p2 = new Person("Johny", 40, 100); // вызов второго конструктора с одним параметром
        p2.displayInfo();
        Person p3 = new Person("Biily", 27, 99); // вызов третьего конструктора с двумя параметрами
        p3.displayInfo();
        Person p4 = new Person("Angel", 30, 69); // вызов третьего конструктора с двумя параметрами
        p4.displayInfo();
    }
}
class Person
{
    String name;
    int age;
    int products_made;
    Person()
    {
        this.name = "No info";
        this.age = 999;
        this.products_made = 0;
    }
    Person(String name)
    {
        this.name = name;
        this.age = 0;
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    Person(String name, int age, int products_made)
    {
        this.name = name;
        this.age = age;
        this.products_made = products_made;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d \tProducts made: %d\n", name, age, products_made);
    }
}
