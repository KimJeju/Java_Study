import java.util.HashMap;
import java.util.Map;

public class test {
    public HashMap<String, String> transformFirstAndLast(String[] arr) {
        // TODO:
        if(arr.length == 0){
            return null;
        }

        HashMap<String,String> result = new HashMap<>();

        result.put(arr[0], arr[arr.length - 1]);
        return result;

    }
}
