create table countries(
  country_id serial primary key,
  country_name varchar(255) not null UNIQUE
);

create table cities(
  city_id serial primary key,
  city_name varchar(255) not null UNIQUE,
  country_country_id INTEGER REFERENCES Countries(country_id)
);

create table events(
  event_id serial primary key,
  date_time timestamp with time zone not null,
  place varchar(255) not null,
  brief_description varchar(500) not null,
  full_description text not null,
  external_event varchar(255),
  cities_city_id INTEGER REFERENCES Cities(city_id)
);

create table categories(
  categories_id serial primary key,
  name_category varchar(100) not null UNIQUE
);

create table events_has_categories(
  events_has_categories_id serial primary key,
  events_event_id INTEGER REFERENCES Events(event_id),
  categories_categories_id INTEGER REFERENCES categories(categories_id)
);

create table users(
  user_id serial primary key,
  first_name varchar(100) not null,
  last_name varchar(100) not null,
  information_about_yourself text,
  email varchar(100) not null UNIQUE CHECK(email !=''),
  password varchar(30) not null,
  events_event_id INTEGER REFERENCES Events(event_id)
);

create table categories_file(
  categories_file_id serial primary key,
  categories_file_name varchar(100) not null
);

create table media(
  media_id serial primary key,
  file_name varchar(100) not null,
  categories_file_categories_file_id INTEGER REFERENCES categories_file(categories_file_id),
  users_user_id INTEGER REFERENCES Users(user_id),
  events_event_id INTEGER REFERENCES Events(event_id)
);

create table payment_information(
  payment_information_id serial primary key,
  dateTime timestamp with time zone not null,
  status varchar(30) not null,
  events_event_id INTEGER REFERENCES Events(event_id),
  users_user_id INTEGER REFERENCES Users(user_id)
);

create table comments(
  comments_id serial primary key,
  message text not null,
  comments_date timestamp with time zone not null,
  events_event_id INTEGER REFERENCES Events(event_id),
  users_user_id INTEGER REFERENCES Users(user_id)
);









