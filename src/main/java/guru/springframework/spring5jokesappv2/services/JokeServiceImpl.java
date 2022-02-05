package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;
//Adding servcieImpl
@Service
public class JokeServiceImpl implements JokeService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

//    public JokeServiceImpl() {
//        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
//    }

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
