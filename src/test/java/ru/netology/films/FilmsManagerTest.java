package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FilmsManagerTest {

    @Test
    public void withoutAddingAndFindAll() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddOneMovieAndFindAll() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddThreeMoviesAndFindAll() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddSixMoviesAndFindAll() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void withoutAddingAndFindLast() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddOneMovieAndFindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddThreeMoviesAndFindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddFiveMoviesAndFindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");


        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddSixMoviesAndFindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");

        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void withoutAddingAndFindLastSeven() {
        FilmsManager manager = new FilmsManager(7);

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddOneMovieAndFindLastSeven() {
        FilmsManager manager = new FilmsManager(7);
        manager.add("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddSixMoviesAndFindLastSeven() {
        FilmsManager manager = new FilmsManager(7);
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");

        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddSevenMoviesAndFindLastSeven() {
        FilmsManager manager = new FilmsManager(7);
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");

        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddEightMoviesAndFindLastSeven() {
        FilmsManager manager = new FilmsManager(7);
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");

        String[] expected = {"Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void withoutAddingAndFindLastThree() {
        FilmsManager manager = new FilmsManager(3);

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddTwoMoviesAndFindLastThree() {
        FilmsManager manager = new FilmsManager(3);
        manager.add("Movie 1");
        manager.add("Movie 2");


        String[] expected = {"Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddThreeMoviesAndFindLastThree() {
        FilmsManager manager = new FilmsManager(3);
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddFourMoviesAndFindLastThree() {
        FilmsManager manager = new FilmsManager(3);
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");

        String[] expected = {"Movie 4", "Movie 3", "Movie 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
