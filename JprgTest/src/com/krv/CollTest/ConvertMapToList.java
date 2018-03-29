package com.krv.CollTest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.jooq.lambda.Seq;
import org.jooq.lambda.tuple.Tuple;
import org.jooq.lambda.tuple.Tuple2;
public class ConvertMapToList {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        System.out.println("\n1. Export Map Key to List...");
        Tuple2<List<Integer>, List<String>> result = 
            Seq.seq(map).collect(
                    Collectors.mapping(Tuple2 ::v1, Collectors.toList()),
                    Collectors.mapping(Tuple2 ::v2, Collectors.toList())
               );
        result.forEach(System  .out::println);
    }
}