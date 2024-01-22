package fr.geiffel.ex1;

public class Personne {

        private String nom;
        private String prenom;
        private Byte age;
        private String classe;
        private Integer taille;

        public Personne(String pPrenom, String pNom, byte pAge, String pClasse, int pTaille) {
            this.prenom = pPrenom;
            this.nom = pNom;
            this.age = pAge;
            this.classe = pClasse;
            this.taille = pTaille;
        }

        public String getNom(){
            return this.nom;
        }

        public String getPrenom(){
            return this.prenom;
        }

        public Byte getAge() {
            return this.age;
        }

        public String getClasse() {
            return this.classe;
        }

        public Integer getTaille() {
            return this.taille;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public void setAge(Byte age) {
            this.age = age;
        }

        public void setClasse(String classe) {
            this.classe = classe;
        }

        public void setTaille(Integer taille) {
            this.taille = taille;
        }

}
