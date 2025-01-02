import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> h = new HashMap();
        
        for(int i = 0; i<name.length; i++){
            h.put(name[i],yearning[i]);
        }
        
        for(int i = 0; i < photo.length ; i ++){
            int value = 0;
            for(int j = 0; j < photo[i].length ; j++){
                if(h.containsKey(photo[i][j]))
                    value += h.get(photo[i][j]);
            }
            answer[i] = value;
        }
        
        return answer;
    }
}