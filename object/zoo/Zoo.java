package object.zoo;

import object.employe.Employe;
import object.plot.Enclos;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private Employe employe;
    private int nbMaxEnclosure;
    private ArrayList<Enclos> enclos;

    public Zoo(String name, Employe employe, int nbMaxEnclosure, ArrayList<Enclos> enclos) {
        this.name = name;
        this.employe = employe;
        this.nbMaxEnclosure = nbMaxEnclosure;
        this.enclos = enclos;
    }

    public void printNbAnimals(){}
    public void printAnimals(){}
}
