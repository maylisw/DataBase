public class Copyrighted {
    private String image, description;

    public Copyrighted(String image, String description) {
        this.image = image;
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "image='" + image + '\'' +
                "description='" + description + '\'' +
                '}';
    }
}
