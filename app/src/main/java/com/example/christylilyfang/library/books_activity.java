package com.example.christylilyfang.library;

import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class books_activity extends AppCompatActivity
{
    private List<Book> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books);

        initBooks();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initBooks() {
        Book book_0 = new Book("老人与海","海明威","人可以被毁灭，却不可以被战胜","一位老渔夫一连八十四天都没有钓到一条鱼，但他仍不肯认输，依然充满斗志，终于在第八十五天钓到一条身长十八尺，体重一千五百磅的大鱼。" +
                "大鱼拖着船往海里走，老人在没有水，没有食物，没有武器，没有助手，左手抽筋的种种困境下，依然顽强地和大鱼搏斗。经过两天两夜后，他终于杀死大鱼。但……",R.drawable.book0);
        fruitList.add(book_0);
        Book book_1 = new Book("看见","柴静","十年个人成长的告白，中国社会变迁的备忘","十年前她被选择成为国家电视台新闻主播，却因毫无经验而遭遇挫败，非典时期成为现场记者后，现实生活犬牙交错的切肤之感，让她一点一滴脱离外在与自我的束缚，对生活与人性有了更为宽广与深厚的理解。" +
                "每个人都深嵌在世界之中，没有人可以只是一个旁观者。",R.drawable.book1);
        fruitList.add(book_1);
        Book book_2 = new Book("活着","余华","人是为了活着本身而活着……","《活着》是一部充满血泪的小说。余华通过一位中国农民的苦难生活 讲述了人如何去承受巨大的苦难；讲述了眼泪的丰富和宽广；" +
                "讲述了欲望望的不存在：讲述了人是为了活着本身而活着……",R.drawable.book2);
        fruitList.add(book_2);
        Book book_3 = new Book("白夜行","东野圭吾","救赎罪恶的凄苦爱情","1973年，大阪的一栋废弃建筑内发现了一具男尸，此后19年，嫌疑人之女雪穗与被害者之子桐原亮司走上截然不同的人生道路，一个跻身上流社会，一个却在底层游走，" +
                "而他们身边的人，却接二连三地离奇死去，警察经过19年的艰苦追踪，终于使真相大白。",R.drawable.book3);
        fruitList.add(book_3);
        Book book_4 = new Book("嫌疑人x的献身","东野圭吾","纯粹的爱情 绝好的诡计", "数学天才石神爱上了邻居靖子。与女儿相依为命的靖子，失手杀了上门纠缠勒索的前夫。" +
                "为救靖子，石神以数学家缜密的逻辑思考设了一个匪夷所思的局，以令人惊骇莫名的诡计诠释了一份无比真挚纯粹的爱情……",R.drawable.book4);
        fruitList.add(book_4);
        Book book_5 = new Book("狼图腾","姜戎","一部描绘、研究蒙古草原狼的“旷世奇书”", "本书由几十个有机连贯的“狼故事”一气呵成，情节紧张激烈而又新奇神秘。狼的每一次侦察、布阵、伏击、奇袭的高超战术;狼对气象、地形的巧妙利用；狼的视死如归和不屈不挠；狼族中的友爱亲情；狼与草原万物的关系..." +
                "为什么我们信奉狼图腾？是否在于中国还存在着一个从未中断的狼图腾文化？我们究竟是龙的传人还是狼的传人？",R.drawable.book5);
        fruitList.add(book_5);
        Book book_6 = new Book("平凡的世界","路遥","普通人在时代大变革中所走过的既平凡又壮美的人生" ,"这是一部现实主义小说，也是小说化的家族史。作家高度浓缩了中国西北农村的历史变迁过程，作品达到了思想性与艺术性的高度统一，" +
                "特别是主人公面对困境艰苦奋斗的精神，对今天的大学生朋友仍有启迪。",R.drawable.book6);
        fruitList.add(book_6);
        Book book_7 = new Book("霍乱时期的爱情", "加西亚·马尔克斯","一部爱情的百科全书","一段跨越半个多世纪的爱情史诗，穷尽了所有爱情的可能性",R.drawable.book7);
        fruitList.add(book_7);
        Book book_8 = new Book("欧·亨利短篇小说集","","欧·亨利有“美国的莫泊桑”之称","该书收有他的主要作品四十多篇，其中《麦琪的礼物》、《警察和赞美诗》、《最后一片藤叶》等篇目一向被见为短篇经典，并被收进各种教材，均为脍炙人口的佳作。", R.drawable.book8);
        fruitList.add(book_8);
        Book book_9 = new Book("倾城之恋","张爱玲","一对平凡的夫妻之间的一点真心","从腐旧的家庭里走出来的白流苏，香港之战的洗礼并不曾将她感化成为革命女性：香港之战影响范柳原，使她转向平实的生活，终于结婚了，但结婚并不使他变为圣人，完全放弃往日的生活习惯与作风。",R.drawable.book9);
        fruitList.add(book_9);
        Book book_11 = new Book("目送","龙应台","21世纪的《背影》，感人至深的“生死笔记” /“有些路啊，只能一个人走……”","《目送》的七十四篇散文，写父亲的逝、母亲的老、儿子的离、朋友的牵挂、兄弟的携手共行，写失败和脆弱、失落和放手，写缠绵不舍和绝然的虚无。她写尽了幽微，如烛光冷照山壁。这是一本生死笔记，深邃，忧伤，美丽。",R.drawable.book11);
        fruitList.add(book_11);
        Book book_12 = new Book("百年孤独","加夫列尔·加西亚·马尔克斯","魔幻现实主义代表作","布恩迪亚家族七代人的传奇故事，以及加勒比海沿岸小镇马孔多的百年兴衰，反映了拉丁美洲一个世纪以来风云变幻的历史，作者也因此获得1982年诺贝尔文学奖。",R.drawable.book12);
        fruitList.add(book_12);
        Book book_13 = new Book("红楼梦","曹雪芹","满纸荒唐言，一把辛酸泪，都云作者痴，谁解其中味","以贾、史、王、薛四大家族的兴衰为背景，以贾府的家庭琐事、闺阁闲情为脉络，以贾宝玉、林黛玉、薛宝钗的爱情婚姻故事为主线，刻画了以贾宝玉和金陵十二钗为中心的正邪两赋有情人的人性美和悲剧美。" +
                "通过家族悲剧、女儿悲剧及主人公的人生悲剧，揭示出封建末世的危机。",R.drawable.book13);
        fruitList.add(book_13);
        Book book_14 = new Book("天黑以后","村上春树","每个人怀有的秘密，不能诉诸语言的秘密，不能谈论的秘密……","映入眼帘的，是都市的身姿。透过在夜空中高翔的飞鸟的眼睛，我们从天上俯瞰着这光景。都市望去仿佛一头巨大的活物，遵循其自身的原理运转。我们的视线选取尤为辉煌灿烂的一角，静静地降落。",R.drawable.book14);
        fruitList.add(book_14);
        Book book_15 = new Book("丰乳肥臀","莫言","你可以不看我所有的作品，但你如果要了解我，应该看我的《丰乳肥臀》","1997年《丰乳肥臀》夺得中国有史以来最高额的“大家文学奖”，获得10万元的奖金。小说热情讴歌了生命最原初的创造者——母亲的伟大、朴素与无私，生命的沿袭的无与伦比的重要意义。" +
                "并且在这一幅生命的流程图中，弥漫着历史与战争的硝烟，真实，不带任何偏见，再现了一段时期内的历史。",R.drawable.book15);
        fruitList.add(book_15);
        Book book_16 = new Book("梦里花落知多少","三毛","即使不成功，也不至于空白","书中先是记录了 三毛与荷西在撒哈拉沙漠结婚，白手成家的生活，而此时她的文学创作生涯也随之开启；后来移居 加纳利群岛后，三毛的生活渐趋安定，她的创作也达到了很高的水平；再后来，荷西在一次潜水时意外去世，三毛的心灵受到巨大创伤，人生陷入低谷。" +
                "一段时间后，三毛再度出走，游历中 南美洲，开始新的生活。而这段经历，也使她的文风发生了一定的转变",R.drawable.book16);
        fruitList.add(book_16);
        Book book_17 = new Book("星空","几米","我们这个年纪，一切皆有可能","《星空》描述了一个关于长大的故事,图画与文字相融合，向我们展现出青春中的甜与涩，现实与梦想：" +
                "女孩与父母的感情生疏，孤僻的她在人群中总会感到莫名的孤单。有一天，隔壁搬进了一个男孩，虽然他总是一个人，但在自己的世界里他快乐地仿佛来自另一个星球。两个孤单的少年成了朋友，他们都无法忍受城市中的无奈与喧杂，于是他们一起离开城市，到达野外，见到了生命中最美的星空……",R.drawable.book17);
        fruitList.add(book_17);
        Book book_18 = new Book("我与地坛","史铁生","万事万物，你若预测它的未来，你就会说它有无数种可能，可你若回过头去看它的以往，你就会知道其实只有一条命定的路","《我与地坛》[2]是史铁生的散文代表作，是他十五年来摇着轮椅在地坛思索的结果，" +
                "文章中饱含了作者对人生的感悟，对亲情的讴歌，朴实的文字间洋溢着作者心灵深处的情感，是一部不可多得的优秀作品。",R.drawable.book18);
        fruitList.add(book_18);
        Book book_19 = new Book("撒哈拉的故事","三毛","“三毛式生活”影响一代人","因为一本地理杂志的吸引，三毛背着行囊走进了荒凉单调的 撒哈拉沙漠，在沙漠中寻找感受生活的真善美，书中每个故事都充溢着一种浪漫、浓情的异域情调，字里行间反映着大沙漠独有的地形地貌与风土人情。",R.drawable.book19);
        fruitList.add(book_19);
        Book book_20 = new Book("生如夏花","泰戈尔","使生如夏花之绚烂，死如秋叶之静美","《生如夏花》（Let life be beautiful like summer flowers ）泰戈尔写的诗歌，收录在《飞鸟集》",R.drawable.book20);
        fruitList.add(book_20);
    }

    public class Book {
        private String name;
        private String author;
        private String sentence;
        private String introduction;
        private int imageId;

        public Book(String name,String author,String sentence,String introduction, int imageId) {
            this.name = name;
            this.author = author;
            this.sentence = sentence;
            this.introduction = introduction;
            this.imageId = imageId;
        }

        public String getAuthor() {
            return author;
        }

        public  String getName(){
            return name;
        }

        public String getSentence(){ return sentence; }

        public String getIntroduction() {
            return introduction;
        }

        public int getImageId() {
            return imageId;
        }

    }

    public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
        private List<Book> mFruitList;

        public class ViewHolder extends RecyclerView.ViewHolder {
            View fruitView;
            ImageView fruitImage;
            TextView fruitName;
            TextView fruitAuthor;
            TextView fruitSentence;
            TextView fruitIntroduction;

            public ViewHolder(View view) {
                super(view);
                fruitView = view;
                fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
                fruitName = (TextView) view.findViewById(R.id.fruit_name);
                fruitAuthor = (TextView) view.findViewById(R.id.book_author);
                fruitSentence = (TextView) view.findViewById(R.id.book_sentence);
                fruitIntroduction = (TextView) view.findViewById(R.id.book_introduction);
            }
        }

        public FruitAdapter(List<Book> fruitList) {
            mFruitList = fruitList;
        }


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, parent, false);
            final  ViewHolder holder = new ViewHolder(view);
            holder.fruitView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    final View vv = v;
                    int position = holder.getAdapterPosition();
                    final Book fruit = mFruitList.get(position);
                    new AlertDialog.Builder(v.getContext())
                            .setTitle("您确定收藏《"+fruit.getName()+"》 这本书吗？")
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            })
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                  /*  db = new dataBase(vv.getContext(),"BookStore.db",null,1);
                                    SQLiteDatabase sql = db.getWritableDatabase();
                                    ContentValues  values= new ContentValues();
                                    values.put("book_name",fruit.getName().toString());
                                    sql.insert("favorite_books",null,values);
                                    sql.close();*/
                                    String FILE_NAME = "book"+fruit.getName().toString()+".txt";
                                    try (FileOutputStream fileOutputStream = openFileOutput(FILE_NAME, MODE_PRIVATE)) {
                                        fileOutputStream.write(fruit.getName().toString().getBytes());
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                        Toast.makeText(getApplicationContext(),"Save successfully",Toast.LENGTH_SHORT).show();
                                    } catch (IOException e) {
                                        Toast.makeText(getApplicationContext(),"Fail to save file",Toast.LENGTH_SHORT).show();
                                    }
                                }
                            })
                            .create().show();
                }
            });
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Book book = mFruitList.get(position);
            holder.fruitImage.setImageResource(book.getImageId());
            holder.fruitName.setText(book.getName());
            holder.fruitAuthor.setText(book.getAuthor());
            holder.fruitSentence.setText(book.getSentence());
            holder.fruitIntroduction.setText(book.getIntroduction());
        }

        @Override
        public int getItemCount() {
            return mFruitList.size();
        }
    }
}

