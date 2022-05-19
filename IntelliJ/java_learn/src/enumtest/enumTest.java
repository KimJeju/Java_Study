package enumtest;

enum RpgJob{
    JOB_NONE,
    JOB_KNIGHT,
    JOB_ARCHER,
    JOB_WIZARD,
    JOB_END,
}

enum Level{
    LEVEL_NONE,
    LEVEL_EASY,
    LEVEL_NORMAL,
    LEVEL_HARD,
    LEVEL_END,
}

public class enumTest {
    public static void main(String[] args) {
        RpgJob myjob = RpgJob.JOB_KNIGHT;
        System.out.println(myjob);

        Level level = Level.LEVEL_HARD;

        switch (level){
            case LEVEL_EASY:
                System.out.println("쉬움");
                break;
            case LEVEL_NORMAL:
                System.out.println("보통");
                break;
            case LEVEL_HARD:
                System.out.println("어려움");
                break;
            case LEVEL_END:
                System.out.println("종료");
                break;
            default:
                System.out.println("잘못된 입력입니다");
                break;

        }

    }
}

