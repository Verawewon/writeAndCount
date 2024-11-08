import java.util.Scanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class writeAndCountTest {
    @Test
    void createText() {
        Writer writer= new Writer("stop");
        assertTrue(writer.stop());
    }

    @Test
    void CountChar() {
        Count count= new Count();
        assertEquals(5, count.countCharacters("hello"));
    }

    @Test
    void CountLine() {
        Count count= new Count();
        assertEquals(1, count.countNewLines());
    }
}
