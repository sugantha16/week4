package week4.day1;

public class RemoveDuplicateWord {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	String text="We learn java basics as part of java sessions in java week1";
	System.out.println(text);
	String[] arr=text.split(" "); 
	for(int i=0;i<arr.length;i++)    
	{
	  if(arr[i]!=null)
	  {
	  
	  for(int j=i+1;j<arr.length;j++) 
	  {
	      if(arr[i].equals(arr[j]))       
	    {
	      arr[j]=null;      
	    }
	  }
	  }
	}
	for(int k=0;k<arr.length;k++)      
	{
	  if(arr[k]!=null)
	  {
	    System.out.print(arr[k] + " ");
	  }
		
	}
		}

	}

