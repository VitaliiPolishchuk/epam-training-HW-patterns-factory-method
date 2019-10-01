package the.best.creators;

import the.best.CreatorFigure;
import the.best.Figure;
import the.best.figures.IFigure;

public class CreatorIFigure implements CreatorFigure {
    @Override
    public Figure createFigure() {
        return new IFigure();
    }
}
