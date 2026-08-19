class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int a = dist(p1,p2);
        int b = dist(p1,p3);
        int c = dist(p1,p4);
        int d = dist(p2,p3);
        int e = dist(p2,p4);
        int f = dist(p3,p4);

        int[] arr = {a,b,c,d,e,f};
        java.util.Arrays.sort(arr);

        return arr[0]>0 &&
        arr[0]==arr[1] &&
        arr[1]== arr[2] &&
        arr[2] == arr[3] &&
        arr[4] == arr[5];
    }

     int dist(int[] p ,int[]q){
        int x = p[0]-q[0];
        int y = p[1] - q[1];         
        
        return x*x + y*y;
    }
}