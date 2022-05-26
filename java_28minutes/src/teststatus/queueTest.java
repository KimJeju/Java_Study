package teststatus;
import java.util.*;

public class queueTest {
    public static void main(String[] args) {

    }

    private ArrayList<Integer> listQueue = new ArrayList<Integer>();

    public void add(Integer data) {
        listQueue.add(data);
    }

    public Integer pull() {
        if(listQueue.size() == 0) {
            return null;
        }else {
            return listQueue.remove(listQueue.indexOf(0));
        }
    }

    public int size() {
        return listQueue.size();
    }

    public Integer peek() {
        if(listQueue.size() == 0) {
            return null;
        }else {
            return listQueue.get(listQueue.size());
        }
    }

    public String show() {
        return listQueue.toString();
    }

    public void clear() {
        listQueue.clear();
    }
}
