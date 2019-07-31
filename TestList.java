package cn.list;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @ClassName TestList
 * @Description 测试JDK的ArraysList和LinkedList
 * @Auther danni
 * @Date 2019/7/30 10:08]
 * @Version 1.0
 **/

public class TestList {
    //利用两个栈实现一个队列
    /*
    private ArrayList<Integer> out=new ArrayList<>();
    private ArrayList<Integer> in=new ArrayList<>();

    public void push(int x){
        in.add(x);
    }
    public int pop(){
        if(out.isEmpty()){
            int len=in.size();
            for (int i = 0; i <len; i++) {
                out.add(in.remove(in.size()-1));
            }
        }
        return out.remove(out.size()-1);
    }
    public int peek(){
        if(out.isEmpty()){
            int len=in.size();
            for (int i = 0; i <len; i++) {
                out.add(in.remove(in.size()-1));
            }
        }
        return out.get(out.size()-1);

    }

    public boolean isEmpty(){
        if(out.isEmpty()&&in.isEmpty()){
            return true;
        }
        return false;
    }

  */
    public static void main(String[] args) {

    }
}
