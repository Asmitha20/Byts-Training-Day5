class Solution{
    public int[] twoSum(int[] nums,int tarhet){
        int[] result = new int[2];
        Map <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(tarhet-nums[i])){
                result[1]=i;
                result[0]=map.get(tarhet-nums[i]);
            }
            map.put(nums[i],i);
        }
        return result;
        
    }
}
