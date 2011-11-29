public class SomeClass {

    public static MutableBean doSomething( MutableBean bean ){

        return new MutableBean( bean.getX()*2, bean.getY()*2 );

    }

}
