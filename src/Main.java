public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList=new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + myList.size());
        System.out.println("Dizinin Kapasitesi : " + myList.getCapacity());
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + myList.size());
        System.out.println("Dizinin Kapasitesi : " + myList.getCapacity());
        myList.add(50);
        myList.add(60);
        myList.add(70);
        myList.add(80);
        myList.add(90);
        myList.add(100);
        myList.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + myList.size());
        System.out.println("Dizinin Kapasitesi : " + myList.getCapacity());
        System.out.println("2. indisteki değer : " + myList.get(2));
        myList.remove(2);
        System.out.println("2. indisteki değer : " + myList.get(2));
        myList.set(0, 100);
        System.out.println("0. indisteki değer : " + myList.get(0));
        System.out.println(myList.toString());
        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + myList.indexOf(20));
        System.out.println("Indeks : " + myList.lastIndexOf(100));
        System.out.println("Liste Durumu : " + (myList.isEmpty() ? "Boş" : "Dolu"));
        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = myList.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);
        MyList<Integer> altListem = myList.subList(0, 3);
        System.out.println(altListem.toString());
        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + myList.contains(20));
        System.out.println("Listemde 120 değeri : " + myList.contains(120));
        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        myList.clear();
        System.out.println(myList.toString());
    }
}
