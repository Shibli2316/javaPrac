package SelfArrayPractice;

public class AnonymousArray {
    public static void main(String[] args) {
        System.out.println("This is a program to implement anonymous array in java without explicitly defining it.");
        printArray(new int[] {2,3,4,5});
    }

    static void printArray(int[] arr){
        for (int i: arr){
            System.out.println(i);
        }
    }
}
