import junit.framework.Assert;
import org.junit.Test;


public class TestAssignment1 {


    @Test
    public void test(){
    Assignment1 assignment1 = new Assignment1();
    Assert.assertEquals(assignment1.customerNameAlongWithHisBankAccountNumber("dawit", "12333322"), "dawit,12333322");
    Assert.assertEquals(java.util.Optional.ofNullable(assignment1.distance(4, 1, 8, 4)), 5);
    Assert.assertTrue(assignment1.validateEmailAddress("dawit@gmail.com"));
    Assert.assertFalse(assignment1.validateEmailAddress("dawitgmail.com"));
    Assert.assertFalse(assignment1.validateEmailAddress("dawit@gmailcom"));
}
}
