package pl.sda.mongo;

import com.mongodb.DBObject;
import org.bson.types.ObjectId;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PostsDAO dao = new PostsDAO();

        Post post = new Post();
        post.setAuthor("Tadeusz");
        post.setContent("Zawartosc");
        post.setDate(new Date());
        dao.insert(post);

        List<DBObject> results = dao.searchById(new ObjectId("58c03c7bb015cccf962564db"));

//        dao.removeById(new ObjectId("58c03e0cb015cccf96256549"));

        Post post2 = new Post();
        post2.setAuthor("Tadeusz B");
        post2.setContent("Zaktualizowana tresc");
        post2.setDate(new Date());

        dao.updateById(post2, new ObjectId("58c03c7bb015cccf962564db"));
    }
}
