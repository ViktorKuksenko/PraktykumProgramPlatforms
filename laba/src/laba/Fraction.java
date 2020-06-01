package laba;

public class Fraction {
    public int chis;
    public int znam;

    public Fraction(int ch , int zn) {
        chis = ch;
        znam = zn;

    }
    public Fraction add(Fraction f) {
        int resChis, resZnam;
        int domnoz = toCommonZnam(this.znam, f.znam) / znam;
        int domnoz1 = toCommonZnam(this.znam, f.znam) / f.znam;
        resZnam = toCommonZnam(this.znam , f.znam);
        resChis = (this.chis * domnoz) + (f.chis * domnoz1);

        return new Fraction(resChis,resZnam);
    }
    public Fraction sub(Fraction f){
        int resChis, resZnam;
        int domnoz = toCommonZnam(this.znam, f.znam) / znam;
        int domnoz1 = toCommonZnam(this.znam, f.znam) / f.znam;
        resZnam = toCommonZnam(this.znam , f.znam);
        resChis = (this.chis * domnoz) - (f.chis * domnoz1);

        return new Fraction(resChis, resZnam);
    }
    public Fraction mult(Fraction f){
        int resChis, resZnam;

        resZnam = this.znam * f.znam;
        resChis = (this.chis * f.chis);

        return new Fraction(resChis, resZnam);
    }
    public Fraction div(Fraction f){
        int resChis, resZnam;

         resZnam = this.znam * f.chis;
         resChis = this.chis * f.znam;

        return new Fraction(resChis, resZnam);
    }


    private int toCommonZnam(int arr , int arr2) {
        int znNew = arr;
        int znNew2 = arr2;

        int i = 1;
        while (true){
            i++;
            if(i % znNew == 0 && i % znNew2 == 0) {
               break;
            }
        }
        return i;
    }

    @Override
    public boolean equals(Object f){
        return equals(f);
    }

    @Override
    public String toString(){
        return this.chis + "/" + this.znam;
    }



}
