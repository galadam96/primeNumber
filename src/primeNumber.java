public class primeNumber {
    public static void main(String[] args) {
        for (int i = 2; i<100;i++){
            System.out.printf("is %d prime? %b\n" ,i,isPrime(i));
        }

    }

    public static boolean isPrime(int wholeNumber){
        boolean result = true;
        if(wholeNumber < 2){
            result = false;
        }
        else if(wholeNumber == 2){
            result = true;
        }
        else {
            for(int divisor = 2; divisor < wholeNumber; divisor++){
                if(wholeNumber % divisor == 0){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
