package net.jules.refactoring.monopoly;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPlateau {
    static Plateau plateau;

    @BeforeAll
    static public void init(){
        plateau = new Plateau();
    }

    @Test
    public void testCaseSuivante(){
        Case c = plateau.depart;
        for (int i = 0; i < 31; i++) {
            c = c.retourneCaseSuivante();
        }
        assertThat(c).isEqualTo(plateau.depart);
    }

    @Test
    public void testCaseAchetable(){
        assertThat(plateau.getCaseAchetable().size()).isEqualTo(26);
    }
}
