
import java.util.Stack;

class stack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(32);
        stack.push(56);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}