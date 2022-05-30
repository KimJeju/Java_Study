import java.util.Arrays;

public class StringlengthTest {
    public static void main(String[] args) {
        String[] textValue = {"monday", "tuesday", "Wednesday", "thursDay", "Friday", "saturday"};

        String data = "";

        for(String day:textValue){
            if(day.length() > data.length()){
                data = day ;
            }
        }
        System.out.println(data);

        for(int i = textValue.length - 1; i >= 0; --i){ //i 는 배열의 마지막; 배열의 마지막 >= 0; --i
            System.out.println(textValue[i]);
        }
    }
}
