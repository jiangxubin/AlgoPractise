import java.util.HashMap;

class Feibonaqi{
    public static int Solution(int n){
        if(n==1)return 1;
        if(n==2)return 2;
        return Solution(n-1) + Solution(n-2);
    }
    public static Map<Integer, Integer> stateMap = new HashMap<>();

    public static int Solution2(int n){
        if(n<1) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        if(stateMap.contains(n)) return stateMap.get(n);
        else{
            int result = Solution2(n-1)+Solution2(n-2);
            stateMap.put(n, result);
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution(8));
        // int res = Solution2(8);
        // System.out.println(Solution2(8));  
    }
}