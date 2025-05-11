package src;

public enum Direction{
    N('W','E'),
    S('E','W'),
    W('S','N'),
    E('N','S');

    final char left;
    final char right;

    Direction(char left, char right){
        this.left = left;
        this.right = right;
    }

    public char turnLeft() {
        return this.left;
    }

    public char turnRight(){
        return this.right;
    }
};
