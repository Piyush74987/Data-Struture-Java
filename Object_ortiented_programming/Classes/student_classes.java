package Object_ortiented_programming.Classes;

import java.util.Arrays;

public class student_classes {
    public static void main(String[] args) {
        student s1=new student("piyush",1);
        System.out.println(s1.name+" "+ s1.roll_no+" "+s1.marks);
//        output
//        consterors is called
//        piyush 1 0
        student s2=new student("piyush",1);
        student s3=new student("piyush");
        student s4=new student(1);
        System.out.println(s2.name+" "+s2.roll_no);
        System.out.println(s3.name);
        System.out.println(s4.roll_no);
//        output
//        consterors is called
//        piyush 1
//        piyush
//        1
        student s5=new student();
        s5.name="piyush";
        s5.roll_no=3;
        s5.marks[0]=80;
        s5.marks[1]=90;
        s5.marks[2]=70;
        System.out.println(s5.roll_no+" "+s5.name);
        for(int i=0;i<=2;i++){
            System.out.println(s5.marks[i]);
        }
        //        3 piyush
//        80
//        90
//        70
        student s6=new student(s5);
        System.out.println(s6.roll_no+" "+s6.name);
        for(int i=0;i<=2;i++){
            System.out.println(s6.marks[i]);
        }
//        3 piyush
//        80
//        90
//        70
        s5.marks[2]=100;
        System.out.println(s6.roll_no+" "+s6.name);
        for(int i=0;i<=2;i++) {
            System.out.println(s6.marks[i]);
        }
        //output
//        3 piyush
//        80
//        90
//        100
        // this called shollow coping
        // this is refernce of array and doest not create new aaray

      // for deep copy
        student s7=new student(s5);
        System.out.println(s7.roll_no+" "+s7.name);
        System.out.println(Arrays.toString(s7.marks));
//        output
//        3 piyush
//                [80, 90, 100]
        s5.marks[2]=60;
        System.out.println(s7.roll_no+" "+s7.name);
        System.out.println(Arrays.toString(s7.marks));
//        3 piyush
//                [80, 90, 100]
        // ae u can see here it did not get updated


    }

}

class student{
    String name;
    int roll_no;
    int marks[];
    student(){// construter without parameters
        marks=new int[3];
        System.out.println("this is consterutour");
    }

    student(student s5){// copy conster
        marks=new int[3];
        this.name=s5.name;
        this.roll_no=s5.roll_no;
        for(int i=0;i<=2;i++) {
            System.out.println(this.marks[i]=s5.marks[i]);
        }

    }
    student(String name, int roll_no){//construter with parameters
        marks=new int[3];
        this.name=name;
        this.roll_no=roll_no;
        System.out.println("consterors is called");
    }
    student( String name){//construter with parameters
        this.name=name;
    }
    student(int roll_no){//construter with parameters
        this.roll_no=roll_no;
    }
}
