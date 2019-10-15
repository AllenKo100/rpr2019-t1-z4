package ba.unsa.etf.rpr;

public class Supermarket {
    public final int max=1000;
    private static int brElemenata=0;
    private Artikl[] niz=null;

    public Supermarket(){
        niz=new Artikl[max];
    }
    public boolean dodajArtikl(Artikl temp){
        if(brElemenata>max-1) return false;
        this.niz[brElemenata]=new Artikl(temp.getNaziv(), temp.getCijena(), temp.getKod());
        brElemenata++;
        return true;
    }
    public Artikl[] getArtikli(){
        return this.niz;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbacen=null;
        for(int i=0; i<this.brElemenata; i++){
            if(this.niz[i].getKod().equals(kod)){
                izbacen=this.niz[i];
                for(int j=i; j<this.brElemenata-1; j++){
                    this.niz[j]=this.niz[j+1];
                }
                this.brElemenata--;
                this.niz[brElemenata]=null;
                break;
            }
        }
        return izbacen;
    }
}
