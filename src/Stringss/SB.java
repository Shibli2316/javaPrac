package Stringss;

public class SB {
    public static void main(String[] args) {
//        Not creating new objects
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<26; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
//        here toString is not required as it calls it internally
        System.out.println(builder.toString());
    }
}
