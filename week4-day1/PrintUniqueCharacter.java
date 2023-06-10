package week4.day1;

import java.util.HashSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="babu";
		char[] ch=name.toCharArray();
HashSet<Character> unique= new HashSet<Character>();
HashSet<Character> duplicate=new HashSet<Character>();
for(char i: ch)
{
if(unique.contains(i))
{
unique.add(i);
duplicate.remove(i);
}
else
{
	unique.add(i);
	duplicate.add(i);
	}
}
System.out.println("babu");
System.out.println(duplicate);
}

	}


