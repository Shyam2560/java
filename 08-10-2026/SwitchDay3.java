class SwitchDay3{
	
    public static void main (String args[])
	{
	  int day=1;
	  switch (day){
		  case 0->System.out.println("Sunday");
		  case 1->System.out.println("Monday");
		  case 2->System.out.println("Tuesday");
		  case 3->System.out.println("Wednesday");
		  case 4->System.out.println("Thrusday");
		  case 5->System.out.println("Friday");
		  case 6->System.out.println("Saturday");
		  default->System.out.println("Invalid day");
	  }
	}
}