class Person
{
    String name="No name";
    public Person(String nm)
    {name=nm;}
    //public Person()
    //{}
}

class Employee extends Person
{String empID="0000";
public Employee(String id)
{super(id);
    empID=id;}}


public class F20200204 {
    public static void main(String[] args) {
        //StringBuilder sb=new StringBuilder("hello");
    Employee e=new Employee("123");
    //System.out.println(e.empID);
        String s1="hhh";
        String s2=new String("hhh");
        System.out.println(s1==s2);
        Integer j1= 12;
        System.out.println(12==j1);
        Integer i2=258;
        Integer j2=258;
        System.out.println(i2==j2);
        String ss1="hhh";
        String ss2=new String("hhh");
        System.out.println(s1==s2);
    int i=0;
    Integer k=new Integer(0);
    Integer j=new Integer(0);
   // System.out.println(k==j);
   System.out.println(j.equals(i));
    }
}
