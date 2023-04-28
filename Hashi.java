import java.util.*;
public class Hashi {

    public static void main(String[] args){
        int[] nums = {1,2,1,2,3,4,4};
        System.out.println(single(nums));
    }

    public static int single(int[] nums){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return 0;
    }
    
}
