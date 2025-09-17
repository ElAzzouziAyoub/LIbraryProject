public class Main {
    public static void main(String[] args) {
        // ========================
        // 📚 Création des livres
        // ========================
        Book designPatterns = new Book(1, 2, "Design Patterns", "Gang of Four");
        Book cleanCode = new Book(2, 1, "Clean Code", "Robert C. Martin");
        Book effectiveJava = new Book(3, 3, "Effective Java", "Joshua Bloch");
        Book aiBook = new Book(4, 5, "Artificial Intelligence", "Stuart Russell");

        // ========================
        // 👤 Création des utilisateurs
        // ========================
        Student ayoub = new Student(1, "Ayoub", "EL AZZOUZI", 20, "Student", 1);
        Student mouad = new Student(2, "Mouad", "CHAHTI", 21, "Student", 1);
        Professor iraqi = new Professor(1, "Driss", "IRAQI", 60, "Professor", 1);
        Professor benali = new Professor(2, "Yassine", "BENALI", 45, "Professor", 2);

        // ========================
        // ✅ Scénario 1 : Emprunts simples
        // ========================
        System.out.println("\n--- Scénario 1 : Emprunts simples ---");
        Loan.loan(ayoub, designPatterns);
        Loan.loan(mouad, cleanCode);
        Loan.loan(iraqi, effectiveJava);

        afficherEmprunts(ayoub, mouad, iraqi, benali);

        // ========================
        // ✅ Scénario 2 : Retour et réemprunt
        // ========================
        System.out.println("\n--- Scénario 2 : Retour et réemprunt ---");
        Loan.returnBook(ayoub, designPatterns);
        Loan.loan(benali, designPatterns);

        afficherEmprunts(ayoub, mouad, iraqi, benali);

        // ========================
        // ✅ Scénario 3 : Emprunts multiples
        // ========================
        System.out.println("\n--- Scénario 3 : Emprunts multiples ---");
        Loan.loan(mouad, aiBook);
        Loan.loan(mouad, cleanCode); // devrait échouer si déjà emprunté

        afficherEmprunts(ayoub, mouad, iraqi, benali);

        // ========================
        // ✅ Scénario 4 : Limite de prêts (exemple : max 2 pour étudiants)
        // ========================
        System.out.println("\n--- Scénario 4 : Limite de prêts ---");
        Loan.loan(ayoub, cleanCode);
        Loan.loan(ayoub, effectiveJava);
        Loan.loan(ayoub, aiBook); // devrait échouer si limite atteinte

        afficherEmprunts(ayoub, mouad, iraqi, benali);

        // ========================
        // ✅ Scénario 5 : Affichage final
        // ========================
        System.out.println("\n--- Scénario 5 : Liste finale des emprunts ---");
        afficherEmprunts(ayoub, mouad, iraqi, benali);
    }

    // Méthode utilitaire pour afficher les livres empruntés par chaque utilisateur
    private static void afficherEmprunts(User... utilisateurs) {
        for (User u : utilisateurs) {
            u.displayInfo();
            if (u.getLoans().isEmpty()) {
                System.out.println("Aucun emprunt");
            } else {
                for (Book b : u.getLoans()) {
                    b.displayInfo();
                }
            }
        }
    }
}
