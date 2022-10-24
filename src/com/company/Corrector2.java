package com.company;

public class Corrector2 {
    public static String[] dict = {
            "a", "able", "about", "advance", "advantage", "advice", "after",
            "all", "and", "answer", "apply", "approach", "are", "as",
            "ask", "assignment", "assignments", "assistant", "assume", "at", "be",
            "because", "become", "before", "being", "book", "but", "by",
            "carefully", "catch", "challenge", "chance", "chapter", "chapters", "class",
            "code", "come", "coming", "complex", "computer", "concentrate", "concentrated",
            "concepts", "context", "couple", "course", "designed", "details",
            "discover", "discussed", "do", "does", "done", "down", "each", "even",
            "everything", "expect", "experience", "few", "figure", "find", "fine",
            "first", "for", "fully", "give", "good", "hand", "hatch", "have", "head", "help",
            "here", "hive", "how", "i", "ideas", "if", "important", "in", "incorporate",
            "indication", "instead", "into", "is", "it", "key", "lab", "labs",
            "later", "learned", "learning", "lecture", "like", "many", "may",
            "might", "more", "most", "my", "nevertheless", "new", "not", "notes",
            "of", "omit", "on", "only", "or", "other", "others", "out",
            "participate", "plenty", "points", "presented", "program", "question",
            "questions", "raise", "rarely", "read", "reading", "relevant",
            "remaining", "replace", "requiring", "respect", "room", "said",
            "science", "seem", "semester", "setting", "should", "sitting",
            "situations", "skim", "so", "some", "something", "straightforward",
            "students", "suggested", "suggestion", "take", "teaching", "that",
            "the", "them", "then", "there", "they", "things", "think", "this",
            "throughout", "time", "to", "too", "try", "trying", "understand",
            "up", "want", "wasting", "way", "we", "welcome", "what", "when",
            "where", "will", "wish", "with", "work", "write", "you", "your"
    };

    public static String doc = "Thsi is a document tihat may hve some random mispellings. Do not overuse commas, seriously. Asking quesitons is godo lke how does this wrk. The code in the proram shoudl atch a few misspellings ";

    public static void main(String[] args){
        splitInput(doc);
        for(int i = 0; i<words.length; i++){
            System.out.println(getNextWord());
        }

    }

    public static String[] words;

    public static int index;

    public static void splitInput(String str){
        words = str.split("[ ,.]+");
    }

    public static String getNextWord(){
        return words[++index];

    }

    public static Boolean checkInDict(String[] dict, String word){
        String loweredWord = word.toLowerCase();
        String[] words = loweredWord.split("[ ,.]+");
        for(int i = 0; i<words.length; i++){
            for(int j = 0; j<dict.length; j++){
                if(words[i].equals(dict[j]))
                    return true;
            }
        }
        return false;
    }

    public static char[] checkSwap(String rawWord){
        char[] ch = rawWord.toCharArray();
        for(int i = 0; i<rawWord.length(); i++){
            for(int j = 0; j<rawWord.length(); j++){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                if(checkInDict(dict, rawWord)){
                    return ch;
                }
            }
        }
        return ch;
    }

    public static String[] checkMissing(String rawWord){
        return new String[]{"d"};
    }

    public static String[] checkExtra(String rawWord){
        return new String[]{"d"};
    }
}
