package pack1;
public class A
{
    String name = "";
    public void cap( String name){
         this.name = name;
    }
}

class B{

    public static void main(String[] args)
    {
        A a = new A();
        a.cap("john");
        System.out.println(a.name);
    }
}

