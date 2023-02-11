import org.junit.jupiter.api.Test;
import org.assignment2.FormulaCalc;
import org.junit.jupiter.api.Assertions;

public class FormulaCalcTest {
    @Test
    public void test_with_H() {
        Assertions.assertEquals(1, FormulaCalc.Algorithm("H"));
    }

    @Test
    public void test_with_KBr() {
        Assertions.assertEquals(54, FormulaCalc.Algorithm("KBr"));
    }

//    The parentheses are replaced with underscores
    @Test
    public void test_with_Ca_OH_2() {
        Assertions.assertEquals(38, FormulaCalc.Algorithm("Ca(OH)2"));
    }

    @Test
    public void test_with_H2O() {
        Assertions.assertEquals(10, FormulaCalc.Algorithm("H2O"));
    }

    @Test
    public void test_with_C6H12O6() {
        Assertions.assertEquals(96, FormulaCalc.Algorithm("C6H12O6"));
    }

    @Test
    public void test_with_Ni_NO3_2() {
        Assertions.assertEquals(90, FormulaCalc.Algorithm("Ni(NO3)2"));
    }

    @Test
    public void test_with_Co3_Fe_CN_6_2() {
        Assertions.assertEquals(90, FormulaCalc.Algorithm("Co3(Fe(CN)6)2"));
    }

}
