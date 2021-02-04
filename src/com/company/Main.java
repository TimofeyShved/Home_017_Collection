package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------Collection-------");
        Collection col =new ArrayList(); //Он как массив
        col.add(2.5); //добавление эл.
        col.add("2");
        col.add("3");
        col.remove("2");//удаление
        Iterator i1 =col.iterator(); //подсчёт кол-во эл.
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("---------------");
        for (Object o : col){
            System.out.println(o);
        }

        System.out.println("--------List-------");
        List ls = new ArrayList();
        ls.add(2);//добавление эл.
        ls.add("string 2");
        ls.add("3");
        ls.add("4");
        ls.remove(2); //реагирует на индекс
        ls.set(2, "3.5");
        for (int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }

        System.out.println("--------Map-------");
        Map m1=new HashMap();
        m1.put("1", "One");
        m1.put("2", "two");
        m1.put("4", "there");
        Set s = m1.keySet(); // по ключу
        for (Object o:s){
            System.err.println(o);
        }

        System.out.println("---------------");
        System.err.println(m1.get("2"));

        System.out.println("--------Queue-------");
        Queue qu=new PriorityQueue(); //создание очереди
        qu.offer("1");
        qu.offer("2");
        qu.offer("3");
        Iterator i2=qu.iterator();
        while (i2.hasNext()){
            System.out.println(qu.poll());
        }
    }
}
