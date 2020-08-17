import java.io.File;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        File file=new File("C:\\test\\test1.csv\\20888112769372170156_20200722_业务明细.csv");
        System.out.println(file.getName());
System.out.println(Charset.defaultCharset());
    }

}

class Father{
    public Father(String str){

    }
}
 class Son extends  Father{
    public Son(){
        super("");
    }
 }