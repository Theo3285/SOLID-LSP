import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ReplacerShould {


    //le résultat d'une requette est un tableau de valeur
    //Je veux pouvoir parcourir les résultat de mon tableau
    // et remplacer les valeurs d'un attributs par d'autre caractère
    //simple quote par double quote ou crochet, format de date par un autre
    //un espace par son unicode, etc
    @Test
    public void replaceTWithN() {
        String result = Replacer
                .aParser()
                .with("t")
                .replaces('t')
                .by('n');
        Assert.assertThat(result, is("n"));
    }

    @Test
    public void replaceTTWithNN() {
        String result = Replacer
                .aParser()
                .with("tt")
                .replaces('t')
                .by('n');
        Assert.assertThat(result, is("nn"));
    }

    @Test
    public void replaceTfromTotoByN() {
        String result = Replacer
                .aParser()
                .with("toto")
                .replaces('t')
                .by('n');
        Assert.assertThat(result, is("nono"));
    }

    @Test
    public void replaceOfromTotoByU() {
        String result = Replacer
                .aParser()
                .with("toto")
                .replaces('o')
                .by('u');
        Assert.assertThat(result, is("tutu"));
    }

    @Test
    public void replaceSpacefromAWordWithWordWrap() {
        String result = Replacer
                .aParser()
                .with("toto tutu")
                .replaces(' ')
                .by('\n');
        Assert.assertThat(result, is("toto\ntutu"));
    }
}
