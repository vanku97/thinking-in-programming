import java.util.Stack;

/**
 * @author Albert Ku
 * @date 2020/2/14
 * @time 17:11
 * @content
 */


public class MaxStack {

    private Stack<Integer> data;
    private Stack<Integer> helper;

    public MaxStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    //置入
    public synchronized void push(int x) {

        data.push(x);
        if (helper.empty() || helper.peek() <= x) {
            helper.push(x);
        }
    }

    //删除栈顶元素
    public synchronized void pop() {
        if (!data.empty()) {
            if (helper.peek().equals(data.peek())){
                helper.pop();
            }
            data.pop();
        }

    }

    //获取栈顶元素
    public int top() {
        if (!data.empty()) {
            return data.peek();
        }
        throw new RuntimeException("栈内元素为空");
    }

    //获取最小元素
    public int getMin() {
        if (!data.empty()) {
            return helper.peek();
        }
        throw new RuntimeException("栈内元素为空");
    }

}
