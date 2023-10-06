import java.util.Scanner;

public class waterGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int waterglass=sc.nextInt();
            int bound=waterglass;
            int rate=sc.nextInt();
            int day=1;
            while(waterglass>0)
            {
               waterglass=Math.min(waterglass+rate, bound);
               waterglass=Math.max(waterglass-day, 0);
               day++;
            }
            System.out.println(day-1);
        }
    }
}
