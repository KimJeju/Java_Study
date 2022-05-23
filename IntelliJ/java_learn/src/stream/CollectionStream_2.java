//package stream;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.stream.Stream;
//
//public class CollectionStream_2 {
//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//
//        // 한 라인씩 읽으면서 처리한다.
//        Stream<String> lines = Files
//                .lines(Path.of("C:/Users/kings/Java_study")); //data.txt 파일 저장 경로
//        lines.forEach(line -> {});
//        long end = System.currentTimeMillis();
//        System.out.println("# 작업 시간: " + (end - start));
//    }
//}
