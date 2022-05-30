package teststatus;

import java.util.ArrayList;
import java.util.*;
import java.util.Stack;

public class browserTest {
    public static void main(String[] args) {

    }
}

class Solution {
    public ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        // TODO:
        current.push(start);

        if(start.matches("^[^A-Z]")){
            current.push("false");
            result = new ArrayList(current);
            return result;
        }

        current.push(start);

        for(int i = 0; i <= actions.length; ++i){
            if(actions[i] == "-1"){
                current.push(prevStack.peek());
                prevStack.push(current.peek());
            }
            if(actions[i] == "1"){
                prevStack.push(current.peek());
                current.push(nextStack.peek());
                nextStack.pop();
            }
            if(actions[i] == "^[A-Z]"){
                prevStack.push(current.peek());
                nextStack.clear();
            }
        }

        return result;
    }
}

