class Solution {
    public int mostWordsFound(String[] sentences) {
         int max=0;
        for (String s : sentences){
            int currentLength=s.split(" ").length;
            if(currentLength > max){
                max = currentLength;
            }
        
        }
        return max;
    }
}