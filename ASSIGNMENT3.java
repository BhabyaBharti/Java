public class ASSIGNMENT3 {
    public static void main(String[] args){

        // Question 1

        int x=2345;
        System.out.println((((x+8)/3)%5)*5);

        //Question 2

        int n1=5;
        int n2=10;
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println(n1 + " " + n2);

        //Question 3

        int m=132;

        int sum=0;
        while(m>0){
            int t=m%10;
            sum+=t;
            m/=10;
        }
        System.out.println(sum);

        //Question 4

        int a=55;
        int b=70;

        if(a<50 && a<b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        if(a<50 || a<b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
