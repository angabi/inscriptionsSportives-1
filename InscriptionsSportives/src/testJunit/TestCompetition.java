package testJunit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import inscriptions.Competition;
import inscriptions.Equipe;
import inscriptions.Inscriptions;
import inscriptions.Personne;

public class TestCompetition {

	Inscriptions inscr = Inscriptions.getInscriptions();

	LocalDate datecl�ture = LocalDate.of(2021, 11, 11);
	LocalDate datecl�ture2 = LocalDate.of(2019, 04, 29);
	LocalDate datecl�ture3 = LocalDate.of(2012, 12, 31);

	Competition c1 = inscr.createCompetition("Poker", datecl�ture, false);
	Competition c2 = inscr.createCompetition("Billard", datecl�ture2, true);
	
	
	Personne p1 = inscr.createPersonne("Robert","DeNiro","deniro.Robert@youtalkingtome.com");
	Equipe e1 = inscr.createEquipe("Gangs");
}
