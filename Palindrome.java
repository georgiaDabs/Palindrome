import java.util.Scanner;
public class Palindrome
{
    public String word;
    public boolean end;
    public static void main(String[]args){
        Palindrome p=new Palindrome();
       
    }

    public Palindrome(){
        System.out.println("enter word");
        Scanner sc=new Scanner(System.in);
        word=sc.next();
        test();
    
    }

    public void test(){
        
        String[] ary=word.split("");
        int i=0;
        int j=word.length()-1;
        boolean pal=true;
        if(ary[i].equals("")){
            i++;
            //System.out.println("method called");
        }
        while(j>i){
            if(!ary[i].equals(ary[j])){
                pal=false;
               // System.out.println(ary[i]+" does not equal "+ary[j]);
            }
            i++;
            j--;
        }
        if(pal){
            System.out.println(word+" is a palindrome");
        }else{
            System.out.println(word+" is not a palindrome");
        }
    
    }
}
