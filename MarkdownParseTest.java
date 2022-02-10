import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {

    @Test //indicates the following method is a junit test
    public void addition() { //method header
        assertEquals(2, 1 + 1); //checking whether the first and second params are equal, fail test if not
    }

    @Test 
    public void testGetLinks1() throws IOException{
        String contents = Files.readString(Path.of("./test-file.md"));
        List<String> expected = List.of("https://something.com","some-page.html");
        assertEquals(expected,MarkdownParse.getLinks(contents));
    }

    @Test 
    public void testBreak1File() throws IOException{
        String contents = Files.readString(Path.of("./break-file.md"));
        List<String> expected = List.of("https://something.com","some-page.html");
        assertEquals(expected,MarkdownParse.getLinks(contents));
    }

    @Test 
    public void testBreak2File() throws IOException{
        String contents = Files.readString(Path.of("./break2-file.md"));
        List<String> expected = List.of();
        assertEquals(expected,MarkdownParse.getLinks(contents));
    }

    @Test 
    public void testBreak3File() throws IOException{
        String contents = Files.readString(Path.of("./break3-file.md"));
        List<String> expected = List.of();
        assertEquals(expected,MarkdownParse.getLinks(contents));
    }



    //-------------------------------------------------------------------------------
    @Test 
    public void testGetLinks2() throws IOException{
        String contents = Files.readString(Path.of("./test-file2.md"));
        List<String> expected = List.of("https://something.com","some-page.html");
        assertEquals(expected,MarkdownParse.getLinks(contents));
    }

    @Test 
    public void testGetLinks3() throws IOException{
        String contents = Files.readString(Path.of("./test-file3.md"));
        List<String> expected = List.of();
        assertEquals(expected,MarkdownParse.getLinks(contents));
    }

    @Test 
    public void testGetLinks4() throws IOException{
        String contents = Files.readString(Path.of("./test-file4.md"));
        List<String> expected = List.of();
        assertEquals(expected,MarkdownParse.getLinks(contents));
    }

    @Test 
    public void testGetLinks5() throws IOException{
        String contents = Files.readString(Path.of("./test-file5.md"));
        List<String> expected = List.of();
        assertEquals(expected,MarkdownParse.getLinks(contents));
    }

    @Test 
    public void testGetLinks6() throws IOException{
        String contents = Files.readString(Path.of("./test-file6.md"));
        List<String> expected = List.of();
        assertEquals(expected,MarkdownParse.getLinks(contents));
    }

    @Test 
    public void testGetLinks7() throws IOException{
        String contents = Files.readString(Path.of("./test-file7.md"));
        List<String> expected = List.of();
        assertEquals(expected,MarkdownParse.getLinks(contents));
    }

    // @Test 
    // public void testGetLinks8() throws IOException{
    //     String contents = Files.readString(Path.of("C:/Users/jonat/git/markdown-parse/test-file8.md"));
    //     List<String> expected = List.of();
    //     assertEquals(expected,MarkdownParse.getLinks(contents));
    // }

    
}
