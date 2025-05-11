import src.MarsRover;

public class Main {

    public static void main(String[] args) {
        final char[] instructions = {'M', 'M', 'R', 'M', 'M', 'R', 'M', 'R', 'R', 'M'};

        MarsRover marsRover = new MarsRover(3, 3, 'E', instructions);

        for (char instruction : instructions) {
            if (instruction == 'M') {
                marsRover.updateCoordinates();

            } else {
                marsRover.updateRoverHead(instruction);
            }

        }

        System.out.println(marsRover.getRoverXCord());
        System.out.println(marsRover.getRoverYCord());
        System.out.println(marsRover.getRoverHead());
    }

}
