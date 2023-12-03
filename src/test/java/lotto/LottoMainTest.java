package lotto;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.List;
import lotto.domain.Lotto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LottoMainTest {
    @DisplayName("구매 테스트")
    @Test
    void purchaseTest() {
        List<Lotto> lottos =  Lotto.puchase(14000);
        assertThat(lottos.size()).isEqualTo(14);
    }
}
