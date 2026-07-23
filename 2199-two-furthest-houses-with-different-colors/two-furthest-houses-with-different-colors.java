class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;

        int i = n-1;
        while(colors[i]==colors[0]){
            i--;
        }
        int j =0;
        while(colors[j]==colors[n-1]){
            j++;
        }
    return Math.max(i,(n-1)-j);
  }
}
