class Solution {
    public int countDigits(int num) {
        int count=0;
        int av=num;
        while(av!=0){
            int rem=av%10;
            if(num%rem==0)
            count++;
            av/=10;
        }
        return count;
    }
}
