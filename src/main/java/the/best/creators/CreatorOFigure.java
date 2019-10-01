package the.best.creators;

import the.best.CreatorFigure;
import the.best.Figure;
import the.best.figures.OFigure;

public class CreatorOFigure implements CreatorFigure {
    @Override
    public Figure createFigure() {
        return new OFigure();
    }
}
