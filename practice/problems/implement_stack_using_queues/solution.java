import java.util.ArrayList;

class MyStack {

    /** Initialize your data structure here. */
    public int ptr;
    public ArrayList<Integer> list;
    public MyStack() {
        list = new ArrayList<Integer>(1000);
        ptr = -1;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(ptr == -1){
            if(list.isEmpty()){
                ++ ptr;
                list.add(ptr,Integer.valueOf(x));
            }
            else{
                ++ptr;
                list.set(ptr, Integer.valueOf(x));
            }
        }else{
            if(ptr + 1 >= list.size()){
                ptr ++;
                list.add(ptr, Integer.valueOf(x));
            }else{
                list.set(++ptr, Integer.valueOf(x));
            }
        }

    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return (int)list.get(ptr--);
    }
    
    /** Get the top element. */
    public int top() {
        return (int)list.get(ptr);
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return ptr == -1;
    }
}
