package org.example;


import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class UdemyStreams {
    //@Test
    public void regular() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Shubham");
        names.add("Akash");
        names.add("Rahul");
        names.add("Shub");
        names.add("Moham");
        names.add("Mohit");
        int count=0;
        for (int i=0;i<names.size();i++){
            String actual=names.get(i);
            if (actual.startsWith("M")){
                count++;
            }
        }
        System.out.println(count);

    }
    //@Test
    public void Streamfilter(){
        ArrayList<String> names=new ArrayList<>();
        names.add("Shubham");
        names.add("Akash");
        names.add("Rahul");
        names.add("Shub");
        names.add("Moham");
        names.add("Mohit");
        long c=names.stream().filter(s -> s.startsWith("M")).count();
        System.out.println(c);
        Long d= Stream.of("Shubham","Raj","Mohit","Rahul","Akash").filter(s -> s.startsWith("R")).count();
        names.stream().filter(s -> {
            s.startsWith("M");
            return true;
        }).count();
        System.out.println(d);
        names.stream().filter(s -> s.length()>6).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length()>4).limit(2).forEach(s -> System.out.println(s));



    }
    //@Test
    public void StreamMap(){
        Stream.of("Shubham","Ram","Mohit","Rahul","Akash").filter(s -> s.endsWith("m")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));


        List<String>name= Arrays.asList("Shubham","Ram","Mohit","Rahul","Akash");
        name.stream().filter(s -> s.startsWith("R")).sorted().map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");


        List<String>name1= Arrays.asList("Shubham","Ram","Mohit","Rahul","Akash");

        List<String>names=new ArrayList<>();
        names.add("Akash");
        names.add("Raj");
        names.add("Shub");
        names.add("Mohit");
        Stream<String> newStream =Stream.concat(name1.stream(),names.stream());
//        newStream.sorted().forEach(s -> System.out.println(s));
        boolean result=newStream.anyMatch(s -> s.equalsIgnoreCase("Shubham"));
        System.out.println(result);
        Assert.assertTrue(result);
    }
    @Test
    public void StreamCollect(){

        List<String>la=Stream.of("Shubham","Ram","Mohit","Rahul","Akash").filter(s -> s.endsWith("m")).map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(la.get(1));
        System.out.println("+++++++++++++");
        System.out.println(la);


        List<Integer> value=Arrays.asList(1,3,2,7,4,9,2,5,3,1,2);
//        value.stream().distinct().sorted().forEach(s-> System.out.println(s));
        List<Integer>sorted=value.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sorted);
        System.out.println(sorted.get(3));



    }
}
