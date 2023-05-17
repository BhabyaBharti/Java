
//Question 1

class Student{
    String name;
    int roll_no;
}
public class ASSIGNMENT5 {
    public static void main(String[] args){
        Student st=new Student();
        st.name="John";
        st.roll_no=2;
        System.out.println("Name: " + st.name);
        System.out.println("Roll no.: " + st.roll_no);
    }
}

//Question 2

class Triangle{
    int s1;
    int s2;
    int s3;
    public double getArea(){
        double s=(s1+s2+s3)/2;
        return Math.pow((s*(s-s1)*(s-s2)*(s-s3)),0.5);
    }
    public double getPerimeter(){
        return (s1+s2+s3)/2;
    }
}
public class 