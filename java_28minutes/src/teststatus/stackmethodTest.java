package teststatus;

import java.util.ArrayList;

public class stackmethodTest {
    public static void main(String[] args) {

    }
}

//스택 메서드 push,pop,delete,toString

class Stack{

    ArrayList<Integer> arrayStackList = new ArrayList<>();

    public void setStackPush(int data){
        arrayStackList.add(data);
    }

    public int getStackPoP(){
        if(arrayStackList.size() == 0){
            return 0;
        }else{
            return arrayStackList.remove(arrayStackList.size() - 1);
        }
    }

    public int getStackPeek(){
        if(arrayStackList.size() == 0){
            return 0;
        }else{
            return arrayStackList.get(arrayStackList.size() - 1);
        }
    }

    public String show(){
        return arrayStackList.toString();
    }

    public void delete(){
        arrayStackList.clear();
    }



}
