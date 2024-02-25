public class Casting {
    public static void main (String [] args){
        //CONVERSIONES
        //convertimos char a int
        char c='z';
        int ic=(int) c;
        System.out.println("Caracter: "+c);
        System.out.println("Caracter "+c+" a int: "+ic);
        //convertimos entero a long
        int i=250;
        long li=(long) i;
        System.out.println("Entero: "+i);
        System.out.println("Entero "+i+" a long: "+li);
        //convertimos long a short
        short sli=(short) li;
        System.out.println("Long: "+li);
        System.out.println("Long "+li+" a short: "+sli);
        //convertimos double a long
        double d=301.301;
        long ld=(long) d;
        System.out.println("Double: "+d);
        System.out.println("Double "+d+" a long: "+ld);
        //convertimos entero a float
        int i2=100;
        float suma=(float)(i2+500.66);
        System.out.println("Entero: "+i2);
        System.out.println("Entero + 500.66 a float: "+suma);
        //convertimos entero a byte
        int i3=737;
        int multiplica=i3*100;
        byte multi=(byte) multiplica;
        System.out.println("Entero: "+i3);
        System.out.println("Entero "+i3+" multiplicado por 100 a byte: "+multi);
        //convertimos double a long
        double d2=238.238;
        double div=d2/25;
        long ld2=(long) div;
        System.out.println("Double: "+d2);
        System.out.println("Double "+d2+" dividido entre 25 a long: "+ld2);
    }
}
