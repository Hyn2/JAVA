package Test;

public class sorting {
    public static void sort(int[]values) {
        int tmp = 0;
        for(int i = 0 ; i < values.length; i++) {
            for(int j = i + 1; j < values.length; j++) {
                //  현재까지 찾은 최소값과(values[minIdx])와
                //  values[j]를 비교해서 values[j]가 더 작으면
                //  minIdx를 j로 설정 : minIdx = j
                if(values[i] > values[j]) {
                    tmp = values[j];
                    values[j] = values[i];
                    values[i] = tmp;
                }
            }
        }
    }

}