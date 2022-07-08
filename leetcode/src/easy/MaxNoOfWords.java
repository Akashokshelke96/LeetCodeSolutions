package easy;

public class MaxNoOfWords {
    public static void main(String[] args) {
        //MAXIMUM NUMBER OF WORDS IN AN ARRAY INDEX
       String[]  sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        char sp = ' ';
        int count = 0;
        for(int i =0 ; i < sentences.length ; i++){
            String select = sentences[i];
            for(int j = 0 ; j < select.length() ; j++){
                if(select.charAt(j) == sp){
                    count++;
                }
            }

        }
        return count;
    }
}
