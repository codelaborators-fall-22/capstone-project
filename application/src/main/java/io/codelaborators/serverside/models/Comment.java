package io.codelaborators.serverside.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String comment;

    private String userName;
    @ManyToOne
    @JsonIgnore

    private Recipe recipe;

    public String getComment() {
        return comment;
    }

    public String getUserName() {
        return userName;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public Comment(String comment, String userName, Recipe recipe) {
        this.comment = comment;
        this.userName = userName;
        this.recipe = recipe;
    }

    public Comment(){}
}
