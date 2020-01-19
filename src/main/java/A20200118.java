

public class A20200118 {

    public static boolean isAdmin(String userID) {
        return userID.toLowerCase() == "admin";
    }
   /* public static void main(String[] args) {
   //System.out.println(isAdmin("Admin"));
//System.out.println("Admin".toLowerCase());
 //System.out.println("admin"=="admin");}

        String greet1="Hello";
        String greet2="Hello";
        System.out.println(greet1==greet2);
        System.out.println(greet1=="Hello");
        String string1=new String("Hello");
        String string2=new String("Hello");
        System.out.println(string1==string2);
        StringBuilder stringBuilder=new StringBuilder("Hello");
        StringBuilder stringBuilder2=new StringBuilder("Hello");
       System.out.println(stringBuilder==stringBuilder2);
}

*/

    public  void hello() {
        System.out.println("Hello");
    }
/*public int aMethod()
{
   int i=0;
   i++;
   return i;}*/

    public static void main(String[] args) {
        A20200118 a =new A20200118();
        a.hello();

    }

}
