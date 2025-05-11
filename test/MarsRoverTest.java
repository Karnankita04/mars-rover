package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.MarsRover;
import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    MarsRover marsRover;
    @BeforeEach
    void setup() {
        final int[] marsCord = {5,5};
        final int roverXCord = 3;
        final int roverYCord = 3;
        final char roverHead = 'E';
        final char[] instruction = {'L','R'};
         marsRover = new MarsRover(roverXCord, roverYCord, roverHead, instruction);
    }

    @Test
    void getRoverHead(){
        assertEquals('E',marsRover.getRoverHead());
    }

    @Test
    void getUpdatedRoverHead(){
        assertEquals('N',marsRover.updateRoverHead('L'));
        MarsRover marsRover = new MarsRover(3, 3, 'S', new char[]{'L', 'R'});
        assertEquals('W',marsRover.updateRoverHead('R'));
    }
}