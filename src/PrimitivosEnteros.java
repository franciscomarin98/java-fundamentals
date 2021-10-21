public class PrimitivosEnteros {
    public static void main(String[] args){
//      Tipos de datos primitivos en Java
//        boolean  ->  1bit
//        byte     ->  8bits
//        char     ->  16bits
//        double   ->  64bits
//        float    ->  32bits
//        int      ->  32bits
//        long     ->  64bits
//        short    ->  16bits

        byte variableByte = 7;
        System.out.println("variableByte: "+ variableByte);
        System.out.println("tipo byte corresponde en byte a: "+Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a: "+Byte.SIZE);
        System.out.println("el valor máximo de un byte es: "+Byte.MAX_VALUE);
        System.out.println("el valor mínimo de un byte es: "+Byte.MIN_VALUE);

        System.out.println();

        short variableShort = 1000;
        System.out.println("variableShort: "+ variableShort);
        System.out.println("tipo short corresponde en byte a: "+Short.BYTES);
        System.out.println("tipo short corresponde en bites a: "+Short.SIZE);
        System.out.println("el valor máximo de un short es: "+Short.MAX_VALUE);
        System.out.println("el valor mínimo de un short es: "+Short.MIN_VALUE);

        System.out.println();

        int variableInt = 200000;
        System.out.println("variableInt: "+ variableInt);
        System.out.println("tipo int corresponde en byte a: "+Integer.BYTES);
        System.out.println("tipo int corresponde en bites a: "+Integer.SIZE);
        System.out.println("el valor máximo de un int es: "+Integer.MAX_VALUE);
        System.out.println("el valor mínimo de un int es: "+Integer.MIN_VALUE);

        System.out.println();

        long variableLong = 200234234L; //Por convención para diferenciarla de un tipo entero, al final del número se le debe de agregar la letra L = Long
        System.out.println("variableLong: "+ variableLong);
        System.out.println("tipo long corresponde en byte a: "+ Long.BYTES);
        System.out.println("tipo long corresponde en bites a: "+Long.SIZE);
        System.out.println("el valor máximo de un long es: "+Long.MAX_VALUE);
        System.out.println("el valor mínimo de un long es: "+Long.MIN_VALUE);

        var variableVAR = 100000;  //Este tipo de dato "var" es una nueva característica que nos permite crear variables dinámicas de cualquier tipo

    }
}
