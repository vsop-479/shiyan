package shiyan.common.mongo;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
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
//        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
//                CodecRegistries.fromCodecs(new LocalDateCodec()),
//                CodecRegistries.fromProviders(
//                        new RaCodecProvider(),
//                        new DutyBlockCodecProvider(),
//                        new ScheduledDutyCodecProvider()),
//                MongoClient.getDefaultCodecRegistry()
//        );
//        MongoClientOptions options = MongoClientOptions.builder()
//                .codecRegistry(codecRegistry).build();
//        mongoClient = new MongoClient(new ServerAddress(host, port), options);
        //如果想像下面指定装换类型查询，就要像上面那样为Article实现Codec<Article>
        //参照 http://stackoverflow.com/questions/30569228/mongodb-bson-codec-not-being-used-while-encoding-object
//        FindIterable<Article> articles = collection.find(Article.class);
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
