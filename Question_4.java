public class Question_4 {
    public static void main(String[] args) {
        int []arr={2,-3,5,8,1,0,-4};
        int min=1010;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }

        }System.out.println(min);

    }
    
}
