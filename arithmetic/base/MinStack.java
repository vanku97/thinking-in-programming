package base;

import java.util.Stack;

/**
 * @author vanku
 * @date 2020/2/14
 * @time 16:40
 * @content
 */


public class MinStack {


    private Stack<Integer> data;
    private Stack<Integer> helper;

    public MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    //置入
    public void push(int x) {

        data.push(x);
        if (helper.empty() || helper.peek() >= x) {
            helper.push(x);
        }
    }

    //删除栈顶元素
    public void pop() {
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
