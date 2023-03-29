package Enumeracion;

public enum DiaSemana {
    LUNES("lunes", true), MARTES("martes", true), MIERCOLES("miercoles", true), JUEVES("jueves", true), VIERNES("viernes", true), SABADO("sabado", false), DOMINGO("domingo", false);

    private boolean esDiaSemana;
    private String dia;

    private DiaSemana(String dia ,boolean esDiaSemana){
        this.esDiaSemana = esDiaSemana;
        this.dia = dia;
    }

    public boolean esDiaSemana(){
        return esDiaSemana;
    }
    public boolean esFinSemana(){
        return !esDiaSemana;
    }
}
