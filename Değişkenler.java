class Main {
  public static void main(String[] args) {
    //camelCase
    //Dont repeat yourself
  String derssites="https://www.kodlama.io/courses/1332369/lectures/31944217";
    
   String internetSubeButonu="İnternet Şubesine gelin";    
    double dolarDun =8.15;
    double dolarBugun=8.18;
    int vade =36;
    boolean dustuMu = false;
    System.out.println(internetSubeButonu);

    if(dolarBugun<dolarDun) {
      System.out.println("Dolar düştü resmi");
    }
    else {
       System.out.println("Dolar yükseldi resmi");
      }

    String kredi1 = "Hızlı Kredi";
    String kredi2 = "Mutlu emekli kredisi";
    String kredi3 = "Konut kredisi";
    String kredi4 = "Çifçi kredisi";

      System.out.println(kredi1);
      System.out.println(kredi2);
      System.out.println(kredi3);
      System.out.println(kredi4);

    String[] krediler = 
    {
      "Hızlı kredi","Mutlu emekli kredisi","Konut kredisi","Çiftçi kredisi"
    };
    /*Foreach döngüsü*/
    for(String kredi:krediler){
      System.out.println(kredi);
      }
  for(int i=0;i<krediler.length;i++)
    {
     System.out.println(i);
    }
       int sayi1 =10;
      int sayi2=20;
    sayi1=sayi2;
    sayi2=100;
    
    int [] sayilar1 = {1,2,3,4,5};
    int [] sayilar2 = {10,20,30,40,50};
    sayilar1=sayilar2;
    System.out.println(sayilar1[0]);
    
    String [] sehir1 = {"Ankara"};
    String [] sehir2 = {"İstanbul"};
    sehir1=sehir2;
    sehir2[0]="İzmir";
    System.out.println(sehir1);
        
    
    
    }
    
  }
