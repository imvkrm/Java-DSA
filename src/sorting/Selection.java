package sorting;

public class Selection {
    
    public static void main(String[] args) {
        int a[]={2,1,8,-3,6,4,12};
        int n=a.length;

        for(int i=0;i<n-1;i++){
            int currIndex=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[currIndex]){
                    currIndex=j;
                }
            }
            int temp=a[i];
            a[i]=a[currIndex];
            a[currIndex]=temp;

        }

        for(int item:a){
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
