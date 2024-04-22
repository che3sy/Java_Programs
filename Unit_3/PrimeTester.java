public class PrimeTester
{
    public static void main(String[] args) {
        int testPrime = 123456788;
    boolean isPrime = true;
    int i;

    if (testPrime <= 1){
        System.out.println(testPrime+" is a not prime number!");
    }

    else{

        for(i =2; i*i <= testPrime; i++){

        if((testPrime % i) == 0){
            System.out.println(testPrime+" is a not prime number!");
            isPrime = false;
            break;
        }
        
    }

    if (isPrime){
        System.out.println(testPrime+" is a prime number :(");
    }



        }

    }
}