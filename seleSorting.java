class seleSorting{
    public static void main(String[] args) { 
        int [] arr = {2,5,6,9,0,5};
        int [] sortArry = new int[arr.length];
        int x =0;
        for(int i = 0; i<arr.length-1;i++){
            for(int j = 1;j<arr.length-1;j++){
                if(arr[i]<arr[j]){
                    sortArry[x] = arr[i];                  
                    x++;
                }
            }
        }
         
         for(int i=0; i<sortArry.length-1; i++)
         {
            System.out.print(sortArray[i] + " ");
         }
    }    
}