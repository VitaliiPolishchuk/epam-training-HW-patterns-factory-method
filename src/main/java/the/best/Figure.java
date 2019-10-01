package the.best;

import java.util.Arrays;

public class Figure {
    boolean[][] shape;

    public Figure(boolean[][] shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        StringBuilder resB = new StringBuilder();
        for(int i = 0; i < shape.length; ++i){
            for(int j = 0; j < shape[i].length; ++j){
                resB.append(shape[i][j] ? "+" : " ");
            }
            resB.append("\n");
        }

        return resB.toString();
    }
}
