public class Pa {




    public static int fun(int a){
if( a==1)
{
return 1;
}
else
{
return (a*fun(a-1));
}
}
public static void main(String[] args) {
    int b=5;
 int c=fun(b);
 System.out.println("fhggj"+c);
}

}
