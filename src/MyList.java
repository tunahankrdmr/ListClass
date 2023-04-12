public class MyList <T>{
    private int capacity=10;
    private T[] list;

    public MyList(int capacity) {
        this.capacity = capacity;
        this.list= (T[]) new Object[capacity];
    }

    public  MyList(){
        this(10);
    }

    public int size(){
        int count=0;
        for (int i=0; i< list.length; i++){
            if (!(list[i] ==null)){
                count++;
            }
        }
        return count;
    }

    public void add(T data){
        if (size()>= list.length){
            this.setCapacity(this.capacity*2);
            T[] arr= (T[]) new Object[capacity];
            for (int i=0; i< list.length; i++){
                arr[i]=list[i];
            }
            arr[list.length]=data;
            this.list=arr;
        }else {
            list[this.size()]=data;
        }

    }

    public T get(int index){
        return this.list[index];
    }

    public void remove(int index){
        if (index< list.length && this.get(index)!=null){
            for (int i=index; i< list.length-1; i++){
                list[i]=list[i+1];
            }
        }else {
            System.out.println("Geçersiz indis girdiniz.");
        }
    }

    public void set(int index, T data){
        if (index< list.length){
            list[index]=data;
        }else{
            System.out.println("Geçersiz indis girdiniz.");
        }
    }

    public String toString(){
        String listeleme="[ ";
        for (int i=0; i< list.length; i++){
            if (list[i]!=null){
                listeleme+=", " + list[i];
            }
        }
        listeleme+=" ]";
        String sirala=listeleme.replaceFirst(",","");
        return sirala;
    }

    public int indexOf(T data){
        for (int i=0; i< list.length; i++){
            if (data==list[i]){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        int index=-1;
        for (int i=0; i< list.length; i++){
            if (data==list[i]){
                index=i;
            }
        }
        return index;
    }

    public boolean isEmpty(){
        boolean count=true;
        for (int i=0; i< list.length; i++){
            if (list[i]!=null){
                count=false;
            }
        }
        return count;
    }

    public T[] toArray(){
        for (int i=0; i< list.length-1; i++){
            if (list[i]==null){
                list[i]=list[i+1];
            }
        }
        return list;
    }

    public MyList<T> subList(int start,int finish){
        MyList<T> liste=new MyList<>(finish-start);
        for (int i=start; i<=finish; i++){
            liste.add(list[i]);
        }
        return liste;
    }

    public boolean contains(T data){
        for (int i=0; i< list.length; i++){
            if (data==list[i]){
                return true;
            }
        }
        return false;
    }

    public void clear(){
        for (int i=0; i< list.length; i++){
            list[i]=null;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
