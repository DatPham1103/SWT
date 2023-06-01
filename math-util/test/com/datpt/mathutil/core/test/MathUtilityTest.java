/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datpt.mathutil.core.test;

import com.datpt.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dat Pham
 */
public class MathUtilityTest {

    public MathUtilityTest() {
    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-1);
    }
    
    @Test
    public void testFactorialGivenRightArgument0ReturnsWell() {
        Assert.assertEquals(70, 70);
    }
    
    @Test
    public void testFactorialGivenRightArgument5ReturnsWell(){       
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        Assert.assertEquals(24, MathUtility.getFactorial(4));
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        Assert.assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void testFactorialGivenRightArgument3ReturnsWell(){
        Assert.assertEquals(6, MathUtility.getFactorial(3));
    }
    
}

//cách chơi xanh đỏ
//xanh đỏ áp dụng chung cho tất cả các test case trong project
//gom chung 1 màu cho tất cả các test case, nhẹ hơn dùng console truyền thống
//console truyền thống bên Main()

//xanh: khi tất cả các test case đều đúng

//đỏ: chỉ cần 1 đỏ, có 1 cặp expected !=actual => cút
//logic:
//hàm nếu đúng thì phải đúng với tất cả các case đã liệt
//hàm có 1 chỗ dù nhỏ nhưng ko ngon, ko ổn => hàm có bug, phải fix

