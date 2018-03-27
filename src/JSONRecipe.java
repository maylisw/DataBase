public class JSONRecipe {
    private String name, url, yield;
    private String[] ingredients, instructions;
    private Time totalTime, prepTime, cookTime;
    private Copyrighted copyrighted;

    public JSONRecipe(String name, String url, String yield, String[] ingredients, String[] instructions, Time totalTime, Time prepTime, Time cookTime, Copyrighted copyrighted) {
        this.name = name;
        this.url = url;
        this.yield = yield;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.totalTime = totalTime;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.copyrighted = copyrighted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getYield() {
        return yield;
    }

    public void setYield(String yield) {
        this.yield = yield;
    }

    public String getIngredients() {
        return toArray(ingredients);
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return toArray(instructions);
    }

    public void setInstructions(String[] instructions) {
        this.instructions = instructions;
    }

    public Time getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Time totalTime) {
        this.totalTime = totalTime;
    }

    public Time getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Time prepTime) {
        this.prepTime = prepTime;
    }

    public Time getCookTime() {
        return cookTime;
    }

    public void setCookTime(Time cookTime) {
        this.cookTime = cookTime;
    }

    public Copyrighted getCopyrighted() {
        return copyrighted;
    }

    public void setCopyrighted(Copyrighted copyrighted) {
        this.copyrighted = copyrighted;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                "url='" + url + '\'' +
                "yield='" + yield + '\'' +
                "ingredients='" + toArray(ingredients) + '\'' +
                "instructions='" + toArray(instructions) + '\'' +
                "totalTime=" + totalTime.toString() +
                "prepTime=" + prepTime.toString() +
                "cookTime=" + cookTime.toString() +
                "copyrighted=" + copyrighted.toString() +
                '}';
    }

    public String toArray(String[] array){
        String pretty ="";
        for(String s: array){
            pretty = pretty + s + "\n";
        }
        return pretty;
    }
}