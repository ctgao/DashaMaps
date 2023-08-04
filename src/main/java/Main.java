public class Main {
    public static void main(String[] args){
        String pain = "pmain";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        int bucketZero = alphabet.indexOf(pain.charAt(0));
//        int bucketOne = alphabet.indexOf(pain.charAt(1));
//        String output = "" + alphabet.charAt((bucketZero + bucketOne) % alphabet.length());
//        System.out.println(output);
//        System.out.println(String.valueOf(pain.charAt(0)+pain.charAt(1)).toLowerCase());
//        System.out.println(pain.charAt(0));
//        System.out.println(pain.charAt(1));
//        System.out.println(pain.charAt(0) + pain.charAt(1) - 'a');
//        System.out.println((char)((pain.charAt(0) + pain.charAt(1) - 'a') % 26) + 'a');
//        int sum = pain.charAt(0) + pain.charAt(1);
//        while(sum >= (int) 'z'){
//            sum -= 26;
//        }
//        System.out.println("" + (char) sum);

        int alphaNumOne = alphabet.indexOf(pain.charAt(0)) + 1;
        int alphaNumTwo = alphabet.indexOf(pain.charAt(1)) + 1;
        char c = alphabet.charAt((alphaNumOne + alphaNumTwo) % alphabet.length() - 1);
        System.out.println(c);
    }
}
