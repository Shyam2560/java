class OpConDay1{
	
    public static void main (String args[])
	{
	  int a=5;
	  int b=11;
	  int c=8;
	  int d=(a>b)? a:b;
	  int e=(c>d)? c:d;
	  int f=(a>b)? (a>c ? a:c) : (b>c ? b:c);
	  System.out.println(d);
	  System.out.println(f);
	  
	}
}