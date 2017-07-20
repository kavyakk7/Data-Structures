package SmallPrograms;

public class SmallProgram1 {

	public static void main(String []args){

        SmallProgram1 sp = new SmallProgram1();
        char[] str = {'a','b','a','c','b'};
        sp.FirstRepeatedChar(str);
    }
	
	 public void FirstRepeatedChar(char[] str)
     {
         int[] count = new int[256];
         for(int i=0;i<256;i++)
            count[i]=0;
         int i;
         for( i=0; i<str.length;++i)
         {
        	 System.out.println(str[i]);
        	 System.out.println(count[str[i]]);
            if(count[str[i]] == 1)
            {
                System.out.println(str[i]);
                break;
            }
            else
                count[str[i]]++;
        }
        if(i==str.length)
            System.out.println("No Repeated Chracters!");
     }
}
