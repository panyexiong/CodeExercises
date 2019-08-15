package com.pan.dataStructure.stack;

/**
 * 使用栈完成计算一个表达式的结果
 */
public class Demo02 {
    public static void main(String[] args) {

    }
}

//先创建一个栈，直接使用前面创建好的栈
class ArrayStack2 {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public ArrayStack2(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    //栈满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //栈空
    public boolean isEmpty() {
        return top == -1;
    }

    //入栈push
    public void push(int value) {
        if (isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("当前栈空！");
        }
        int value = stack[top];
        top--;
        return value;
    }

    //遍历栈,遍历时，需要从栈顶开始显示数据。
    public void list() {
        if (isEmpty()) {
            System.out.println("没有数据，栈空。");
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }

    //返回运算符的优先级，优先级是程序员确定的，优先级使用数字表示
    //数字越大，优先级越高。
    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1; //假定目前的表达式只有‘+’ ‘-’，*，/
        }
    }

    //判断是不是一个运算符
    public boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    //计算方法
    public int cal(int num1,int num2,int num3,int oper){
        int res = 0;
        switch (oper){
            case '+':
                res = num1+num2;
                break;
            case '-':
                res = num2-num1;
                break;
        }
        return 0;
    }
}
