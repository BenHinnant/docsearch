import static org.junit.Assert.*;

import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DocSearchTest {
    @Test
    public void testhandleURL() {
        String directory = "technical/";
        String strurl = "https://docs.oracle.com";
        URI url = new URI(strurl);
        Handler h = new Handler(directory);
        assertEquals("Don't know how to handle that path!", h.handleRequest(url));
    }
}
