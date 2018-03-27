
import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class BackenlessUpload {
    private Recipe toBeUploaded;

    public BackenlessUpload(Recipe toBeUploaded) {
        this.toBeUploaded = toBeUploaded;
    }

    public Recipe getToBeUploaded() {
        return toBeUploaded;
    }

    public void setToBeUploaded(Recipe toBeUploaded) {
        this.toBeUploaded = toBeUploaded;
    }

    public void upload(){
        Backendless.Data.of(Recipe.class).save(toBeUploaded, new AsyncCallback<Recipe>() {
            @Override
            public void handleResponse(Recipe response) {
                System.out.println("Success; recipe "+ toBeUploaded.getRecipeName() + " has been uploaded!");
            }

            @Override
            public void handleFault(BackendlessFault fault) {
                System.out.println(fault.toString());
            }
        });
    }

}
