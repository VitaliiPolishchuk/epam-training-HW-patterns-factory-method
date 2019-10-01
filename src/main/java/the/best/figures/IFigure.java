package the.best.figures;

import the.best.Figure;

public class IFigure extends Figure {

    private static boolean[][] Ishape = {
            {true, true, true, true}
    };

    public IFigure() {
        super(Ishape);
    }
}
