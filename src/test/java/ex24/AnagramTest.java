package ex24;

import ex24.Anagram;
import junit.framework.TestCase;


public class AnagramTest extends TestCase {

    public void testIsAnagram() {

        assertTrue(Anagram.isAnagram("plam", "mapl"));

    }
}