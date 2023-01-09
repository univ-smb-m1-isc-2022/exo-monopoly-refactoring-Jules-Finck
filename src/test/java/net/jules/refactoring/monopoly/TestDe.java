package net.jules.refactoring.monopoly;

import net.jules.refactoring.monopoly.De;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestDe {
    @Test
    public void testLancer(){
        De de = new De();
        for (int i = 0; i < 12; i++){
            de.lancer();
            assertThat(de.getValeur()).isBetween(1,6);
        }
    }
}
