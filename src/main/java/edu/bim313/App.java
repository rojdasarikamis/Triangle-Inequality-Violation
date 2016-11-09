package edu.bim313;

import org.paukov.combinatorics3.Generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) throws IOException {

        ExcelExplorer explorer = new ExcelExplorer();

        explorer.readExcelFileToGetCities("turkish_network.xls");
        explorer.readExcelFileToGetDistances("turkish_network.xls");

        List<Integer> cityCounter = new ArrayList<>();

        for(int i = 0; i < 81; i++)
        {
            cityCounter.add(i);
        }

        List<Triangle> triangles = new ArrayList<>();
        List<Triangle> incorrectTriangles = new ArrayList<>();


        Generator.combination(cityCounter).simple(3).forEach(x -> {

                int a = explorer.distance[x.get(0)][x.get(1)];
                int b = explorer.distance[x.get(1)][x.get(2)];
                int c = explorer.distance[x.get(0)][x.get(2)];

                String aCity = explorer.cities[x.get(0)];
                String bCity = explorer.cities[x.get(1)];
                String cCity = explorer.cities[x.get(2)];

                Triangle t = new Triangle(a ,b ,c, aCity, bCity, cCity);

                triangles.add(t);

                System.out.println(t.toString());
        });

        for(Triangle t : triangles)
        {
            if(!t.isCorrect())
                incorrectTriangles.add(t);
        }

        System.out.println(triangles.size()); // number of all Triangles

        System.out.println(incorrectTriangles.size()); // number of Triangles that violate the triangle inequality
    }
}
