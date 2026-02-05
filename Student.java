class information
{
    int a;
    String name;

    information()
    {
        a=10;
        name="jack";
    }
    void display()
    {
        System.out.println("a: " + a);
        System.out.println("name: " + name);
    }

}
class Student
{
    public static void main(String[] args)
    {
        information s = new information();
        s.display();
    }
}
