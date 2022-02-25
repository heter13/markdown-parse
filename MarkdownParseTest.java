import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class MarkdownParseTest {
    // Setting up a new test case
    @Test
    public void addition() {
        // Asserting that the left of the comma is equal to the right
        assertEquals(2, 1 + 1);
    }
    @Test
    public void test1() throws IOException{
        Path fileName = Path.of("test-file.md");
        System.out.println(fileName.toString());
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);   
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
    @Test
    public void test2() throws IOException{
        Path fileName = Path.of("snippet1.md");
        System.out.println(fileName.toString());
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);   
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("url.com");
        expected.add("google.com");
        expected.add("google.com");
        expected.add("ucsd.edu");
        assertEquals(expected, links);
    }
    @Test
    public void test3() throws IOException{
        Path fileName = Path.of("snippet2.md");
        System.out.println(fileName.toString());
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);   
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a.com");
        expected.add("b.com");
        expected.add("example.com");
        assertEquals(expected, links);
    }
    @Test
    public void test4() throws IOException{
        Path fileName = Path.of("snippet3.md");
        System.out.println(fileName.toString());
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);   
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://www.twitter.com");
        expected.add("https://ucsd-cse15l-w22.github.io/");
        expected.add("https://cse.ucsd.edu/");
        assertEquals(expected, links);
    }
}