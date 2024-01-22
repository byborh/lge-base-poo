package fr.geiffel.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex1Test {

    Ex1 classeATester = new Ex1();
    @Test
    void testPrenomPersonne1() {
        assertEquals("Peter", classeATester.prenomPersonne1());
    }

    @Test
    void testNomPersonne2() {
        assertEquals("Strange", classeATester.nomPersonne2());
    }

    @Test
    void testAgePersonne3() {
        assertEquals(20, classeATester.agePersonne3());
    }

    @Test
    void testClassePersonne4() {
        assertEquals("SIO2A", classeATester.classePersonne4());
    }

    @Test
    void testMoyenneTaillePersonnes() {
        assertEquals(177.5, classeATester.moyenneTaillePersonnes());
    }
}