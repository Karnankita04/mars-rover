package src;

public class MarsRover {
    int roverXCord;
    int roverYCord;
    char roverHead;
    char[] instructions;

    public MarsRover(int roverXCord, int roverYCord, char roverHead, char[] instructions) {
        this.roverXCord = roverXCord;
        this.roverYCord = roverYCord;
        this.roverHead = roverHead;
        this.instructions = instructions;
    }

    public char getRoverHead() {
        return this.roverHead;
    }

    public int getRoverXCord() {
        return this.roverXCord;
    }

    public int getRoverYCord() {
        return this.roverYCord;
    }

    public int updateCoordinates() {
        switch (this.roverHead) {
            case 'N': {
                this.roverYCord = this.roverYCord + 1;
                return this.roverYCord;
            }
            case 'S': {
                this.roverYCord = this.roverYCord - 1;
                return this.roverYCord;
            }
            case 'W': {
                this.roverXCord = this.roverXCord - 1;
                return this.roverXCord;
            }
            case 'E': {
                this.roverXCord = this.roverXCord + 1;
                return this.roverXCord;
            }
            default:
                return 0;
        }
    }

    public char updateRoverHead(char instruction) {
        Direction d = Direction.valueOf(this.roverHead + "");
        this.roverHead = instruction == 'L' ? d.turnLeft() : d.turnRight();
        return this.roverHead;
    }
}