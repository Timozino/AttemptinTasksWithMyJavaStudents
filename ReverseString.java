public class ReverseString{
    public static void main(String[] args){

        //String answer=reverseString("Happiness");
        //int answer = powerOfTwo(3);
        int answer = fibonacci(7);
        System.out.println(answer);
    }

    // public static String reverseString(String s){

    //    String reversed = "";

    //     for (int i = s.length() - 1; i>=0; i --){
    //         reversed += s.charAt(i);
    //     }

    //     return reversed;
     
    // }
    // public static int powerOfTwo(int n){
    //     if ( n == 0){
    //         return 1;
    //     }else{
    //         int power = powerOfTwo(n-1);
    //         return power*2;
    //     }
    // } 
    // public static int factorial(int n){
    //     if (n==0 || n==1){
    //         return 1;
    //     }else{
    //        return n*factorial(n-1);
    //     }
    // }
    public static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}