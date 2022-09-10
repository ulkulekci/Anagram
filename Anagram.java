import java.util.Locale;
import java.util.Scanner;
public class Anagram {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in); //Kullanıcıdan string değer alabilmek için Scanner sınıfı+
        System.out.print("Lütfen 1. kelimeyi giriniz: ");
        String s1 = input.nextLine(); //String değeri burda alıyoruz
        System.out.print("Lütfen 2. kelimeyi giriniz: ");
        String s2 = input.nextLine(); //String değeri burda alıyoruz
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int [] x=new int[100];
        int [] y=new int[100];
        int [] xx=new int[100];
        int [] yy=new int[100];
        xx[0]=0;
        yy[0]=0;
        int  max=0,n=0,mm=0,maxx=0,mm2=0,nn=0;
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        char [] alf={'a','b','c','ç','d','e','f','g','ğ','h','i','ı','j','k','l','m','n','o','ö','p','r','s','ş','t','u','ü','v','y','z'};
        int k=0,kk=0,i,j,s=1;
        if (s1.length()==s2.length())
        {
            for ( j=0; j< a.length; j++)   {
     for ( i=0; i<29 ;i++){
           if (alf[i]==a[j]){ //1.kelimenin harflerini karşılık geldiği sayılar
              x[k]=i;
               k++;
           }
         if (alf[i]==b[j]){ //2.kelimenin harflerini karşılık geldiği sayılar
             y[kk]=i; //harflerin sayı olarak karşılığı bir diziye atanıyor
             kk++;
         }
     }
            }//sayıları büyükten küçüğe sıralama
        for (i=0;i<a.length;i++) {
            for (j = 0; j < a.length; j++)
            {
                if(x[j]>=x[i] && x[j]>max)
                {
                    xx[n]=x[j];
                    max=x[j];
                    mm=j;
                }
                if(y[j]>=y[i] && y[j]>maxx)
                {
                    yy[n]=y[j];
                    maxx=y[j];
                    mm2=j;
                }
            }
        x[mm]=0;
            n++;
            max=0;
            y[mm2]=0;
            nn++;
            maxx=0;
        }
        /*    for(i=0;i<a.length;i++){ //sayıları sıralı görmek için
                System.out.print(" "+xx[i]);}
            System.out.println("");
            for(i=0;i<a.length;i++){
                System.out.print(" "+yy[i]);}
*/
            for(i=0;i<a.length;i++){
                if(xx[i]!=yy[i]) {
                    System.out.print("anagram degill");
                      s=0;
                    i=a.length;
                }
            }
            if(s==1)
            {System.out.print("anagram");}
        }
        else
            System.out.print("anagram degil");
 }
}
