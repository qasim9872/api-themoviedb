/*
 *      Copyright (c) 2004-2016 Stuart Boston
 *
 *      This file is part of TheMovieDB API.
 *
 *      TheMovieDB API is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation, either version 3 of the License, or
 *      any later version.
 *
 *      TheMovieDB API is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *
 *      You should have received a copy of the GNU General Public License
 *      along with TheMovieDB API.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.omertron.themoviedbapi.methods;

import com.omertron.themoviedbapi.AbstractTests;
import com.omertron.themoviedbapi.MovieDbException;
import com.omertron.themoviedbapi.model.Genre;
import com.omertron.themoviedbapi.model.movie.MovieBasic;
import com.omertron.themoviedbapi.results.ResultList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author stuart.boston
 */
public class TmdbGenresTest extends AbstractTests {

    private static TmdbGenres instance;
    private static final String LIST_IS_EMPTY = "List is empty";
    private static final String LIST_IS_NULL = "List is null";
    private static final int ID_GENRE_ACTION = 28;

    @BeforeClass
    public static void setUpClass() throws MovieDbException {
        doConfiguration();
        instance = new TmdbGenres(getApiKey(), getHttpTools());
    }

    /**
     * Test of getGenreMovieList method, of class TmdbGenres.
     *
     * @throws com.omertron.themoviedbapi.MovieDbException
     */
    @Test
    public void testGetGenreMovieList() throws MovieDbException {
        LOG.info("getGenreMovieList");
        ResultList<Genre> result = instance.getGenreMovieList(LANGUAGE_DEFAULT);
        assertNotNull(LIST_IS_NULL, result.getResults());
        assertFalse(LIST_IS_EMPTY, result.getResults().isEmpty());
    }

    /**
     * Test of getGenreTVList method, of class TmdbGenres.
     *
     * @throws com.omertron.themoviedbapi.MovieDbException
     */
    @Test
    public void testGetGenreTVList() throws MovieDbException {
        LOG.info("getGenreTVList");
        ResultList<Genre> result = instance.getGenreTVList(LANGUAGE_DEFAULT);
        assertNotNull(LIST_IS_NULL, result.getResults());
        assertFalse(LIST_IS_EMPTY, result.getResults().isEmpty());
    }

    /**
     * Test of getGenreMovies method, of class TmdbGenres.
     *
     * @throws com.omertron.themoviedbapi.MovieDbException
     */
    @Test
    public void testGetGenreMovies() throws MovieDbException {
        LOG.info("getGenreMovies");
        Integer page = null;
        Boolean includeAllMovies = null;
        Boolean includeAdult = null;
        ResultList<MovieBasic> result = instance.getGenreMovies(ID_GENRE_ACTION, LANGUAGE_DEFAULT, page, includeAllMovies, includeAdult);
        assertNotNull(LIST_IS_NULL, result);
        assertFalse(LIST_IS_EMPTY, result.isEmpty());
    }

}
