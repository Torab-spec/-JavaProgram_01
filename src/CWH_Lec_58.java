interface SampleIf {
    void meth1();

    void meth2();
}
// Personal notes
/*
class DemoSample extends SampleIf {
//    not allowd  | can"t extend interface in a class
}
*/

/*
class DemoSample implements SampleIf {
//     allowd   | we can implement interface in a class
}
 */
/*
interface DemoSample implements SampleIf {
//     not allowd   | we can"t implement interface in a another interface
}
*/
/*
interface DemoSample extends SampleIf {
//      allowd   | we can extends interface in a another interface
}
*/

interface ChildSampleIf extends SampleIf {
    void meth3();

    void meth4();
}

class MysampleClass implements ChildSampleIf {
    public void meth1() {
        System.out.println("I am meth1");
    }

    public void meth2() {
        System.out.println("I am meth2");
    }

    public void meth3() {
        System.out.println("I am meth3");
    }

    public void meth4() {
        System.out.println("I am meth4");
    }
}


public class CWH_Lec_58 {
    public static void main(String[] args) {

        MysampleClass mysampleClass = new MysampleClass();
        mysampleClass.meth1();
        mysampleClass.meth2();
        mysampleClass.meth3();
        mysampleClass.meth4();

    }
}
