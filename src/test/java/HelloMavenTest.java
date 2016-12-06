package org.apache.maven.hellomaven;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloMavenTest    
{    
    @Test
    public void testSayHello()     
    {    
        HelloMaven hellomaven = new HelloMaven();    
        String result = hellomaven.sayHello();    
    	assertEquals("Hello Maven", result );     
    }    
}
