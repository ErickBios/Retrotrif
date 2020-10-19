package fasam.faculdade.retrotrif.resourse;

import fasam.faculdade.retrotrif.model.Planestes;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PlanestesAPI {
    @GET("Planestes")
    Call<ResponseBody> obeterPlanetas(@Query("api_key") String chaveAPi);

}
