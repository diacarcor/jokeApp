package com.example.jokeApp.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeImp implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

     public ChuckNorrisJokeImp() {
        this.chuckNorrisQuotes =  new ChuckNorrisQuotes();
    }

    @Override
    public String getAJoke() {
        return chuckNorrisQuotes.getRandomQuote();

    }
}
