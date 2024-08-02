package exceptions;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExceptionTest {

    @Test
    public void methodTest() throws FileNotFoundException {
        ExceptionConcept exceptieConcept = new ExceptionConcept();
         exceptieConcept.checkedExceptionExample();
        //exceptieConcept.uncheckedExceptionExample();
        //exceptieConcept.throwExceptionExample(20);
        //exceptieConcept.throwExceptionExample(15);
       // exceptieConcept.throwsExceptionExample();
    }
}