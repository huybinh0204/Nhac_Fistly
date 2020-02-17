package com.example.nhac_fistly.Service;

import com.example.nhac_fistly.Model.Album;
import com.example.nhac_fistly.Model.Chude;
import com.example.nhac_fistly.Model.Playlist;
import com.example.nhac_fistly.Model.Quangcao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Dataservice {
    @GET("Quangcao_Get.php")
    Call<List<Quangcao>> GetDataBanner();

    @GET("Playlist_Get.php")
    Call<List<Playlist>> GetPlaylist();

    @GET("Chude_Get.php")
    Call<List<Chude>> GetChude();

    @GET("Album_Get.php")
    Call<List<Album>> GetAlbum();
}
