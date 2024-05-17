public class Credit {
    public static int findDigits(long num){
        int result = 0;
        while(num>0){
            int digit = (int)num % 10;
                result++;
            if(result==index){
                return digit;
            }
                num=num/10;
        }
        return -1;
    }
}
