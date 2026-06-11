class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            int[] charArr = new int[26];
        StringBuilder sb=new StringBuilder("");

            for (int j= 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                charArr[ch-97]=charArr[ch-97]+1;
            }
            for(int k=0;k< charArr.length;k++){
                    sb.append(String.valueOf(charArr[k])+"#");
            }
           
           if(map.containsKey(sb.toString())){
            map.get(sb.toString()).add(word);
           }else{
            List<String> list=new ArrayList<>();
            list.add(word);
            map.put(sb.toString(),list);
           }
        }
        List<List<String>> res=new ArrayList<>();

        map.forEach((k,v)->{
            res.add(v);
        });

        return res;
    }

}
