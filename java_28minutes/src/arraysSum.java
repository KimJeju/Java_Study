public class arraysSum {
    public static void main(String[] args) {

        SumTest arr = new SumTest();

        arr.arrSum(new int[] {1,3,4});
    }

}

class SumTest{
    public int arrSum(int[]sum){
        int sumArrays = 0;

        for(int i = 0; i < sum.length; ++i){
             sumArrays += sum[i];
        }

        System.out.println(sumArrays);
        return sumArrays;
    }
}
