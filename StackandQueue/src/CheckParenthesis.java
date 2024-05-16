import java.util.Scanner;
import java.util.Stack;

public class CheckParenthesis {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        System.out.println("Enter parentheses : ");
        Scanner in = new Scanner(System.in);
        String parentheses = in.nextLine();
        for(int i=0;i<parentheses.length();i++){
            char s = parentheses.charAt(i);
            if(s=='{' || s=='[' || s=='('){
                stack.push(s);
            } else if (s=='}' || s==']' || s==')') {
                if(stack.isEmpty()){
                    System.out.println("The given parentheses not balanced");
                    return;
                } else{
                    char r = stack.pop();
                    if((r!='{' && s=='}') || (r!='(' && s==')') || (r!='[' && s==']') ){
                        System.out.println("The given parentheses not balance");
                        return;
                    }
                }
            }
        }
        if(stack.isEmpty())
            System.out.println("The given parentheses is balanced");
        else
            System.out.println("The given parentheses is not balanced");
    }
}
