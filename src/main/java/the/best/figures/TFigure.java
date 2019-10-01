package the.best.figures;

import the.best.Figure;

public class TFigure extends Figure {
    private static boolean[][] Tshape = {
            {false, true},
            {true, true, true}
    };

    public TFigure() {
        super(Tshape);
    }
}
