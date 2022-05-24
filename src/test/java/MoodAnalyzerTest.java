import com.blz.MoodAnalyzer;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import junit.framework.Assert;
public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer;

    @Test
    public void givenSad_shouldReturnSad() {
        moodAnalyzer = new MoodAnalyzer("SAD");
        String result = moodAnalyzer.analyseMood();
        assertEquals("SAD", result);

    }

    @Test
    public void givenAny_shouldReturnHappy() {
        moodAnalyzer = new MoodAnalyzer("any");
        String result = moodAnalyzer.analyseMood();
        assertEquals("HAPPY", result);

    }

    @Test
    public void givenNull_shouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String result = null;
        try {
            result = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", result);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}