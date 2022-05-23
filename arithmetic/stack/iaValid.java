import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author vanku
 * @date 2019-08-15
 * @time 10:41
 * @topic 有效括号
 * @ask 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * @solution 使用闭号当KET开号当VALUE，用栈存储当前遍历到的开括号 进入时先弹掉旧栈顶顶值 ，然后拿闭括号当Key去查找出开括号去比对当前栈顶的值 如不一致则无效。
 */
public class iaValid {


    public static void main(String[] args) {
        int a = 2147483640;
        int b = 2147483624;
        System.out.println(isValid("()[]{}"));

    }


    // Hash table that takes care of the mappings.

    // Initialize hash map with mappings. This simply makes the code easier to read.


    public static boolean isValid(String s) {

        Map<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

}
