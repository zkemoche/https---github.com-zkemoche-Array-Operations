import java.util.Scanner; 
import java.util.Stack;

public class ReverseString {
    public static void main (String[] args) {
        //Prompt a user for a single string input
        Scanner in = new Scanner (System. in) ;
        System.out.println ("Enter a string to reverse");
        String input = in.next ();
        Stack <Character> stack = new Stack<> () ;

        // Push all characters of the string into the stack
        for (char ch : input. toCharArray()) {
            stack.push (ch) ;
        }

        // Pop characters from the stack and build the reversed string
        StringBuilder reversed = new StringBuilder () ;
        while (!stack. isEmpty()) {
            reversed.append (stack.pop());
        }
        System.out.println ("Reversed string: " + reversed.toString());
    }

}
