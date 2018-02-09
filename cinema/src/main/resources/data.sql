-- All cinemas
INSERT INTO cinema (id, name, address) VALUES (1, 'Arena', 'Bulevar Mihajla Pupina 3');
INSERT INTO cinema (id, name, address) VALUES (2, 'CineStar', 'BIG Shooping Centar');

-- All theaters
INSERT INTO theater (id, name, cinema_id) VALUES (1, 'Sala 1', 1);
INSERT INTO theater (id, name, cinema_id) VALUES (2, 'Sala 2', 1);
INSERT INTO theater (id, name, cinema_id) VALUES (3, 'Sala 3', 1);
INSERT INTO theater (id, name, cinema_id) VALUES (4, 'Theater 1', 2);
INSERT INTO theater (id, name, cinema_id) VALUES (5, 'Theater 2', 2);
INSERT INTO theater (id, name, cinema_id) VALUES (6, 'Theater 3', 2);

-- Arena - Sala 1
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (1, 1, 1, 1);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (2, 1, 2, 1);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (3, 1, 3, 1);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (4, 1, 4, 1);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (5, 2, 1, 1);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (6, 2, 2, 1);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (7, 2, 3, 1);
-- Arena - Sala 2
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (8, 1, 1, 2);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (9, 1, 2, 2);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (10, 1, 3, 2);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (11, 1, 4, 2);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (12, 2, 1, 2);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (13, 2, 2, 2);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (14, 2, 3, 2);
-- Arena - Sala 3
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (15, 1, 1, 3);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (16, 1, 2, 3);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (17, 1, 3, 3);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (18, 1, 4, 3);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (19, 2, 1, 3);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (20, 2, 2, 3);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (21, 2, 3, 3);
-- BIG Theater 1
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (22, 1, 1, 4);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (23, 1, 2, 4);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (24, 1, 3, 4);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (25, 1, 4, 4);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (26, 2, 1, 4);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (27, 2, 2, 4);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (28, 2, 3, 4);
-- BIG Theater 2
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (29, 1, 1, 5);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (30, 1, 2, 5);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (31, 1, 3, 5);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (32, 1, 4, 5);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (33, 2, 1, 5);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (34, 2, 2, 5);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (35, 2, 3, 5);
-- BIG Theater 133
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (36, 1, 1, 6);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (37, 1, 2, 6);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (38, 1, 3, 6);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (39, 1, 4, 6);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (40, 2, 1, 6);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (41, 2, 2, 6);
INSERT INTO seat (id, rov_num, col_num, theater_id) VALUES (42, 2, 3, 6);

-- All Movies
INSERT INTO movie (id, name, movie_genre) VALUES (1, 'Movie1', 'DRAMA');
INSERT INTO movie (id, name, movie_genre) VALUES (2, 'Movie2', 'COMEDY');
INSERT INTO movie (id, name, movie_genre) VALUES (3, 'Movie3', 'DRAMA');
INSERT INTO movie (id, name, movie_genre) VALUES (4, 'Movie4', 'THRILLER');

