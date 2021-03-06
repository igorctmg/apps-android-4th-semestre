package br.com.cotemig.eat.services;

import br.com.cotemig.eat.models.ModelUser;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by 71600388 on 27/04/2018.
 */

public interface IServiceUser {

    @POST("user/auth")
    Call<ModelUser> auth(@Body ModelUser user);

    @POST("user")
    Call<ModelUser> register(@Body ModelUser user);

    @POST("user/forgot")
    Call<ModelUser> forgot(@Body ModelUser user);

    @GET("user/me")
    Call<ModelUser> me();

}
