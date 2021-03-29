package programmers07;

public class Solution {
    //
    /*
    1. 소문자로 다 바꾸기
    2. 문자 제거 (빼기(-), 밑줄(_), 마침표(.)) 제외
    3. ..을 .으로 바꾸기(안 바뀔떄까지 반복)
    4. start&end . 제거
    5. 비어있으면 a로
    6. 16자 이상이면 15개 자르고 3번 실행
    7. 2자 이하이면 마지막 문자열 반복(3개가 될때까지)

    */
    
    public String solution(String new_id) {
        String answer = "";
        new_id = getLower(new_id);

        new_id = delSC(new_id);

        new_id = murgeDot(new_id); // 반복 돌리기
    
        new_id = checkDot(new_id); // 반복 돌리기 start end .
        
        new_id = checkBlank(new_id);

        new_id = checkOver(new_id);

        new_id = checkUnder(new_id);
        
        answer = new_id;
        return answer;
    }

    public String getLower(String id){ //다 소문자로 바꿔주기
        return id.toLowerCase();
    }

    public String delSC(String id){//특수문자 제거하기
        char tmp;
        
        for(int i=0; i<id.length(); i++){
            tmp = id.charAt(i);
            if((tmp>=33 && tmp<=44 || tmp==47) || (tmp>=58 && tmp<=64) || (tmp>=91 && tmp<=94) || (tmp>=123 && tmp<=126) ){//문자열 값들 비교하기!
                id = id.replace(Character.toString(tmp), "");
                i--;
            }
        }
        return id;
    }

    public String murgeDot(String id){//.. -> .
        String tmp;
        do{
            tmp = id;
            id = id.replace("..", ".");
        }while(tmp != id);
        return id;
    }


    public String checkDot(String id){//.으로 시작 or 끝
        String tmp;
        do{
            tmp = id;
            if(id.startsWith(".")){//.으로 시작할시
                id = id.substring(1,id.length());
                System.out.println(id);
            }else if(id.endsWith(".")){
                id = id.substring(0, id.length()-1);
                System.out.println(id);
            }
        }while(tmp != id);

        return id;
    }

    public String checkBlank(String id){ //값이 비어있을때
        if(id.length() == 0){
            id = "a";
        }
        return id;
    }

    public String checkOver(String id){ //값이 넘치는지 확인
        if(id.length()>15){
            id = id.substring(0, 15);
        }
        id = checkDot(id); // 반복 돌리기 start end .

        return id;
    }

    public String checkUnder(String id){
        while(id.length()<3){
            String tmp = id.substring(id.length()-1, id.length()); // 마지막 문자열 받아오기
            id = id.concat(tmp);
        }
        return id;
    }

}
