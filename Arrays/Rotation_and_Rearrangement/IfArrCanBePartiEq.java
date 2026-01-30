package Rotation_and_Rearrangement;

public class IfArrCanBePartiEq {
    public static void main(String[] args) {
        int total =0;
        int[] arr = {5,6, 4,10,1, 2,3};
        for(int i =0; i<arr.length; i++)
            total +=arr[i];
        boolean pos = false;
        if(total%2==0){
            int target = total/2;
            for(int i=0; i<arr.length; i++){
                int sum = 0;

                for(int j = i; j<arr.length; j++){
                    sum +=arr[j];
                    if(sum==target){
                        pos = true;
                        break;
                    }
                }
                if(pos) break;
            }
        }
        System.out.println(pos? "Partition" : "No Partition");
    }
}
