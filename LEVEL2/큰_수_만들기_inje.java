// 테스트12 빼고 모두 통과 >> 모두 통과

public static String solution(String number, int k) {
        int count = 0;

        while (k != 0){
            if(count+k+1>answer.length()){
                answer = answer.substring(0,answer.length()-k);
                break;
            }
                
            int max_position = count;
            int max = number.charAt(max_position);

            for(int i = count+1; i<=k+count; i++){
                if(max < number.charAt(i)){
                    max = number.charAt(i);
                    max_position = i;
                    System.out.println("max change  !  max = " + max + "    max_position = " + max_position);
                }
            }
            k = k - (max_position-count);

            number = number.substring(0,count)+number.substring(max_position,number.length());
            System.out.println("number : "+ number);
            count += 1;
        }

        return number;
    }
