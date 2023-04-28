package com.trabajopractico;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Size;
import com.mysql.cj.xdevapi.Statement;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Connection connection = null;
        List<String> lineasResultadosSQL = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "java1234");
            java.sql.Statement stmt = connection.createStatement();
            // // USO DE LA DB
            ResultSet rs = ((java.sql.Statement) stmt)
                    .executeQuery(
                            "select RONDA,EQUIPO_1,CANTIDAD_GOLES_1,CANTIDAD_GOLES_2,EQUIPO_2        from resultados");

            String selectsql = "";
            while (rs.next()) {
                // selectsql = rs.getString(2);
                selectsql = rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4)
                        + "," + rs.getString(5);
                // System.out.println(selectsql);
                lineasResultadosSQL.add(selectsql);
                selectsql = "";
            }
            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        // for (String string : lineasResultadosSQL) {
        // System.out.println(string);
        // }

        // Class.forName("com.mysql.jdbc.Driver");
        // Connection connection = null;
        // connection =
        // DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root",
        // "java1234");
        // connection =
        // DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root",
        // "java1234");
        // Statement stmt = connection.createStatement();
        // ResultSet rs = stmt.executeQuery("select * from resultados");
        // while (rs.next())
        // System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
        // rs.getString(3));
        // connection.close();

        // Equipo argentina = new Equipo("Argentina", "selecionado");
        // Equipo arabiaSaudita = new Equipo("Arabia Saudita", "selecionado");
        // Partido partido1 = new Partido(argentina, arabiaSaudita, 1, 2);
        // System.out.println(partido1.calcularResultado());

        // Partido partido2 = new Partido(argentina, arabiaSaudita, 2, 1);
        // System.out.println(partido2.calcularResultado());

        // Partido partido3 = new Partido(argentina, arabiaSaudita, 1, 3);
        // System.out.println(partido3.calcularResultado());

        // Pronostico pronostico1 = new Pronostico(partido3, argentina,
        // ResultadoEnum.GANADOR);
        // System.out.println(pronostico1.puntos());
        // -----------------Leer Prtidos--------
        Path pathResultados = Paths.get(
                "C:\\Users\\johann\\Documents\\Cursos\\curso_ava\\trabajo_pratico\\demo\\src\\main\\resources\\resultados.csv");
        List<String> lineasResultados = null;

        boolean linea1 = false;
        try {
            lineasResultados = Files.readAllLines(pathResultados);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("El archivo no existe");
            System.exit(1);
        }
        List<Partido> partidos = new ArrayList<Partido>();
        ArrayList<Integer> rondas = new ArrayList<Integer>();
        System.out.println("Cargando partidos..");
        for (String lista1 : lineasResultadosSQL) {
            if (linea1 == true) {
                linea1 = false;
            } else {
                String[] arrayEquipos = lista1.split(",");
                Equipo equipo1 = new Equipo(arrayEquipos[1], "selecionado");
                Equipo equipo2 = new Equipo(arrayEquipos[4], "selecionado");
                Partido partido_1 = new Partido(Integer.parseInt(arrayEquipos[0]), equipo1, equipo2,
                        Integer.parseInt(arrayEquipos[2]),
                        Integer.parseInt(arrayEquipos[3]));
                partidos.add(partido_1);
                boolean existe = rondas.contains(Integer.parseInt(arrayEquipos[0]));
                if (existe == false) {
                    rondas.add(Integer.parseInt(arrayEquipos[0]));
                }
            }
        }
        System.out.println("Cantidad de rondas: " + rondas.size());
        // -----------------Leer Pronostico--------
        Path pathPronostico = Paths.get(
                "C:\\Users\\johann\\Documents\\Cursos\\curso_ava\\trabajo_pratico\\demo\\src\\main\\resources\\partidos.csv");
        System.out.println("Cargando Pronosticos..");
        List<String> lineasPronosticos = null;
        // boolean linea1 = true;
        try {

            lineasPronosticos = Files.readAllLines(pathPronostico);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("El archivo no existe");
            System.exit(1);
        }
        linea1 = true;
        int punto = 0;
        int indexPuntos = 0;
        ArrayList<String> puntosRonda = new ArrayList<String>();
        for (String prosticos : lineasPronosticos) {
            if (linea1 == true) {
                linea1 = false;
            } else {
                String[] arrayPronosticos = prosticos.split(",");
                for (Partido nobrePartido : partidos) {
                    if (nobrePartido.getEquipo1().getNombre().equals(arrayPronosticos[1])) {
                        if ("X".equals(arrayPronosticos[2])) {
                            // ResultadoEnum.GANADOR;
                            Pronostico pronostico_1 = new Pronostico(nobrePartido, nobrePartido.getEquipo1(),
                                    ResultadoEnum.GANADOR);
                            if (pronostico_1.puntos() > 0) {
                                boolean existe = puntosRonda.contains(arrayPronosticos[0]);
                                if (existe) {
                                    indexPuntos = puntosRonda.indexOf(arrayPronosticos[0]) + 1;
                                    // System.out.println(indexPuntos + "index");
                                    punto = 1 + Integer.parseInt(puntosRonda.get(indexPuntos));
                                    // System.out.println(punto + "--->>>");
                                    puntosRonda.set(indexPuntos, Integer.toString(punto));
                                    // System.out.println("suma 2 ganador " + arrayPronosticos[0]);
                                    punto = 0;
                                    for (String string : puntosRonda) {
                                        System.out.println(string);
                                    }
                                } else {
                                    punto += 1;
                                    indexPuntos = puntosRonda.indexOf(arrayPronosticos[0]) + 1;
                                    puntosRonda.add(arrayPronosticos[0]);
                                    puntosRonda.add("1");
                                    punto = 0;
                                    // System.out.println("suma 1 ganador " + arrayPronosticos[0]);
                                    for (String string : puntosRonda) {
                                        System.out.println(string);
                                    }
                                }

                            }
                        }
                        // System.out.println("---123--" + arrayPronosticos[3]);
                        if ("X".equals(arrayPronosticos[3])) {
                            // ResultadoEnum.EMPATE;
                            Pronostico pronostico_2 = new Pronostico(nobrePartido, nobrePartido.getEquipo1(),
                                    ResultadoEnum.EMPATE);
                            System.out.println(pronostico_2.puntos());
                            if (pronostico_2.puntos() > 0) {
                                boolean existe = puntosRonda.contains(arrayPronosticos[0]);
                                if (existe) {
                                    indexPuntos = puntosRonda.indexOf(arrayPronosticos[0]) + 1;
                                    punto = 1 + Integer.parseInt(puntosRonda.get(indexPuntos));
                                    puntosRonda.set(indexPuntos, Integer.toString(punto));
                                    // System.out.println("suma 2 empate " + arrayPronosticos[0]);
                                    punto = 0;
                                } else {
                                    punto += 1;
                                    puntosRonda.add(arrayPronosticos[0]);
                                    puntosRonda.add("1");
                                    // System.out.println("suma 1 empate " + arrayPronosticos[0]);
                                    punto = 0;
                                }
                            }
                        }
                        if ("X".equals(arrayPronosticos[4])) {
                            // ResultadoEnum.PERDEDOR;
                            Pronostico pronostico_3 = new Pronostico(nobrePartido, nobrePartido.getEquipo1(),
                                    ResultadoEnum.PERDEDOR);
                            if (pronostico_3.puntos() > 3) {
                                boolean existe = puntosRonda.contains(arrayPronosticos[0]);
                                if (existe) {
                                    indexPuntos = puntosRonda.indexOf(arrayPronosticos[0]) + 1;
                                    punto = 1 + Integer.parseInt(puntosRonda.get(indexPuntos));
                                    puntosRonda.set(indexPuntos, Integer.toString(punto));
                                    punto = 0;

                                } else {
                                    punto += 1;
                                    puntosRonda.add(arrayPronosticos[0]);
                                    puntosRonda.add("1");
                                    // System.out.println("suma 1 perdedor " + arrayPronosticos[0]);
                                    punto = 0;
                                }
                            }
                        }

                    }
                }

            }
        }
        System.out.println("<----Resultado--->");
        for (String string1 : puntosRonda) {
            System.out.println(string1);

        }

    }

}