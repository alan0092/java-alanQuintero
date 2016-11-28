/*******************************************************
 * Copyright (C) 2016 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "Movie Pick".
 * 
 * "Movie Pick" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/
package com.alanquintero.mp.util;

/**
 * @class Consts.java
 * @purpose: Constants class.
 */
public final class Consts {

    // Role
    public static final String ROLE_ADMIN = "ADMIN";
    public static final String HAS_ROLE_ADMIN = "hasRole('ROLE_ADMIN')";
    public static final String ROLE_USER = "ROLE_USER";

    // Authorization
    public static final String USERNAME_OR_ADMIN = "hasRole('ROLE_ADMIN') or #review.profile.user.name == authentication.name";

    // Message
    public static final String MSG_MOVIE_NOT_FOUND = "Movie not Found!";
    public static final String MSG_SUCCESS = "Success";
    public static final String MSG_FAIL = "Sorry! Something went wrong";

    // Model
    public static final String USERS = "users";
    public static final String USER = "user";
    public static final String MOVIE = "movie";
    public static final String REVIEW = "review";
    public static final String VOTE = "vote";
    public static final String RESULT = "result";
    public static final String MOVIES = "movies";
    public static final String MESSAGE = "message";
    public static final String ADMIN = "admin";

    // Request Mapping
    public static final String USERS_URL = "/users";
    public static final String USER_URL = "/{userId}";
    public static final String DELETE_USER_URL = "/remove/{userId}";
    public static final String DEFAULT_URL = "/";
    public static final String INDEX_URL = "/index";
    public static final String LOGIN_URL = "/login";
    public static final String MOVIE_URL = "/movie/{movieId}";
    public static final String POPULAR_MOVIES_URL = "/result";
    public static final String RESULT_MOVIE_URL = "/result/{movieTitle}";
    public static final String MOVIES_URL = "/movies";
    public static final String DELETE_MOVIE_URL = "/movies/remove/{movieId}";
    public static final String AUTOCOMPLETE_MOVIES_URL = "/getMovies";
    public static final String REGISTER_URL = "/register";
    public static final String VALIDATE_USERNAME_URL = "/checkusername";
    public static final String VALIDATE_EMAIL_URL = "/checkuseremail";
    public static final String RATE_MOVIE = "/rateMovie";
    public static final String PROFILE_URL = "/profile";
    public static final String DELETE_PROFILE_URL = "profile/remove/{reviewId}";

    // Page
    public static final String USERS_PAGE = "users";
    public static final String USER_PAGE = "user-detail";
    public static final String DELETE_USER_PAGE = "redirect:/users.html";
    public static final String INDEX_PAGE = "index";
    public static final String LOGIN_PAGE = "login";
    public static final String MOVIE_PAGE = "movie";
    public static final String MOVIES_PAGE = "movies";
    public static final String REDIRECT_MOVIE_PAGE = "redirect:/movie/{movieId}.html";
    public static final String REDIRECT_RESULT_MOVIE_PAGE = "redirect:/result/{movieTitle}.html";
    public static final String REDIRECT_MOVIES_PAGE = "redirect:/movies.html";
    public static final String REDIRECT_MOVIES_SUCCESS_PAGE = "redirect:/movies.html?success=true";
    public static final String REDIRECT_MOVIES_FAIL_PAGE = "redirect:/movies.html?success=false";
    public static final String REGISTER_PAGE = "register";
    public static final String REGISTER_SUCCESS_PAGE = "redirect:/register.html?success=true";
    public static final String PROFILE_PAGE = "profile";
    public static final String REDIRECT_PROFILE_PAGE = "redirect:/profile.html";
    public static final String REDIRECT_PROFILE_SUCCESS_PAGE = "redirect:/profile.html?success=true";
    public static final String REDIRECT_PROFILE_FAIL_PAGE = "redirect:/profile.html?success=false";

    // Redirect Page
    public static final String REDIRECT_LOGIN_PAGE = "/login.html";

    // DB Entity
    public static final String MOVIE_ENTITY = "movie";
    public static final String PROFILE_ENTITY = "profile";
    public static final String ROLE_ENTITY = "roles";
    public static final String USER_ENTITY = "user";

    // DB Fields
    public static final String PUBLISHED_DATE_FIELD = "publishedDate";
    public static final String RATING_FIELD = "rating";
    public static final String VOTE_FIELD = "vote";

    // DB Join Column
    public static final String PUBLISHED_DATE_COLUMN = "published_date";
    public static final String PROFILE_ID_COLUMN = "profile_id";
    public static final String MOVIE_ID_COLUMN = "movie_id";
    public static final String USER_ID_COLUMN = "user_id";

    // Parameter
    public static final String MOVIE_ID_PARAM = "movie_id";
    public static final String MOVIE_TITLE_PARAM = "movie_title";
    public static final String MOVIE_RATING_PARAM = "movie_rating";
    public static final String MOVIE_YEAR_PARAM = "movie_year";
    public static final String MOVIE_VOTE_PARAM = "movie_vote";
    public static final String USER_EMAIL_PARAM = "user_email";
    public static final String PROFILE_ID_PARAM = "profile_id";

    // Error Message
    public static final String TITLE_MIN_ERROR_MESSAGE = "Title must be at least one character!";
    public static final String COMMENT_MIN_ERROR_MESSAGE = "Comment must be at least one character!";
    public static final String USER_MIN_ERROR_MESSAGE = "User Name must be at least four characters!";
    public static final String USER_EXISTS_ERROR_MESSAGE = "User Name already exists!";
    public static final String EMAIL_INVALID_ERROR_MESSAGE = "Invalid Email Address!";
    public static final String EMAIL_EXISTS_ERROR_MESSAGE = "Email is already in use!";
    public static final String PASSWORD_MIN_ERROR_MESSAGE = "Password must be at least six characters!";

    // Configuration
    public static final String CONF_CONTEXT = "file:src/main/webapp/WEB-INF/applicationContext.xml";

    // Symbol
    public static final String PERCENT = "%";
    public static final String PARENTHESIS_OPEN = " (";
    public static final String PARENTHESIS_CLOSE = ")";

    // Length
    public static final int USER_LENGTH = 4;
    public static final int PWD_LENGTH = 6;

    // Pattern
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";

    // Type
    public static final String TYPE_CLOB = "org.hibernate.type.StringClobType";

    // Format
    public static final String FORMAT_BLANK_SPACE = "\\s+$";
    public static final String FORMAT_YT_EMBED = "embed/";

    // Others
    public static final String EMPTY_STRING = "";

}
