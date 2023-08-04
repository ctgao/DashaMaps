public class Main {
    public static void main(String[] args){
        String pain = "pmain";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int bucketZero = alphabet.indexOf(pain.charAt(0));
        int bucketOne = alphabet.indexOf(pain.charAt(1));
        String output = "" + alphabet.charAt((bucketZero + bucketOne) % alphabet.length());
        System.out.println(output);
    }
}
