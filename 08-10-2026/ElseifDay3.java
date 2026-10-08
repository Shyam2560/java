class ElseifDay3{
	
    public static void main (String args[])
	{
	  int a=90;
	  String grade ="";
	  if (a>90 &&a<=100)
	  {
	     grade="A grade";
	  }
	  else if(a>80 && a<=90)
	  {
		  grade="B grade";
		   
	  }
	  else if(a>70 && a<=80)
	  {
		  grade="C grade";
		   
	  }
	  else if(a>60 && a<=70)
	  {
		  grade="D grade";
		   
	  }
	  else if(a>50 && a<=60)
	  {
		  grade="E grade";
		   
	  }
	  else
	  {
		  grade="F grade";
		   
	  }
	  
	   System.out.println (a+" is "+grade);
	}
}