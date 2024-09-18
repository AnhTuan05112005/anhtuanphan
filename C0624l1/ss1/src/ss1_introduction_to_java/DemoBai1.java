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
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn : ");
        String name=sc.nextLine();
        System.out.println(name);
    }
}