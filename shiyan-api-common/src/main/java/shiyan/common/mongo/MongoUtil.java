package shiyan.common.mongo;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.UpdateOptions;
import org.bson.BSON;
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
//        Document d = new Document();
//        d.append("oid", UUID.randomUUID().toString());
//        d.append("title", "新凉");
//        d.append("dynasty", "宋");
//        d.append("author", "徐玑");
//        d.append("content", "水满田畴稻叶齐，日光穿树晓烟低。\n" +
//                        "黄莺也爱新凉好，飞过青山影里啼。");
        Document d = new Document();
//        d.append("oid", UUID.randomUUID().toString());
//        d.append("oid", "04037dd7-8ec1-433f-825e-7964dfa67199");
        d.append("title", "滕王阁序");
        d.append("dynasty", "唐");
        d.append("author", "王勃");
        String content = "豫章故郡，洪都新府。星分翼轸，地接衡庐。襟三江而带五湖，控蛮荆而引瓯越。物华天宝，龙光射牛斗之墟；人杰地灵，徐孺下陈蕃之榻。雄州雾列，俊采星驰。台隍枕夷夏之交，宾主尽东南之美。都督阎公之雅望，棨戟遥临；宇文新州之懿范，襜帷暂驻。十旬休假，胜友如云；千里逢迎，高朋满座。腾蛟起凤，孟学士之词宗；紫电青霜，王将军之武库。家君作宰，路出名区；童子何知，躬逢胜饯。\n";
        content += "时维九月，序属三秋。潦水尽而寒潭清，烟光凝而暮山紫。俨骖騑于上路，访风景于崇阿。临帝子之长洲，得仙人之旧馆。层峦耸翠，上出重霄；飞阁流丹，下临无地。鹤汀凫渚，穷岛屿之萦回；桂殿兰宫，即冈峦之体势。\n";
        content += "披绣闼，俯雕甍，山原旷其盈视，川泽纡其骇瞩。闾阎扑地，钟鸣鼎食之家；舸舰迷津，青雀黄龙之舳。云销雨霁，彩彻区明。落霞与孤鹜齐飞，秋水共长天一色。渔舟唱晚，响穷彭蠡之滨，雁阵惊寒，声断衡阳之浦。\n";
        content += "遥襟甫畅，逸兴遄飞。爽籁发而清风生，纤歌凝而白云遏。睢园绿竹，气凌彭泽之樽；邺水朱华，光照临川之笔。四美具，二难并。穷睇眄于中天，极娱游于暇日。天高地迥，觉宇宙之无穷；兴尽悲来，识盈虚之有数。望长安于日下，目吴会于云间。地势极而南溟深，天柱高而北辰远。关山难越，谁悲失路之人；萍水相逢，尽是他乡之客。怀帝阍而不见，奉宣室以何年？\n";
        content += "嗟乎！时运不齐，命途多舛。冯唐易老，李广难封。屈贾谊于长沙，非无圣主；窜梁鸿于海曲，岂乏明时？所赖君子见机，达人知命。老当益壮，宁移白首之心？穷且益坚，不坠青云之志。酌贪泉而觉爽，处涸辙以犹欢。北海虽赊，扶摇可接；东隅已逝，桑榆非晚。孟尝高洁，空余报国之情；阮籍猖狂，岂效穷途之哭！\n";
        content += "勃，三尺微命，一介书生。无路请缨，等终军之弱冠；有怀投笔，慕宗悫之长风。舍簪笏于百龄，奉晨昏于万里。非谢家之宝树，接孟氏之芳邻。他日趋庭，叨陪鲤对；今兹捧袂，喜托龙门。杨意不逢，抚凌云而自惜；钟期既遇，奏流水以何惭？\n";
        content += "呜乎！胜地不常，盛筵难再；兰亭已矣，梓泽丘墟。临别赠言，幸承恩于伟饯；登高作赋，是所望于群公。敢竭鄙怀，恭疏短引；一言均赋，四韵俱成。请洒潘江，各倾陆海云尔：\n";
        content += "滕王高阁临江渚，佩玉鸣鸾罢歌舞。\n" +
                "画栋朝飞南浦云，珠帘暮卷西山雨。\n" +
                "闲云潭影日悠悠，物换星移几度秋。\n" +
                "阁中帝子今何在？槛外长江空自流。\n";
        d.append("content", content);
//        articles.insertOne(d);
        Document condition = new Document();
        condition.append("oid", "04037dd7-8ec1-433f-825e-7964dfa67199");
//        condition.append("title", "滕王阁序");
        Document dSet = new Document();
        dSet.append("$set", d);
        articles.updateOne(condition, dSet);
        System.out.print("");
    }
}
