package lesson3.homework;

import lesson3.MyStack;

public class HomeWork {


    public static void main(String[] args) {
        System.out.println(reverseText("str1 str2 str3 str4"));
        MyDeque<Integer> deque = new MyDeque<>();
        deque.insertLeft(1);
        System.out.println("Add left: " + deque.peekLeft());
        System.out.println("size: " + deque.size() );
        deque.insertLeft(2);
        System.out.println("Add left: " + deque.peekLeft());
        System.out.println("size: " + deque.size() );
        deque.insertLeft(3);
        System.out.println("Add left: " + deque.peekLeft());
        System.out.println("size: " + deque.size() );
        deque.insertLeft(4);
        System.out.println("Add left: " + deque.peekLeft());
        System.out.println("size: " + deque.size() );
        deque.insertLeft(5);
        System.out.println("Add left: " + deque.peekLeft());
        System.out.println("size: " + deque.size() );
        deque.insertLeft(6);
        System.out.println("Add left: " + deque.peekLeft());
        System.out.println("size: " + deque.size() );
        deque.insertRight(2);
        System.out.println("Add right: " + deque.peekRight());
        System.out.println("size: " + deque.size() );
        deque.insertRight(3);
        System.out.println("Add right: " + deque.peekRight());
        System.out.println("size: " + deque.size() );
        deque.insertRight(4);
        System.out.println("Add right: " + deque.peekRight());
        System.out.println("size: " + deque.size() );
        deque.insertRight(5);
        System.out.println("Add right: " + deque.peekRight());
        System.out.println("size: " + deque.size() );
        deque.insertRight(6);
        System.out.println("Add right: " + deque.peekRight());
        System.out.println("size: " + deque.size() );
        System.out.println(deque.toString());
        System.out.println("===============================");
        System.out.println("Remove Right by Size");
        for (int i = deque.size(); i > 0; i--) {
            System.out.println(deque.removeRight());
            System.out.println("size: " + deque.size() );
        }
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertLeft(4);
        deque.insertLeft(5);
        deque.insertLeft(6);
        deque.insertRight(2);
        deque.insertRight(3);
        deque.insertRight(4);
        deque.insertRight(5);
        deque.insertRight(6);
        System.out.println(deque.toString());
        System.out.println("===============================");
        System.out.println("Remove Left by Size");
        for (int i = deque.size(); i > 0; i--) {
            System.out.println(deque.removeLeft());
            System.out.println("size: " + deque.size() );
        }

    }

    public static String reverseText(String string){
        MyStack<String> stack = new MyStack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String piece : string.split("\\s+"))
        {
            stack.push(piece + " ");
        }
        for (int i = stack.size(); i > 0; i--) {
            stringBuilder.append(stack.peek());
            stack.pop();
        }

        return stringBuilder.toString();
    }


}
