public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n+1];
        int c = 0;
        System.out.println("Prime numbers up to "+n+": ");
        for(int i =2;i<=n;i++){
            arr[i]=true;
            
        } 
        for(int i =2;i<=n;i++){
            if(arr[i]==true){
                for(int j =i+1;j<=n;j++){
                    if(j%i==0){
                        arr[j]=false;

                    }
                }
            }

        }
        for(int i =2;i<=n;i++){
            if(arr[i]==true){
                System.out.println(i);
                c++;
            }
        }
        System.out.println("There are "+c+" primes between 2 and "+n+" ("+(int)((c*100.0)/(n-1))+"% are primes)");
        
 
    }
}