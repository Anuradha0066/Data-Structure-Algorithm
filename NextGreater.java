package Practice_Question;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr={8,1,0,3,0,7};
        int[] res=new int[arr.length-1];
        int last=arr[arr.length-1];
        last=-1;
       
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    res[i]=arr[j];
                     break;
                }
               
                else{
                    res[i]=-1;
                }

            }
        }
       
                
        for(int num:res){
           System.out.println(num);
             }
        System.out.println(last);
    }
}
