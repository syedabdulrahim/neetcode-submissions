class Solution {
    public boolean isAnagram(String s, String t) {

        int arr[]=new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-97]=arr[ch-97]+1;

        }

         for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);

            arr[ch-97]=arr[ch-97]-1;
            
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) return false;
        }

    return true;
    }
}
