package controllers;

import java.util.HashMap;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() !=str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap1 = new HashMap<>();
        HashMap<Character, Integer> charCountMap2 = new HashMap<>();

        // Contar frecuencias de caracteres en la primera cadena
        for (char c : str1.toCharArray()) {
            charCountMap1.put(c, charCountMap1.getOrDefault(c, 0) + 1);
        }

        // Contar frecuencias de caracteres en la segunda cadena
        for (char c : str2.toCharArray()) {
            charCountMap2.put(c, charCountMap2.getOrDefault(c, 0) + 1);
        }

        // Comparar los dos mapas
        return charCountMap1.equals(charCountMap2);

    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        // Recorrer el array de números
        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];

            // Verificar si el complemento ya está en el mapa
            if (numMap.containsKey(complemento)) {
                return new int[] { numMap.get(complemento), i };
            }

            // Si no, agregar el número actual al mapa con su índice
            numMap.put(nums[i], i);
        }

        // Si no se encuentra ninguna solución, retornar null
        return null;
    
    }
}
