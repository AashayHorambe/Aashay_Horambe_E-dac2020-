import java.util.Scanner;
class Banking
        
{
    public static void main(String args[])
    {
        System.out.println(" Welcome to UNION BANK OF INDIA");
        
        System.out.println(" Kindly choose following options");
        
        
        
        Scanner sc=new Scanner(System.in);
        Employee p=new Employee();
        char ans;
        do{
            System.out.println("1.DIPOSITE \n2.WITHDRAW \n3.MINIMUM BALANCE \n4.OPEN PASSBOOK \n5.CHECKBALANCE");
            System.out.print("  ENTER NUMBER HERE :");
            int x=sc.nextInt();
            Employee sp=new Employee();
            switch(x)
                    {
                    case 1:
                     System.out.print("  ENTER AMMOUT TO BE ADD       :");
                     int m=sc.nextInt();
                     sp.Deposite(m);
                     
                     break;
                     case 2:
                    System.out.print("ENTER AMMOUT TO BE WITHDRAW   :");
                     int n=sc.nextInt();
                     int q=sp.Withdraw(n);
                     if(q<500)
                         System.out.println("YOUR ACCOUT BALANCE LOWER YHAN 500 OR EQUAL TO 500 ");
                     else{
                          System.out.println("YOUR ACCOUNT REMANING BALANCE  : "+q+" RS");
                          }
                     break;
                     case 3:
                     sp.minbal();
                     break;
                     case 4:
                     sp.fun();
                     break;
                     case 5:
                        int j=sp.Bal();
                     if(j<=500)
                          System.out.println("  YOUR ACCOUNT BALANCE LESS THAN 500 .KINDLY UPDATE YOUR BALANCE"); 
                     else  System.out.println("  YOUR ACCOUNT BALANCE       :"+j);  
                     break;
                     default :
                     System.out.println(" You have Enter Incorrect OPTION");  
                    }
               System.out.println("  DO YOU WANT TO CONTINUE Y/N");
               ans=sc.next().charAt(0);
               }
          while(ans=='y' || ans=='Y' );
          System.out.println(" THANKU !! VISIT AGAIN");
    
    }
    static class Employee
    {
        private long accNo=1484568746;
        private  String accName="AASHAY GANPAT HORAMBE";
        //private int Ammout;
        private String type="SAVING"; 
        String bankName="UNION BANK OF INDIA";
        String ifscCode="UBIN00000";
        private int minBal=500;
        private static int bal;
       static int deposite;
      
        void fun()
        {
            System.out.println("BANK NAME                      :"+bankName);
            System.out.println("IFSC CODE                      :"+ifscCode);
            System.out.println("ACCOUNT HOLDER NAME            :"+accName);
            System.out.println("ACCOUNT NUMBER                 :"+accNo);
            System.out.println("PRINT ACCOUT TYPE              :"+type);
        }
        Employee()
        {
            int minBal=500;
        }
        void minbal()
        {
            System.out.println("MINIMUM BALANCE LIMIT IS    : "+minBal+" RS");
        } 
        int Bal()
        {
          return bal;  
         
        }
        void Deposite(int m)
        {
      
         deposite=m+deposite;
         System.out.println("  YOUR ACCOUNT BALANCE UPDATED   : "+deposite+" RS");
         bal=deposite;
        }
        int Withdraw(int n)
        {
            if(bal<=500)
            {
                System.out.println("  YOUR ACCOUNT BALANCE IS LOW");
             }
                
            else{
                 System.out.println("YOUR WITHDRAW AMMOUT SUCCESSFUL");
                    deposite=bal-n;
                }
                   
          bal=deposite;
         return bal;
         
        }
        
    }
}