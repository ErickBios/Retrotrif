package fasam.faculdade.retrotrif.boostrap;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class APIPlanestes {

    public static final String ENDPOINT = "https://swapi.dev/api/";
    public static Retrofit getPlanets(){


        return new Retrofit.Builder()
                .baseUrl(ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

}
