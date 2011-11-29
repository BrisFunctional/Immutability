public class BeanDemo {

    public static void main(String... args) throws InterruptedException {

        final MutableBean bean = new MutableBean(3, 4);

        MutableBean bean2 = SomeClass.doSomething(bean);

//        Thread.sleep(1000);

        System.out.println( bean2.getX() + "," + bean2.getY() );
        
    }

}
