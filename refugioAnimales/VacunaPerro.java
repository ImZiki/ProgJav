package ud09.refugioAnimales;

public enum VacunaPerro implements Vacuna {
    MOQUILLO("Moquillo canino", true, 36),
    RABIA("Rabia", true, 12),
    PARVOVIRUS("Parvovirus canino", true, 36),
    ADENOVIRUS("Adenovirus canino tipo I y II", true, 36),
    CCORONAVIRUS("Coronavirus canino", false, 0),
    LEPTOSPIRA("Leptopirosis", false, 12);
    
    private String nombre;
    private boolean esencial;
    private int revacunacion;

    VacunaPerro(String nombre, boolean esencial, int revacunacion) {
        this.nombre = nombre;
        this.esencial = esencial;
        this.revacunacion = revacunacion;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public boolean esEsencial() {
        return esencial;
    }

    public int tiempoRevacunacion(){
        return revacunacion;
    }
}