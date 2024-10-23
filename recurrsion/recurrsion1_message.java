package recurrsion;

public class recurrsion1_message {
    public static void main(String[] args) {
        System.out.println("in main function ");
        message1(1);
        System.out.println("second ");
        messagere(5);
        System.out.println("third     ");
        messagere2(1,5);
        System.out.println("fourth    ");
        int f=fibo(4);
        System.out.println(f);
        System.out.println("fifth    ");
        int fa=fact(5);
        System.out.println(fa);
        System.out.println("sixth    ");
        int sum=sumofdigit(123);
        System.out.println(sum);
        System.out.println("seventh    ");
        int count=count(12030);
        System.out.println(count);
    
        int []a={1,2,3,4,5};
        int s=sumof(a);
        System.out.println(s);






    }
    public static void message1(int n){
        
        message2(2);
        System.out.println(n);
    }
    public static void message2(int n){
        
        message3(3);
        System.out.println(n);
    }
    public static void message3(int n){
        
        message4(4);
        System.out.println(n);
    }
    public static void message4(int n){
        
        message5(5);
        System.out.println(n);
    }
    public static void message5(int n){
System.out.println(n);
    }
    public static void messagere(int n){
        if(n==0){
            return ;
        }
         messagere(n-1);
         System.out.println(n);
    }

    public static void messagere2(int n,int e){
        if(e<n){
            return ;
        }
         messagere2(n+1,e);
         System.out.println(n);
    }
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        //System.out.println(n);
        int f1=fibo(n-1);
        int f2=fibo(n-2);
         return f1+f2;
         
    }
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
         return n*fact(n-1);
    }
    public static int sumofdigit(int n){
        if(n==0){
            return 0;
        }
         return sumofdigit(n/10)+n%10;
    }
    public static int count(int n){

        return countzero(n,0);

    }
    public static int countzero(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            c++;
        }

         return countzero(n/10,c);
    }
    public  static int sumof(int a[]){
        return sum(a,0);
    }
    public static int sum(int a[],int n){
        if(n==a.length){
            return 0;
        }
        

         return a[n]+sum(a,n+1);
    }
    public static void prime(int n,int i){
        if(n<2){
          return;
        }
        if(n%i==0){
          System.out.println(i);
           prime(n/i,i);
        }
        else{
          prime(n,i+1);
        }
      }

      public static int even(int n){
        if(n==0){
          return 0;
        }
        int l=n%10;
        int r=even(n/10);
        if(l%2==0){
          if(r==0){
            return l;
          }
          else{
            return r*10+l;
          }
        }
        else{
          return r;
        }
      }


      class Result{ 
        static int decimalToBinary(int n){ 
     if(n==0){
       return 0;
     }
          int lastDigit = n % 2;
    
            // Recursive call on the remaining digits
            int remaining = decimalToBinary(n / 2);
    
            // Check if the last digit is even
            if (lastDigit != 0) {
                // Combine the last even digit with the remaining digits
                if (remaining == 0) {
                    return lastDigit; // If no remaining digits, just return the last digit
                } else {
                    return remaining * 10 + lastDigit; // Combine with the remaining even digits
                }
            } else {
                // If the last digit is odd, return only the remaining even digits
                return remaining*10; // Skip the odd digit
            }
           
          
         
    }}
    class Result{ 
        static int decimalToBinary(int n){ 
     if(n==0){
       return 0;
     }
          int l=n%2;
          int r=decimalToBinary(n/2);
          return r*10+l;
           
          
         
    }}


}
