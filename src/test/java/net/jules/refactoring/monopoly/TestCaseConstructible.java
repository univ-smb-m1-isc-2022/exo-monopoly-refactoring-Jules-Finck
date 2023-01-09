package net.jules.refactoring.monopoly;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestCaseConstructible {
    @Mock
    Quartier quartier;

    @Mock
    Joueur joueur;

    @Test
    public void testProprietaire(){
        CaseConstructible caseConstructible = new CaseConstructible("Boulevard de Bellevile", 20, 2,quartier);
        assertThat(caseConstructible.hasProprietaire()).isFalse();
        assertThat(caseConstructible.getProprietaire()).isNull();
        caseConstructible.setProprietaire(joueur);
        assertThat(caseConstructible.hasProprietaire()).isTrue();
        assertThat(caseConstructible.getProprietaire()).isEqualTo(joueur);
    }

    @Test
    public void testCouleur(){
        when(quartier.getCouleur()).thenReturn("r");
        when(quartier.getSize()).thenReturn(3);
        CaseConstructible caseConstructible = new CaseConstructible("Boulevard de Bellevile", 20, 2,quartier);
        assertThat(caseConstructible.getCouleur()).isEqualTo("r");
        assertThat(caseConstructible.nombreProprieteDeLaCouleur()).isEqualTo(3);

    }
}
