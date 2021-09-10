package sorting;


class Bubble{

    public static void main(String[] args) {
        int a[]={2,1,8,-3,6,4,12};
        int n=a.length;
        boolean sorted=true;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                int temp= a[j];
                if(a[j]>a[j+1]){
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    sorted=false;

                }
            }
            if(sorted) break;

        }
        for(int items: a){
            System.out.print(items+" ");
        }
        System.out.println();
    }
}