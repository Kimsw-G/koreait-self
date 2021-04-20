package programmers02;

import java.util.Arrays;
import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int[] numbers) {
        int leng = numbers.length;
        int[] answer = new int[(leng)*(leng-1)/2];
        for (int l=0; l<answer.length; l++){
            System.out.print("");
            for (int i=0; i<leng; i++) {
                for (int j=i+1; j<leng; j++) {
                    answer[l] = numbers[i] + numbers[j];
                    l++;
                }
            }
        }
        
        Integer answer_[] = Arrays.stream(answer).boxed().toArray(Integer[]::new);
        Integer[] result_ = array_unique(answer_);
        int result[] = Arrays.stream(result_).mapToInt(i->i).toArray();

        Arrays.sort(result);


        return result;
    }

    static Integer[] array_unique(Integer[] answer) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(Arrays.asList(answer));
        Integer[] result = new Integer[lhs.size()];
        lhs.toArray(result);
        return result;
    }
}
