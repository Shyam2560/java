class SwitchCaseDay3{
	
    public static void main (String args[])
	{
	  int day=5;
	  String result =switch (day){
		  case 0->"Sunday";
		  case 1->"Monday";
		  case 2->"Tuesday";
		  case 3->"Wednesday";
		  case 4->"Thrusday";
		  case 5->"Friday";
		  case 6->"Saturday";
		  default->"Invalid day";
	  };
	  System.out.println(result);
	}
}