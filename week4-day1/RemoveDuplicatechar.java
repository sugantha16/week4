package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String companyName="paypal india";
char[] ch=companyName.toCharArray();
Set<Character> unique=new LinkedHashSet<Character>();
for (Character character: ch)
{
	unique.add(character);
	}
	System.out.println(unique);	
	}

}
