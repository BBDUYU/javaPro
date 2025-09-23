package days27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex01 {

   public static void main(String[] args) {
      try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

            int n = Integer.parseInt(br.readLine()); //입력

            String[] input = br.readLine().split("\\s"); //정규식

            List<Integer> length = new ArrayList<>(); //길이
            for (int i = 0; i < n; i++) {
               length.add(Integer.parseInt(input[i])); //입력 받은 input[i]를 legnth 에 추가
            }
            Collections.sort(length); //정렬
            while (!length.isEmpty()) {
                System.out.println(length.size());
                int min = 0;
                for (int len : length) {//첫번째 값 min = 최소값
                   if (len > 0) {
                        min = len;
                        break;
                    }                }
                List<Integer> newLength = new ArrayList<>(); //계산된 값을 넣을 리스트
                for (int len : length) { // len값에 length값 넣어가며 반복
                    int newLen = len - min; //length - 최소값
                    if (newLen != 0) newLength.add(newLen); // 0이 아니면 다시 리스트에 추가
                }

                length = newLength;
                Collections.sort(length);
            }

        } catch (Exception e) {
        }
   }

}
