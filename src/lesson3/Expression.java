package lesson3;

public class Expression {
    private String s;

    public Expression(String s) {
        this.s = s;
    }

    public boolean checkBracket() {
        MyStack<Character> stack = new MyStack<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Error in :" + i + " position");
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(' ||
                        ch == ']' && top != '[' ||
                        ch == '}' && top != '{') {
                    System.out.println("Error in :" + i + " position, bracket doesn't match");
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            System.out.println("Error: bracket doesn't match");
            return false;
        }

        return true;
    }
}
