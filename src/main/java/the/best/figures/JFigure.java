package the.best.figures;

import the.best.Figure;

public class JFigure extends Figure {
    private static boolean[][] Jshape = {
            {false, true},
            {false, true},
            {true, true}
    };

    public JFigure() {
        super(Jshape);
    }
}
