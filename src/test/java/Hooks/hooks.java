package Hooks;

import org.Base.Base_Class;
import org.junit.After;
import org.junit.Before;

public class hooks extends Base_Class {

    @Before
    public void setup() {
        initializeDriver();
    }
    @After
    public void cleanup() {
        tearDown();
    }
}
