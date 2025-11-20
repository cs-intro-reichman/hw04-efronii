public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n];
        for(int i =2;i<n;i++){
            arr[i]=true;
            
        } 
        for(int i =2;i<n;i++){
            if(arr[i]==true){
                for(int j =i+1;j<n;j++){
                    if(j%i==0){
                        arr[j]=false;

                    }
                }
            }

        }
        for(int i =0;i<n;i++){
            if(arr[i]==true){
                System.out.println(i);
            }
        } 
    }
}