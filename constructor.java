class Example
{
    int a;
    String name;
    Example()
        {
            a=10;
            name="java";
        }
        void display()
        {
            System.out.println("a="+a);
            System.out.println("name="+name);
        }
}
class constructor
{
    public static void main(String args[])
    {
        Example e= new Example();
        e.display();
    }
}