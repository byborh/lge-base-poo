package fr.geiffel.ex1;

public class Ex1 {

    //String[] personne1 = new String[]{"Peter", "Parker", "20", "SIO1B", "180"};
    Personne personne1 = new Personne("Cristiano", "Ronaldo", (byte)38, "SIO1B", 187);
    String[] personne2 = new String[]{"Stephen", "Strange", "40", "SIO2B", "185"};
    String[] personne3 = new String[]{"Gwen", "Stacy", "20", "SIO1A", "165"};
    String[] personne4 = new String[]{"Ororo", "Munro", "30", "SIO2A", "180"};

    public String prenomPersonne1() {
        return personne1.getPrenom() ;
    }

    public String nomPersonne2() {
        return personne2[1];
    }

    public Integer agePersonne3() {
        return Integer.valueOf(personne3[2]);
    }

    public String classePersonne4() {
        return personne4[3];
    }

    public Double moyenneTaillePersonnes() {
        double sommeTailles = 0.0;
        //sommeTailles += Double.parseDouble(personne1[4]);
        sommeTailles += Double.parseDouble(personne2[4]);
        sommeTailles += Double.parseDouble(personne3[4]);
        sommeTailles += Double.parseDouble(personne4[4]);
        return sommeTailles/4;
    }

}