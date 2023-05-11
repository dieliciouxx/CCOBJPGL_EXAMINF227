interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit (Bulacan bulacan);

    void visit (Cavite cavite);

    void visit (Cubao cubao);

    void visit (Pasig pasig);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}