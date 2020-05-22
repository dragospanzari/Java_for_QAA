public class Intro_Java_20_Polymorphism {
    public static void main(String[] args) {
    Intro_Java_20_Poly_Plant plant1 = new Intro_Java_20_Poly_Plant();
    Intro_Java_20_Poly_Tree tree = new Intro_Java_20_Poly_Tree();

    //Intro_Java_20_Poly_Plant plant2 = plant1;
    Intro_Java_20_Poly_Plant plant2 = tree;     //polymorphism
    plant2.grow();      //cand executam metoda, nu conteaza variabila, ci tipul obiectului

    tree.shedLeaves();

    //Intro_Java_20_Poly_Plant plant3;
    // plant3.grow();       //nu va functiona pentru ca nu e initializata plant3 cu clasa new Intro....
        doGrow(tree);
    }
    public static void doGrow(Intro_Java_20_Poly_Plant plant)       //argumentul plant este de tipul clasei Plant
    {
    plant.grow();
    }
}
