class prime3
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int p=sc;
        int count=0;
        for(int i=0;i<p;i++)
        {
            if(p%i==0)
            {
                count=count+1;
            }
            if(count==2)
            {
                System.out.println("given number is a prime ");
            }
        }
    }
}