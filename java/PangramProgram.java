import java.util.Scanner;

public class PangramProgram 
{
	static boolean isPanagram(String str)
	{
		char ch[]=str.toCharArray();
		if(ch.length<25)
		{
			return false;
		}
		int count[]=new int[26];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				count[ch[i]-97]++;
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
			{
				count[ch[i]-65]++;
			}
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Sentence :");
		Scanner scr=new Scanner(System.in);
		String str=scr.next();
		System.out.println(isPanagram(str));
	}

}
