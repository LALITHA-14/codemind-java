public class UppercaseCount {
    public static void main(String[] args) {
        String s="Aditya Engineering College";
        int upperCaseLetterCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                upperCaseLetterCount++;
            }
        }
        System.out.println(upperCaseLetterCount);
    }
}
