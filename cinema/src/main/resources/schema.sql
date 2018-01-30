--
-- Table structure for table cinema
--
CREATE TABLE cinema (
  id_cinema int(11) NOT NULL,
  adrress varchar(255) DEFAULT NULL,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id_cinema)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table movie
--
CREATE TABLE movie (
  id_movie int(11) NOT NULL,
  movie_genre varchar(255) NOT NULL,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id_movie)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table theater
--
CREATE TABLE theater (
  id_theater int(11) NOT NULL,
  name varchar(255) NOT NULL,
  id_cinema int(11) NOT NULL,
  PRIMARY KEY (id_theater),
  CONSTRAINT FKTheaterCinema FOREIGN KEY (id_cinema) REFERENCES cinema (id_cinema)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table projection
--
CREATE TABLE projection (
  id_projection int(11) NOT NULL,
  end_projection datetime NOT NULL,
  start_projection datetime NOT NULL,
  id_movie int(11) NOT NULL,
  id_theater int(11) NOT NULL,
  PRIMARY KEY (id_projection),
  CONSTRAINT FKProjectionTheater FOREIGN KEY (id_theater) REFERENCES theater (id_theater),
  CONSTRAINT FKProjectionMovie FOREIGN KEY (id_movie) REFERENCES movie (id_movie)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table seat
--
CREATE TABLE seat (
  id_seat int(11) NOT NULL,
  col_num int(11) NOT NULL,
  rov_num int(11) NOT NULL,
  id_theater int(11) NOT NULL,
  PRIMARY KEY (id_seat),
  CONSTRAINT FKSeatTheater FOREIGN KEY (id_theater) REFERENCES theater (id_theater)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table ticket
--
CREATE TABLE ticket (
  id_ticket int(11) NOT NULL,
  ticket_status varchar(255) NOT NULL,
  id_projection int(11) NOT NULL,
  id_seat int(11) NOT NULL,
  PRIMARY KEY (id_ticket),
  CONSTRAINT FKTicketProjection FOREIGN KEY (id_projection) REFERENCES projection (id_projection),
  CONSTRAINT FKTicketSeat FOREIGN KEY (id_seat) REFERENCES seat (id_seat)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
