import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SnakeTest {

    @Test
    public void sound() {
        Snake snake = new Snake();
        String result = snake.sound("a snake barks.");
        assertEquals("a snake barks." , result);
    }
}