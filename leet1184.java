import java.util.Scanner;

public class leet1184 {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start>destination)
        {int t=start;
        start=destination;
        destination=t;
        }
        int tsum=0;
        for(int i:distance)
        tsum+=i;

        int s=0;
        for(int i=start;i<destination;i++)
        {
            s+=distance[i];
        }
        return Math.min(s,tsum-s);
        
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] distance=new int[n];
        for(int i=0;i<n;i++)
        {
            distance[i]=ob.nextInt();
        }
        int start=ob.nextInt();
        int destination=ob.nextInt();
        ob.close();
        System.out.println(distanceBetweenBusStops(distance, start, destination));
    }
}
