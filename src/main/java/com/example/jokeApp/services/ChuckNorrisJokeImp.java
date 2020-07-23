package com.example.jokeApp.services;

import com.example.jokeApp.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeImp implements JokeService {
    @Override
    public Joke getAJoke() {
        Joke joke = new Joke ();
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes ();
        joke.setText(chuckNorrisQuotes.getRandomQuote());
        return joke;
    }
}
