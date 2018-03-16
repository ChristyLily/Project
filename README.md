<iLibrary>一款简单大方的APP<br>
  ====<br>
    一、背景<br>
    此应用致力于设计一款适用于全年龄客户的阅读软件，目标是让想要读书的大家能够更快地匹配到适合自己的书籍，同时为了大家不要错过在阅读的过程中的灵感和想法，也设计了提供给大家的一个阅读后能够记录自己的心得和评价的平台。同时也便于系统地管理心得，而不至于想找之前写过的心得却找不到。由于个人技术有限，边学边做，因此有些地方做得不是很好，甚至一些之前的想法也没有全部实现出来，但是还是要不断学习，所以才把它放到github上面，也欢迎大家的建议和指导。<br>
    二、工具&环境<br>
    *工具：Android Studio 3.0、sdk 25、集成了Apache、MySQL和Tomcat的xampp<br>
    *环境：window 10<br>
    三、界面功能介绍<br>
    *以下分别为登录界面、注册界面、还有主界面<br>
![登录界面](https://github.com/ChristyLily/Project/raw/master/pics/Login.png)
![注册界面](https://github.com/ChristyLily/Project/raw/master/pics/Login.png)
  <br>
 ![主界面](https://github.com/ChristyLily/Project/raw/master/pics/main.png)<br>
    *第一个功能是推荐书单，通过后台获取一定数量的书单，每本书有作者以及介绍等等，技术上使用了recycleView实现向上向下滑动，同时每个item添加了点击事件，用toast来显示信息，是否收藏书籍<br>
 ![推荐书单](https://github.com/ChristyLily/Project/raw/master/pics/booklist.png)
 ![收藏书籍](https://github.com/ChristyLily/Project/raw/master/pics/collect.png)
    *第二个功能是将第一个功能收藏的书单进行罗列，便于用户知道自己想要读的书单列表<br>
 ![我的书单](https://github.com/ChristyLily/Project/raw/master/pics/collection.png)<br>
    *第三个功能是书评摘要收集地方，使用的技术主要有文件的读取与写入，用到了本地的SQLite，具体利用Context类中的openFileOutput()方法和openFileInput()方法来读取写入文件。<br>
 ![书评摘要](https://github.com/ChristyLily/Project/raw/master/pics/comment.png)
 ![书评摘要](https://github.com/ChristyLily/Project/raw/master/pics/comments.png)<br>
    *附加侧滑菜单，直接使用Android已有的模板即可，侧滑菜单上面的用户图片可以自己换等等（这个还没实现），不过做法很简单，可以通过构建Intent对象，指定action为android.intent.action.GET_CONTENT，调用本机的相册。<br>
 ![侧滑菜单](https://github.com/ChristyLily/Project/raw/master/pics/cehua.png)<br>
    四、心得体会<br>
    不得不说，作为新手来做app很有难度，一开始不知道怎么下手，多亏我的好友以及书上、网上的资料，慢慢地开始创建活动，使用布局，使用基本控件到一些功能更强大的控件，比如listView跟recycleView等等，慢慢地熟悉起来了，而且看着成果也觉得很有成就感，尽管还是新手，但是对安卓开发却越来越有兴趣，这学期也为了学习安卓专门选了安卓应用开发与设计的课程，希望能够学习到更多关于安卓的知识。
