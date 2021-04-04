package com.gurpreet.singh.gitbranching;

public interface JokesApi {

    @GET("Jokes/random")
    Call<Joke> fetchJoke()
}
