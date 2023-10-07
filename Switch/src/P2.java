//WAJP to check given charecter is vowel or consonent use switch 

class P2
{
	public static void main(String[] args) 
	{
		char ch = 'A';
		
		if (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
		{
		 switch (ch)
		 {
		 case('A') :
		 case('E') :
		 case('I') :
		 case('O') :
		 case('U') :
		 case('a') :
		 case('e') :
		 case('i') :
		 case('o') :
		 case('u') :
		  System.out.println(ch+"  is a vowel ");
		 break;
		 default :
			 System.out.println(ch+" is a consonent");
		 }
		}
		 else 
			 System.out.println (ch+"is a number or a special charecter");
		
		}
}
		
		
