import java.util.*;
public class wordfrequency
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of sentences : ");
        int n = in.nextInt();
        in.nextLine();
        if (n < 1 || n > 3) 
        {
            System.out.println("error");
            return;
        }
        
        System.out.println("enter new sentences : ");
        String ipStr = in.nextLine();
        ipStr = ipStr.toUpperCase();
        StringTokenizer st = new StringTokenizer(ipStr, " .?");
        int wordCount = st.countTokens();
        System.out.println();
        System.out.println("total no. of words : " + wordCount);
        String wordArr[] = new String[wordCount];
        int wordFreq[] = new int[wordCount];
        int idx = 0;
        for (int i = 0; i < wordCount; i++) 
        {   
            String word = st.nextToken();
            int j = 0;
            for (j = 0; j < idx; j++) 
            {
                if (wordArr[j].equals(word)) 
                {
                    wordFreq[j]++;
                    break;
                }
            }
            if (j == idx) 
            {
                wordArr[idx] = word;
                wordFreq[idx]++;
                idx++;
            }
        }
        for (int i = 0; i < idx - 1; i++) 
        {
            for (int j = 0; j < idx - i - 1; j++) 
            {
                if (wordFreq[j] > wordFreq[j +1]) 
                {
                    int t = wordFreq[j];
                    wordFreq[j] = wordFreq[j+1];
                    wordFreq[j+1] = t; 
                    String temp = wordArr[j];
                    wordArr[j] = wordArr[j+1];
                    wordArr[j+1] = temp;
                }
            } 
        }
        System.out.println("Word\tFrequency");
        for (int i = 0; i < idx; i++)
        {
            System.out.println(wordArr[i] + "\t" + wordFreq[i]);
        }
    }
}