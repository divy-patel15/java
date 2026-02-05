class information
{
    int a;
    String name;
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
        information obj = new information();
        obj.a = 10;
        obj.name = "John Doe";
        obj.display();
    }
}