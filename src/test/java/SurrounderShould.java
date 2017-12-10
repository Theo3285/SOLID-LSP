import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class SurrounderShould {

    @Test
    public void surroundWithBrackets() {
        String result = Surrounder
                .aParser()
                .with("toto tutu")
                .replaces('[')
                .by(']');
        Assert.assertThat(result, is("[toto tutu]"));
    }
}
