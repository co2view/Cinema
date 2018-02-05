--
-- Table structure for table cinema
--
CREATE TABLE cinema (
  id int(11) NOT NULL,
  adrress varchar(255) DEFAULT NULL,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table movie
--
CREATE TABLE movie (
  id int(11) NOT NULL,
  movie_genre varchar(255) NOT NULL,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table theater
--
CREATE TABLE theater (
  id int(11) NOT NULL,
  name varchar(255) NOT NULL,
  id_cinema int(11) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FKTheaterCinema FOREIGN KEY (id_cinema) REFERENCES cinema (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table projection
--
CREATE TABLE projection (
  id int(11) NOT NULL,
  end_projection datetime NOT NULL,
  start_projection datetime NOT NULL,
  id_movie int(11) NOT NULL,
  id_theater int(11) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FKProjectionTheater FOREIGN KEY (id_theater) REFERENCES theater (id),
  CONSTRAINT FKProjectionMovie FOREIGN KEY (id_movie) REFERENCES movie (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table seat
--
CREATE TABLE seat (
  id int(11) NOT NULL,
  col_num int(11) NOT NULL,
  rov_num int(11) NOT NULL,
  id_theater int(11) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FKSeatTheater FOREIGN KEY (id_theater) REFERENCES theater (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table ticket
--
CREATE TABLE ticket (
  id int(11) NOT NULL,
  ticket_status varchar(255) NOT NULL,
  id_projection int(11) NOT NULL,
  id_seat int(11) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FKTicketProjection FOREIGN KEY (id_projection) REFERENCES projection (id),
  CONSTRAINT FKTicketSeat FOREIGN KEY (id_seat) REFERENCES seat (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
