class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        while(a!=b){
            answer++;
            a = (a-1)/2+1;
            b = (b-1)/2+1;
        }

        return answer;
    }
}