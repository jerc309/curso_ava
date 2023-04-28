package com.trabajopractico;

public class Partido {
    private int ronda = 0;
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1 = 0;
    private int golesEquipo2 = 0;
    private ResultadoEnum resultado;

    // Constructor
    public Partido(int ronda, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.ronda = ronda;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;

    }

    // Metodos
    public ResultadoEnum calcularResultado() {
        if (this.golesEquipo1 > this.golesEquipo2) {
            return ResultadoEnum.GANADOR;

        } else if (this.golesEquipo1 < this.golesEquipo2) {
            return ResultadoEnum.PERDEDOR;

        } else {
            return ResultadoEnum.EMPATE;
        }
    }
    // Getters and Setters

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }

}
