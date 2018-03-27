import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by maylisw on 2/8/18.
 */

public interface ChoppingBoard {
    String baseURL = "https://choppingboard.recipes/";
    @GET("api/v0/recipe?key=f984895e5783f3e9e60dac9a3a4aaa72")
    Call<JSONRecipe> getRecipe(@Query("q") String url, @Query("getcopyrighted") String yada); // receives data asynchronously

}
