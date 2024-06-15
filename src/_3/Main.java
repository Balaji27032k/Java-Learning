package _3;

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int i,j;
        for(j=0;j<T;j++)
        {
            System.out.print("value of i: "+j);
            System.out.println("value of T: "+T);
            System.out.println("came here");
            int n = sc.nextInt();
            String[] words = new String[n];
            for(i=0;i<n;i++)
            {
                words[i]=sc.next();
            }
            HashMap<String,Integer> mp1 = new HashMap<>();
            for(i=0;i<words.length;i++)
            {
                if(mp1.containsKey(words[i]))
                {
                    mp1.put(words[i],mp1.get(words[i])+1);
                }
                else
                {
                    mp1.put(words[i],1);
                }
            }
            List<String>list1 = new ArrayList<>();
            for(Map.Entry<String,Integer> mp2:mp1.entrySet())
            {
                if(mp2.getValue()>1)
                {
                    list1.add(mp2.getKey());
                    list1.add(" ");
                }
            }
            list1.stream().forEach(System.out::print);
        }
    }
}