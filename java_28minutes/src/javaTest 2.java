public class javaTest {
    public static void main(String[] args) {

        System.out.println(isOdd(7));
    }

    public static boolean isOdd(int num) {
        //TODO..
        if(num == 0){
            return false;
        }else if(isOdd(num - 1) == isOdd(num -2)){
            return true;
        }else{
            return false;
        }

    }
}
