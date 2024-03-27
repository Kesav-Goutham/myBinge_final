package com.sjprogramming.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie_list")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "cast")
	private String cast;
	@Column(name="category")
	private String category;
	@Column(name="description")
	private String description;
	@Column(name="director")
	private String director;
	@Column(name="genre")
	private String genre;
	@Column(name="movie_name")
	private String movie_name;
	@Column(name="poster_link")
	private String poster_link;
	@Column(name="ratings")
	private String ratings;
	@Column(name="runtime")
	private String runtime;
	@Column(name="year")
	private String year;


	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name, float percentage, String branch) {
		super();
		this.id = id;
		this.cast = cast;
		this.category = category;
		this.description = description;
		this.director = director;
		this.genre = genre;
		this.movie_name = movie_name;
		this.poster_link = poster_link;
		this.ratings = ratings;
		this.runtime = runtime;
		this.year = year;
	}


	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getcast() {
		return cast;
	}
	public void setcast(String cast) {
		this.cast = cast;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public String getdirector() {
		return director;
	}
	public void setdirector(String director) {
		this.director = director;
	}
	public String getgenre() {
		return genre;
	}
	public void setgenre(String genre) {
		this.genre = genre;
	}
	public String getmovie_name() {
		return movie_name;
	}
	public void setmovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getposter_link() {
		return poster_link;
	}
	public void setposter_link(String poster_link) {
		this.genre = poster_link;
	}
	public String getratingse() {
		return ratings;
	}
	public void setratings(String ratings) {
		this.ratings = ratings;
	}
	public String getruntime() {
		return runtime;
	}
	public void setruntime(String runtime) {
		this.ratings = runtime;
	}
	public String getyear() {
		return year;
	}
	public void setyear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", cast=" + cast + ", category=" + category + ", description=" + description + ", genre=" + genre+ ", movie_name=" + movie_name + ", poster_link=" + poster_link+ ", ratings=" + ratings+ ", runtime=" + runtime+ ", year=" + year
				+ "]";
	}
	
	

}
