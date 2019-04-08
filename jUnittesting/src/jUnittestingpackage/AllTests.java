package jUnittestingpackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({testaddtwonumbers.class,testaddtwostrings.class})
public class AllTests {

}
