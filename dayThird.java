import java.util.Scanner;
class dayThird
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String a = obj.next();
        String b = obj.next();
        for(int i = 0; i < a.length(); i++)
        {
            char ch = a.charAt(i);
            if(b.indexOf(ch) == -1)
            {
                System.out.print(ch);
            }
        }
    }
}
