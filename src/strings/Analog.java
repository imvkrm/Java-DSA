package strings;

public class Analog {
    public static void main(String[] args) {
       
        boolean analog=checkAnalog1();

        if(analog)
            System.out.println("Analog");
        else
            System.out.println("Not Analog");
    }

  public static  boolean checkAnalog(){//O(n2)
       String a="aab";
       String b="bac";
       boolean isAnalog=false;
       boolean [] isVisted=new boolean[b.length()];
       if(a.length()==b.length()){
       
           for(int i=0;i<a.length();i++){
            isAnalog=false;
                for(int j=0;j<b.length();j++){
                    if(a.charAt(i)==b.charAt(j)&& !isVisted[j]){
                        isVisted[j]=true;
                        isAnalog=true;
                        break;

                    }
                    
                }
                if(!isAnalog) break;
           }
       }

        return isAnalog;
    }
    public static  boolean checkAnalog1(){//O(3n)
        String a="aabc!!!";
        String b="bac!!a!";
        boolean isAnalog=true;
       
        int [] al=new int[256];
       // int [] bl=new int[256];

        for(char c:a.toCharArray()){
            int index=(int)c;
            ++al[index];
        }
        for(char c:b.toCharArray()){
            int index=(int)c;
            --al[index];
           // bl[index]++;
        }

        for(int i=0;i<256;i++){
            if(al[i]!=0){
                isAnalog=false;
                break;
            }
        }
 
         return isAnalog;
     }

}
