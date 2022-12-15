package Random.Assignment3.Q3;

public class Main {
    public static void main(String[] args) {
        Human_Body h1 = new Human_Body(2,3);
        Human_Body h2 = new Human_Body(4, 5);
        Human_Body.Eye e1 = h1.new Eye("Brown", 20);
        Human_Body.Eye e2 = h2.new Eye("Green", 30);
        e1.display();
        e2.display();
    }
}
