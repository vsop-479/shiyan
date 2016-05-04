package shiyan.common.mongo;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.UUID;

/**
 * Created by Administrator on 2016/4/28.
 */
public class MongoUtil {
    private String host;
    private int port;
    private MongoClient mongoClient;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void init(){
        mongoClient = new MongoClient(host, port);
    }
    public MongoDatabase getDatabase(String name){
        return mongoClient.getDatabase(name);
    }

    public MongoCollection<Document> getCollection(String databaseName, String collectionName){
        return getDatabase(databaseName).getCollection(collectionName);
    }

    public static void main(String[] args){
        MongoClient mongoClient = new MongoClient("localhost", 27000);
        MongoDatabase guwen = mongoClient.getDatabase("guwen");
        MongoCollection<Document> articles = guwen.getCollection("articles");
        Document d = new Document();
        d.append("oid", UUID.randomUUID().toString());
        d.append("title", "新凉");
        d.append("dynasty", "宋");
        d.append("author", "徐玑");
        d.append("content", "水满田畴稻叶齐，日光穿树晓烟低。\n" +
                        "黄莺也爱新凉好，飞过青山影里啼。");
        articles.insertOne(d);
        System.out.print("");
    }
}
