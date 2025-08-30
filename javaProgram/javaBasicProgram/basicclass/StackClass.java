package basicclass;

import java.util.Stack;

public class StackClass
{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.println(s);
        s.push(10);
        s.push(25);
        s.push(46);
        s.push(85);
        s.push(26);
        s.push(53);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search(46));
        System.out.println(s.isEmpty());
        if(s.isEmpty() == true)
        {
            s.push(20);
            System.out.println(s);
        }
        else
        {
            System.out.println(s.pop());
        }
    }
}
