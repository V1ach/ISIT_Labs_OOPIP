public class Main
{
    public static void main(String[] args)
    {
        KB p = new KB("Люда");
        p.Info();

        Employee stats1 = new Employee("Чаплыкин", "КБ Туполева");
        stats1.Info();
        stats1.workAmount();

        Task stats2 = new Task("Туполев", "Фезюляжем для \"ТУ-2000\"");
        stats2.Info();
        stats2.workAmount(15);

        Position stats3 = new Position("Чаплыкин","Глав. Конструктор");
        stats3.Info();
        stats3.workAmount(3);
    }
}
abstract class Common
{
    private String name;
    public void workAmount()
    {
        System.out.printf("\t* Товращ %s не справился с поставленным планом.\n", Comrade());
    }
    public void workAmount(int work)
    {
        System.out.printf("\t* Товращ %s выполнил %d заказов из плана.\n", Comrade(), work);
    }
    public String Comrade()
    {
        return name;
    }
    public void Write(String Comrade)
    {
        this.name = Comrade;
    }
    abstract void Info();
}
class KB
{
    String name;
    public KB(String Comrade)
    {
        this.name=Comrade;
    }
    public void Info()
    {
        System.out.print("\n--------------------Список Товарищей-------------------\n");
        System.out.printf("Тестовый товарищ %s\n\n", name);
    }
}

class Employee extends Common
{

    String company;
    public Employee(String Comrade, String company)
    {
        super.Write(Comrade);
        this.company = company;
    }

    @Override
    public void Info()
    {
        System.out.printf("ФИО Товарища: %s\t Товарищ работает в %s\n",super.Comrade(), company);
    }

}
class Task extends Common
{
    String task;
    public Task(String Comrade, String task)
    {
        super.Write(Comrade);
        this.task = task;
    }
    @Override
    public void Info()
    {
        System.out.printf("ФИО Товарища: %s\t Товарищ работает над %s\n", super.Comrade(), task);
    }
}
class Position extends Common
{
    String position;
    public Position(String Comrade, String position)
    {
        super.Write(Comrade);
        this.position = position;
    }
    @Override
    public void Info()
    {
        System.out.printf("ФИО Товарища: %s\t Товарищ занимает должность %s\n", super.Comrade(), position);
    }
}