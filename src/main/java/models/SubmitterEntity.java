package models;

import javax.persistence.Entity;
import java.util.*;

@Entity
public class SubmitterEntity extends UserEntity {
    List<ArticleEntity> submittedArticles;

    public SubmitterEntity(){

    }

    public void submitArticle(){

    }

    public void viewArticleStatus(){

    }

}
