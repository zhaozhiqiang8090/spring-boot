package com.zzq.basic.java.innerclass;

public interface InnerClassTest {

    public static class InnerClass {
        
        private String name;
        
        private static String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getAge() {
            return age;
        }

        public static void setAge(String age) {
            InnerClass.age = age;
        }
        
    }
}
