class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String words[] = sentence.split(" ");
        for(String dic : dictionary) {
            for(int i = 0; i < words.length; i++) {
                if(words[i].length() >= dic.length()) {
                    String newWord = words[i].substring(0, dic.length());
                    if(newWord.equals(dic)) {
                        words[i] = newWord;
                    }
                }
            }
        }
        return String.join(" ", words);
    }
}