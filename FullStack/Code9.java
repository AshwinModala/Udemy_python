package FullStackJava;

public class Code9 {
    public static void main(String[] args) {
        char ch[] = { 'T', 'e', 'l', 'u', 's', 'k', 'o' };

        String st1 = new String(ch);

        String st2 = new String(st1);

        System.out.println(st1); // telusko

        System.out.println(st2); // telusko
    }
    
}