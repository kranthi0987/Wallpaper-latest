package com.sanjay.wallpaper.network.retroFit;


import com.sanjay.wallpaper.models.wallpaperModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterface {


   @GET("/api/images")
    Observable<wallpaperModel> WALLPAPER_MODEL_OBSERVABLE();

}
