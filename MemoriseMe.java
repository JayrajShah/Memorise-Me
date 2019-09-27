package memoriseMe;

import java.util.*;


class MemoriseMe {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q,cc;
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        int Q=s.nextInt();
        int res[] = new int[Q];
         for(int i = 0 ; i<Q ; i++)
        {
            cc=0;
            q=s.nextInt();
            for(int j=0;j<n;j++)
            {
                if(arr[j]==q)
                    cc++;
            }
            if(cc==0)
            {
                res[i]=0;
            }
            else
                res[i]=cc; 
        }
        for(int i = 0 ; i<Q ; i++)
        {
            if(res[i]!=0)
            System.out.println(res[i]);
            else
             System.out.println("NOT PRESENT");
            
        }
    }
}