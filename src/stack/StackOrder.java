package stack;

import java.util.Stack;  

public class StackOrder {  
      
    public boolean isPopByOrder(int[] num , Stack<Integer> s){  
        Stack<Integer> in = new Stack<>();  
        for(int i = 0 ; i < num.length ; i++){  
            in.push(num[i]);  
            while(!in.empty() && in.lastElement().intValue() == s.lastElement().intValue()){  
                in.pop();  
                s.pop();  
            }  
        }  
        if(!in.empty()){  
            return false;  
        }  
        return true;  
    }  
      
    public static void main(String[] args) {  
        Stack<Integer> s = new Stack<>();  
        int[] num = {201 , 202 , 203 , 204 , 205};  
        int[] order = {202 , 201 , 205 , 204 , 203};  
        for(int i = order.length - 1 ; i >= 0; i--){  
            s.push(order[i]);  
        }  
        StackOrder so = new StackOrder();  
        System.out.println(so.isPopByOrder(num, s));  
    }  
      
}  