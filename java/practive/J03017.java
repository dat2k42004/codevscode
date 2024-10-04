import java.util.ArrayList;
import java.util.Scanner;

public class J03017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0)
        {
            // ArrayList<Integer> a = new ArrayList<>();
            String s = sc.next();
            int res = 0;
            for (int i = 0; i < s.length() - 2; ++ i)
            {
                // int cnt = 0;
                if(s.charAt(i) == '1' && s.charAt(i + 1) == '0' && s.charAt(i + 2) == '0')
                {
                    String tmp = s;
                    int j = i, cnt = 0;
                    while (j >= 0)
                    {
                        if(j < tmp.length() - 2 && tmp.charAt(j) == '1' && tmp.charAt(j + 1) == '0' && tmp.charAt(j + 2) == '0')
                        {
                            cnt += 3;
                            tmp = tmp.substring(0, j) + tmp.substring(j + 3);
                            if(j >= 1 && tmp.charAt(j - 1) == '1')
                                j -- ;
                            else if(j >= 2 && tmp.charAt(j - 2) == '1')
                                j -= 2;
                            else if(j >= 3 && tmp.charAt(j - 3) == '1')
                                j -= 3;
                        }
                        else
                            break;
                    }
                    
                    while(j < tmp.length() - 2)
                    {
                        int k = j;
                        while (j < tmp.length() - 2)
                        {
                            if (tmp.charAt(j) == '1' && tmp.charAt(j + 1) == '0' && tmp.charAt(j + 2) == '0')
                                break;
                            j ++ ;
                        }
                        int cnt1 = 0;
                        while (j >= k)
                        {
                            if(j < tmp.length() - 2 && tmp.charAt(j) == '1' && tmp.charAt(j + 1) == '0' && tmp.charAt(j + 2) == '0')
                            {
                                cnt1 += 3;
                                tmp = tmp.substring(0, j) + tmp.substring(j + 3);
                                if(j >= 1 && tmp.charAt(j - 1) == '1')
                                    j -- ;
                                else if(j >= 2 && tmp.charAt(j - 2) == '1')
                                    j -= 2;
                                else if(j >= 3 && tmp.charAt(j - 3) == '1')
                                    j -= 3;
                            }
                            else
                                break;
                        }
                        if (j != k)
                            break;
                        else 
                            cnt += cnt1;
                    }
                    res = Math.max(res, cnt);
                }
            }
            System.out.println(res);            
        }
    }
}

