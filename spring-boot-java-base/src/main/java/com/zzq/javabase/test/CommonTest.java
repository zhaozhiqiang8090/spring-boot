/**
 * 
 */
package com.zzq.javabase.test;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年8月8日 下午4:27:10
 */
public class CommonTest {
    
    public static class User {
        
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
    }
    public static void main(String[] args) {
        User user = new User();
        user.setName("haha");
        String hhString = (String) (user.getName());
        System.out.println(hhString);
    }
}
