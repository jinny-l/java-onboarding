package onboarding.problem1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PageNumberCalculatorTest {

    @DisplayName("")
    @Test
    void maxTest() {
        PageNumberCalculator pageNumberCalculator = new PageNumberCalculator();
        int result = pageNumberCalculator.getMaxOfPageNumbers(List.of(11, 12));
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}
