public class Movie {

    private String titlu;
    private String tipFilm;

    public void setIMBBrating(double IMBBrating) {
        this.IMBBrating = IMBBrating;
    }

    public void setTipFilm(String tipFilm) {
        this.tipFilm = tipFilm;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public double getIMBBrating() {
        return IMBBrating;
    }

    public String getTipFilm() {
        return tipFilm;
    }

    public String getTitlu() {
        return titlu;
    }

    private double IMBBrating;
}
