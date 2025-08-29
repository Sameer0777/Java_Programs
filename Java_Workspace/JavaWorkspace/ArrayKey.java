public class ArrayKey {
    public static void main(String[] args) {
        int[] b={10,30,20,10,40,10,20,10};
        int key=10;
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==key)
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
    
}
