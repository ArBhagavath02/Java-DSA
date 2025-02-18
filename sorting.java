class sorting{
    public static void main(String[] args) { 
        int [] arr = {20,50,1,8,5};
        int temp = arr[4];
        for(int i = 0;i<arr.length-1;i++)
        {
            if(arr[i+1]<temp)
            {
                temp = arr[i+1];

            }
        
        }
        System.out.println(temp);
    }
}