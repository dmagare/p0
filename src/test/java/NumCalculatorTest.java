import org.junit.Test;

public class NumCalculatorTest {

    @Test
    public void NumTest(){
        NumCalculator plus = new NumCalculator();
       plus.add(20,30);
       int expected = 50;
       if(expected== plus.add(20,30)) {
           System.out.println("The test passed!");
       }else {
           System.out.println("test failed");
       }

    }

}
