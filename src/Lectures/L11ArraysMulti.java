package Lectures;

public class L11ArraysMulti {
    public static void main(String[] args) {
//        Rows and Coln
        int n=2;
        int m=2;
        int[][] array1= new int[n][m];
        int it=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array1[i][j]=it;
                it++;
            }
        }

    }
}
