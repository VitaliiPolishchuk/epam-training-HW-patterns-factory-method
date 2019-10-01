package the.best.creators;

import the.best.CreatorFigure;
import the.best.Figure;
import the.best.figures.TFigure;

public class CreatorTFigure implements CreatorFigure {
    @Override
    public Figure createFigure() {
        return new TFigure();
    }
}
