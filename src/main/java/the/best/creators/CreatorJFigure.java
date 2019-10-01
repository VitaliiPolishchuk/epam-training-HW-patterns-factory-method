package the.best.creators;

import the.best.CreatorFigure;
import the.best.Figure;
import the.best.figures.JFigure;

public class CreatorJFigure implements CreatorFigure {
    @Override
    public Figure createFigure() {
        return new JFigure();
    }
}
