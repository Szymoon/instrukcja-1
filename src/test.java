public class  test   { //klasa służąca jako program testowy

    public static void main(String[] args)
    {
        int Ia, Isa, Ib, Isb, Ma, Mb;

        punkt A = new punkt(13); //stworzenie nowego obiektu klasy z użyciem
                                    //kontruktora z parametrem
        A.opis();
        Ma=A.getMass();             //wywołanie akcesora, brana masa=13
        Ia=A.inertiaMoment();
        Isa=A.steiner(7);
        //wyświetlanie informacji
        System.out.println("-masa= " + Ma + " [kg]");
        System.out.println("-główny moment bezwładności= " + Ia + " [kg*m^2]");
        System.out.println("-moment bezwłądności(tw. Steineraa)= " + Isa + " [kg*m^2]");
        System.out.println("");


        punkt B = new punkt(); //stworzenie nowego obiektu klasy z użyciem
                               //kontruktora domyślnego,brana masa = 24
        B.opis();
        B.setMass(9);          //zmiana masy za pomocą modyfikatora
        Mb=B.getMass();        //wywołanie akcesora
        Ib=B.inertiaMoment();
        Isb=B.steiner(8);
        //wyświetlanie informacji
        System.out.println("-masa= " + Mb + " [kg]");
        System.out.println("-główny moment bezwładności= " + Ib +" [kg*m^2]" );
        System.out.println("-moment bezwłądności(tw. Steineraa)= " + Isb + " [kg*m^2]");
        System.out.println("");


        punkt tab[] = new punkt[4]; //tablica obiektów

        for (int i=0; i<tab.length; i++ ){ //zainicjowanie za pomocą pętli
                                           //zmienna masa
            int Mx, Ix, Isx;

            tab[i] = new punkt(i);
            tab[i].opis();
            Mx=tab[i].getMass();
            Ix=tab[i].inertiaMoment();
            Isx=tab[i].steiner(3);
            //wyświetlanie informacji
            System.out.println("-masa= " + Mx + " [kg]");
            System.out.println("-główny moment bezwładności= " + Ix + " [kg*m^2]");
            System.out.println("-moment bezwłądności(tw. Steineraa)= " + Isx + " [kg*m^2]");
            System.out.println("");
        }
    }
}