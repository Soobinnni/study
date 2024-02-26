package part5.second;

public class ObjectArrayBasic {
    public static void main(String[] args) {
        ObjectArray objs = new ObjectArray();
        Book b3 = new Book("로미오와 줄리엣", 12000, "한빛", "셰익스피어");
        String str = "test";
        Integer it = new Integer(1);

        // upcasting
        objs.add(b3);
        objs.add(str);
        objs.add(it);

        for(int i=0;i<objs.getSize();i++){
            Object element = objs.get(i);
            if(element instanceof Book){
                // downcasting
                System.out.println(((Book)element).getName());
            } else{
                System.out.println(element);
            }
        }

        //downcasting
        Book book = (Book)objs.get(0);
        String strr = (String)objs.get(1);
        Integer itg = (Integer)objs.get(2);

        System.out.println(book.getName());
        System.out.println(strr);
        System.out.println(itg);

        System.out.println(objs);
    }
}
