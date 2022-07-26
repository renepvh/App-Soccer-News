package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();
        // TODO remover Mock de Noticias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária tem desfalque importante", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...\"\n" +
                "\"There is no one who loves pain itself, who seeks after it and wants to have it, simply because it is pain..."));
        news.add(new News("Ferrinha joga no sábado", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...\"\n" +
                "\"There is no one who loves pain itself, who seeks after it and wants to have it, simply because it is pain..."));
        news.add(new News("Copa do mundo feminina esta terminando", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...\"\n" +
                "\"There is no one who loves pain itself, who seeks after it and wants to have it, simply because it is pain..."));

        this.news.setValue(news);

    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}