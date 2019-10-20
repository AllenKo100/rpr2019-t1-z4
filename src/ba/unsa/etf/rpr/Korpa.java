package ba.unsa.etf.rpr;

public class Korpa {
    public final int max=50;
    private static int brElemenata=0;
    private Artikl[] niz=null;

    public Korpa(){
        niz=new Artikl[max];
        brElemenata=0;
    }
    public boolean dodajArtikl(Artikl artikal){
        if(brElemenata>max-1) return false;
        this.niz[brElemenata]=new Artikl(artikal.getNaziv(), artikal.getCijena(), artikal.getKod());
        brElemenata++;
        return true;
    }
    public int getBrojElemenata(){ return this.brElemenata; }
    public Artikl[] getArtikli(){
        return this.niz;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbacen=null;
        for(int i=0; i<this.brElemenata; i++){
            if(this.niz[i].getKod().equals(kod)){
                izbacen=this.niz[i];
                this.niz[i]=null;
                for(int j=i; j<brElemenata-1; j++){
                    this.niz[j]=this.niz[j+1];
                }
                this.brElemenata--;
                this.niz[brElemenata]=null;
                break;
            }
        }
        return izbacen;
    }
    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0; i<brElemenata; i++){
            suma=suma+this.niz[i].getCijena();
        }
        return suma;
    }
}
