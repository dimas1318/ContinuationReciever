import java.io.File;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {
        new Deserializer().work();
    }

//    public static void main(String[] args) {
//
//        KryoContext kryoContext = DefaultKryoContext.newKryoContextFactory(kryo -> {
//            kryo.register(Object[].class);
//            kryo.register(Class.class);
//            kryo.register(SerializedLambda.class);
//            kryo.register(ClosureSerializer.Closure.class, new ClosureSerializer());
////            kryo.register(Main.class);
//            kryo.register(Continuation.class);
//            kryo.register(ContinuationScope.class);
//            kryo.setInstantiatorStrategy(new StdInstantiatorStrategy());
//        });
//
////        File file = new File("/home/dmitry/Desktop/TEST_CONT_SERIALIZE");
////        byte[] bytes = readContentIntoByteArray(file);
//
//        Continuation copy = (Continuation) kryoContext.deserialze(Continuation.class, null);
//        copy.run();
//    }

    private static byte[] readContentIntoByteArray(File file) {
        FileInputStream fileInputStream = null;
        byte[] bFile = new byte[(int) file.length()];
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();
            for (int i = 0; i < bFile.length; i++) {
                System.out.print((char) bFile[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bFile;
    }
}
