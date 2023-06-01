/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datpt.mathutil.main;

import com.datpt.mathutil.core.MathUtility;

/**
 *
 * @author Dat Pham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Run test case #1
        int n = 4;
        long expected = 24;
        long actual;
        actual = MathUtility.getFactorial(n);
        //so sánh
        System.out.println(n + "!|expected: " + expected + "| actual: " + actual);
        //test case #2
        System.out.println("5" + "!|expected:120 " +"| actual: " + MathUtility.getFactorial(5));
        //test case #3
        System.out.println("-1" + "!|expected:!!!! " +"| actual: ");
        MathUtility.getFactorial(-1);
    }

}
//TDD: Test Driven Development là kĩ thuật viết code có chất lượng 
//bnăgf cách vừa code và test case, test run dc thực thi đan xen
//song song, vừa viết code vừa test
// cviệc của QC và dev có phần giống nhau
//Đều phải thiết kế các test case và run để xem đúng hay sai
//Test case run với app(QC) test case để run với code /hàm/class
// QC và dev khác nhau cơ bản :
//Qc ko code ra app, nhưng có thể viết ra code tự động hoá thao tác kiểm thử app
//dev và qc đều phải thiết kế test case
//test case là bộ data gồm input, expected để đưa vào hàm/app để đo lường đúng sai
//mô phỏng tình huống dùng app của user

//test case có thể viết tự do hoặc theo template
//Tự do: để tets hàm ta cần test các case sau:
//1!=1 ; 2!=2 ; 3!=6
// đưa data và hy vọng trả về
// giang hồ luôn viết theo test case, 1 test case bao gồm nhiều info
//Test case #1(mục dích test case): check getF() method ưith n=0
//Steps/Procedure( các bước làm)
//  1.Given n=1
//  Câl getF() ưith n=1; getF(n)
//getF(1) must return 1
