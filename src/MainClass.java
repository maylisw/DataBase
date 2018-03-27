import com.backendless.Backendless;

public class MainClass {
    public static void main(String[] args){
        Backendless.initApp(BackendlessSettings.APP_ID, BackendlessSettings.API_KEY );

        JSONReader j = new JSONReader();
        j.makeCall("", "y");
    }
}
