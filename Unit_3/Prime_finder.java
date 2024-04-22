/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */
public class Prime_finder {
    public static void main(String[] args) {
        int number = 10;  // Prime number
        int n = 2;
        int count = 0;
        
        while (true) {
            if (isPrime(n)) {
                count++;
                if (count == number) {
                    System.out.println("The " + number + "th prime number is: " + n);
                    break;
                }
            }
            n++;
        }
    }

    public static boolean isPrime(int x) {
        
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false; //even
            }
        }
        
        return true; //is prime
    }
}


