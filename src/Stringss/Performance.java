package Stringss;

public class Performance {
    public static void main(String[] args) {
//        not a good approach
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
    }
}
