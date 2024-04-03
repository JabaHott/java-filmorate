package ru.yandex.practicum.filmorate.storage.film;

import ru.yandex.practicum.filmorate.model.Film;

import java.util.Map;

public interface FilmStorage {
    Film create(Film film);

    Film update(Film film);

    Film get(Long id);

    Map<Long, Film> getAll();
}