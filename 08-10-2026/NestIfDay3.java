class NestIfDay3{
	
    public static void main (String args[])
	{
	  int a=45;
	  int b=98;
	  int c=670;
	  if (a>b)
	  {
	  if (a>c){
	  System.out.println(a+" is a biggest number");
	  }
	  else
	  {
		   System.out.println (c+" is biggest number");
		   
	  }
	  }else{
	  if(b>c)
	  {
	     System.out.println(b+" is a greatest number");
	  }
	  else
	  {
		   System.out.println (c+" is not a greatest number");
		   
	  }
	  }
	  
	}
}