package self_study;

public class WordCount {
	public static void main(String args[])
    {
        String text="Enter string: fghdbn";
        int countWords=0;
         
        //word count
        for(int i=0; i<text.length()-1; i++)
        {
            if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
                countWords++;
        }
         
        System.out.println("Total number of words in string are: "+ (countWords+1));
        //since last word does not contain and character after that
                     
    }
}
