package com.zzh;

import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketDemo {

    public static void main(String[] args) throws IOException {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(User.class)
                .addPropertyValue("name", "zzh");
        factory.registerBeanDefinition("user1",builder.getBeanDefinition());
        User user = factory.getBean("user1", User.class);
        System.out.println(user);

        RootBeanDefinition definition = new RootBeanDefinition(User.class);


    }


    public static class User{

        private String name;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
