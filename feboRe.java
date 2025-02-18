class feboRe{
    public static void main(String[] args) { 
        int n = 10;
        int St_num = 0,Se_num = 1;
        {
            for(int i =1;i<=n;i++){                                                                                    
                System.out.println(St_num+" ");
                int val = St_num+Se_num;
                St_num = Se_num;
                Se_num = val;
            }
        } 
    }
}