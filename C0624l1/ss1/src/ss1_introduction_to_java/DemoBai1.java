package ss1_introduction_to_java;

import java.util.Scanner;

public class DemoBai1 {
    //class body
    //phương thức main ( psvm + tab || main + tab )
    public static void main(String[] args) {
//        System.out.println();//(sout + tab) == console.log()


        //tương tác với người dùng bằng nn javascript
//        let name = +prompt("nhâp tên của ban vào đây :");
//        console.log(name);

        //tương tác với người dùng bằng ngôn ngữ java
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập tên của bạn vào đây : ");
//        String name = sc.nextLine();
//        System.out.println(name);


        // ==:đối với nguyên thủy thì so sánh giá trị .
        // ==:đối với đối tượng thì so sánh về địa chỉ ô nhớ .


        //VD:
//        int num1=5;
//        int num2=5;
//        System.out.println(num1 == num2);

        String str1="Hello";
        String str2="World";
        System.out.println(str1.equals(str2));
    }
}