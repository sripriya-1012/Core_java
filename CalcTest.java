import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {
        Calc calc =new Calc();
        assertEquals(4,calc.add(2,2));
    }
}