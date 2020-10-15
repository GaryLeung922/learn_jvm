package com.xiaojiaqi.c4;

/**
 * @Author: liangjiaqi
 * @Date: 2020/5/28 8:27 AM
 */
public class JHSDB_TestCase {
    static class Test{
        static ObjectHolder staticObj = new ObjectHolder();
        static ObjectHolder staticObj2 = staticObj;
        ObjectHolder instanceObj = new ObjectHolder();

        void foo(){
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }
    }

    private static class ObjectHolder{
        private int a = 5;
        public boolean b = true;
        protected String c = "111";
        long d = 12345676543245643L;
        public void oo(){}
    }

    public static void main(String[] args) throws InterruptedException {
        Test test = new JHSDB_TestCase.Test();
        test.foo();
        while (true){
            Thread.sleep(10);
        }
    }
}
