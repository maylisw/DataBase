public class Time {
    private String iso, en;

    public Time(String iso, String en) {
        this.iso = iso;
        this.en = en;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public String toString() {
        return "{" +
                "iso='" + iso + '\'' +
                "en='" + en + '\'' +
                '}';
    }
}
