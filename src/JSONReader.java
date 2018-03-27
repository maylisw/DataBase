import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JSONReader {
    private ChoppingBoard apiFoodNetwork;
    //amishi wants brownies

    public JSONReader() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ChoppingBoard.baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiFoodNetwork = retrofit.create(ChoppingBoard.class);
    }

    public void makeCall(String url, String yada) {
        Call<JSONRecipe> call = apiFoodNetwork.getRecipe(url, yada);
        call.enqueue(new Callback<JSONRecipe>() {

            public void onResponse(Call<JSONRecipe> call, Response<JSONRecipe> response) {
                JSONRecipe recipe = response.body();
                //todo create backenless object to send
                Recipe r = new Recipe(recipe.getName(),recipe.getInstructions(),recipe.getYield(), recipe.getTotalTime().getEn(), recipe.getIngredients(), recipe.getCopyrighted().getImage());
                System.out.println(recipe.getName());
                BackenlessUpload b = new BackenlessUpload(r);
                b.upload();
            }

            public void onFailure(Call<JSONRecipe> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }
}
