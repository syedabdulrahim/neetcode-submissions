class Solution {
    public int[] topKFrequent(int[] nums, int k) {

     Map<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer>[] arr = new ArrayList[nums.length+1];

        for(int i=0;i<arr.length;i++){
            ArrayList<Integer> list =new ArrayList<>();
            arr[i]=list;
        }


        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        map.forEach((z,v)->{
            arr[v].add(z);
        });

        List<Integer> res=new ArrayList<>();

        for (int j = arr.length - 1; j >= 0; j--) {
            for (int num : arr[j]) {
                if (res.size() == k) break;
                res.add(num);
            }
            if (res.size() == k) break;
        }
        return  res.stream().mapToInt(Integer::intValue).toArray();
    }
}
