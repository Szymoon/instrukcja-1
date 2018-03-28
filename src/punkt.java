public class punkt { //klasa punktu materialnego

    private int m; //masa - parametr obiektu klasy punkt


    public punkt() { //konstruktor domyślny
        m = 24;

    }
    public punkt(int m) {  //konstruktor z parametrem
        this.m = m;

    }


    public int getMass() { //akcesor parametru masa
        return m;

    }
    public void setMass(int m) { //modyfikator parametru masa
        this.m = m;

    }
    public void opis() {
        System.out.println("Punkt materialny");

    }
    public int inertiaMoment(){ //główny moment bezwladności
        int I=m*0*0;            //zwraca typ int
        return I;

    }
    public int steiner(int d){  //moment bezwładności z tw. Steinera z parametrem d
        int Is=(m*0*0)+(m*d*d); //gdzie d to odległość między osiami
        return Is;              //zwraca typ int
    }
}