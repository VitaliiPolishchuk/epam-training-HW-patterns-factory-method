package the.best;

import the.best.creators.CreatorIFigure;
import the.best.creators.CreatorJFigure;
import the.best.creators.CreatorOFigure;
import the.best.creators.CreatorTFigure;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    static List<CreatorFigure> creators;
    static Random random;
    public static void main(String[] args) {
        creators = Arrays.asList(new CreatorIFigure(), new CreatorJFigure(), new CreatorOFigure(), new CreatorTFigure());
        random = new Random();
        CreatorFigure creatorFigure = getRandomCreatorFigure();
        for(int i = 0; i < 15; ++i){
            System.out.println(creatorFigure.createFigure());
            creatorFigure = getRandomCreatorFigure();
        }

    }

    private static CreatorFigure getRandomCreatorFigure(){
        return creators.get(random.nextInt(creators.size()));
    }
}
