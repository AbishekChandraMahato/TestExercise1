import org.junit.Assert;

import static org.junit.Assert.*;

public class TestPerson {
    int age;
    Person person1=new Person();

    @org.junit.Test
    public void isTeenagerGreaterThan10InBoundary() {
        age=15;
        boolean result=person1.isTeenager(age);
        Assert.assertEquals(result,true);


    }
    @org.junit.Test
    public void isTeenagerLessThan10OutOfBoundary() {
        age=5;
        boolean result=person1.isTeenager(age);
        Assert.assertEquals(result,false);


    }
    @org.junit.Test
    public void isTeenagerGreaterThan10OutOfBoundary() {
        age=23;
        boolean result=person1.isTeenager(age);
        Assert.assertEquals(result,false);


    }

    @org.junit.Test
    public void isTeenagerGreaterThan20OutOfBoundary() {
        age=45;
        boolean result=person1.isTeenager(age);
        Assert.assertEquals(result,false);


    }

    @org.junit.Test
    public void isTeenagerLessThan20InBoundary() {
        age=18;
        boolean result=person1.isTeenager(age);
        Assert.assertEquals(result,true);


    }

}