package controllers;

import java.util.HashMap;

public class Mapa {
    public Mapa() {
        HashMap<String, Integer> mapita=new HashMap<>();
        mapita.put("Manzana", 20);
        mapita.put("Perra", 25);
        mapita.put("Mandarian", 20);
        mapita.put("Perra", 23);

        System.out.println(mapita);

        mapita.remove("Perra");
        System.out.println(mapita);

        System.out.println("Existe Mandarina ->"+mapita.containsKey("Mandarian"));
        System.out.println("Existe Perra->"+mapita.containsKey("Perra"));

        int valorManzana=mapita.get("Manzana");
        System.out.println("El valor del manzana es ->"+ valorManzana);


        System.out.println(mapita.size());
        System.out.println("Esta vacio?"+ mapita.isEmpty());

        System.out.println("\n Claves de mapa");
        for(String clave: mapita.keySet()){
            System.out.println("- "+clave);
        }

        for(Integer value: mapita.values()){
            System.out.println("- "+ value);
        }

        System.out.println(mapita);
        mapita.replaceAll((k,v)-> v*2);
        System.out.println(mapita);

        mapita.clear();
        System.out.println(mapita);
        

    }
}
