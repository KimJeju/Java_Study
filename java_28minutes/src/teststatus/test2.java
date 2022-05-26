package teststatus;

public class test2 {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(32));
    }

    public static boolean powerOfTwo(long num) {
        // TODO:
        if(num == 1){
            return true;
        }

        while(num  % 2 == 0) {
            for(int i = 0; i < num; ++i){
                  num = num * i;
                  return true;
            }
        }

        return false;
    }
}
