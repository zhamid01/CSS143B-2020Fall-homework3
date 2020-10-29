package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        ArrayStack<Character> store = new ArrayStack<Character>(str.length());
        //'(', ')', '{', '}', '[',']';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    store.push(ch);
                    break;
                case ')':
                case '}':
                case ']':
                    if (store.size() > 0) {
                        char temp = store.peek();
                        if (temp == '(' && (ch == ')')) {
                            store.pop();
                            break;
                        } else if (temp == '{' && ch == '}') {
                            store.pop();
                            break;
                        } else if (temp == '[' && ch == ']') {
                            store.pop();
                            break;
                        }
                    }
                    else {
                        return false;
                    }
                default :
                    return false;
            }
        }
        if (store.size() == 0) {
            return true;
        }
        return false;
    }
}
