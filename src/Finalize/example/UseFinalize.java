package Finalize.example;

public class UseFinalize {

    public static void main(String[] args) {
        String str=new String("House");
        System.out.println(str);
        UseFinalize uf=new UseFinalize();
        uf.finalize();
        System.gc();
        System.out.println("end Of main method");
        System.gc();

    }
@Override
    public void finalize(){
        System.out.println("finalize method hase been called");
    }

}
