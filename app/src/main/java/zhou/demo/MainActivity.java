package zhou.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.zzhoujay.richtext.RichText;


public class MainActivity extends AppCompatActivity {


    private static final String IMAGE = "<img title=\"\" src=\"http://g.hiphotos.baidu.com/image/pic/item/241f95cad1c8a7866f726fe06309c93d71cf5087.jpg\"  style=\"cursor: pointer;\"><br><br>" +
            "<img src=\"http://img.ugirls.com/uploads/cooperate/baidu/20160519menghuli.jpg\" width=\"1080\" height=\"1620\"/><a href=\"http://www.baidu.com\">baidu</a>" +
            "hello asdkjfgsduk <a href=\"http://www.jd.com\">jd</a>";
    private static final String IMAGE1 = "<h1>RichText</h1><p>Android平台下的富文本解析器</p><img title=\"\" src=\"http://g.hiphotos.baidu.com/image/pic/item/241f95cad1c8a7866f726fe06309c93d71cf5087.jpg\"  style=\"cursor: pointer;\"><br><br>" +
            "<h3>点击菜单查看更多Demo</h3><img src=\"http://ww2.sinaimg.cn/bmiddle/813a1fc7jw1ee4xpejq4lj20g00o0gnu.jpg\" /><p><a href=\"http://www.baidu.com\">baidu</a>" +
            "hello asdkjfgsduk <a href=\"http://www.jd.com\">jd</a></p><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>bottom";

    private static final String TT = "<p>每天看你们发说说，我都好羡慕 。你们长得又好看 ，还用智能手机，又有钱，整天讨论一些好像很厉害的东西。随便拿个东西都顶我几个月的生活费，我读书少，又是乡下来的，没见过多少世面，所以我只能默默的看着你发，时不时点个赞。<img src=\"http://img.baidu.com/hi/jx2/j_0002.gif\"/></p><p><br/></p><p><br/></p><p><span style=\"text-decoration: line-through; color: rgb(255, 0, 0);\\\"><em><strong>上班路上还打醒精神，如今江湖险恶，到处都是坏人。</strong></em></span></p><p><img src=\"http://210.51.17.150:8090/files/lechu/20160528142627980669386.jpg\" title=\"20160528142627980669386.jpg\" alt=\"P60519-154052.jpg\"/></p><p><span style=\"color: rgb(146, 208, 80); text-decoration: none;\">在街上经常会遇到偷偷问你要不要手机的，现在太可怕了，直接明目张胆推销人体器官了，刚才走路无意碰了一女的，还没来得及说对不起，那女的竟然大声问我要不要脸！</span></p>";

    private static final String GIF_TEST = "<img src=\"http://ww4.sinaimg.cn/large/5cfc088ejw1f3jcujb6d6g20ap08mb2c.gif\">";

    private static final String markdown_test = "image:![image](http://image.tianjimedia.com/uploadImages/2015/129/56/J63MI042Z4P8.jpg)\n[link](https://github.com/zzhoujay/RichText/issues)";

    private static final String gif_test = "<h3>Test1</h3><img src=\"http://www.aikf.com/ask/resources/images/facialExpression/qq/1.gif\" />" +
            "            <h3>Test2</h3><img src=\"http://www.aikf.com/ask/resources/images/facialExpression/qq/2.gif\" />" +
            "            <h3>Test3</h3><img src=\"http://www.aikf.com/ask/resources/images/facialExpression/qq/3.gif\" />" +
            "            <h3>Test4</h3><img src=\"http://www.aikf.com/ask/resources/images/facialExpression/qq/4.gif\" />" +
            "            <h3>Test5</h3><img src=\"http://www.aikf.com/ask/resources/images/facialExpression/qq/5.gif\" />" +
            "            <h3>Test6</h3><img src=\"http://www.aikf.com/ask/resources/images/facialExpression/qq/6.gif\" />" +
            "            <h3>Test7</h3><img src=\"http://www.aikf.com/ask/resources/images/facialExpression/qq/7.gif\" />" +
            "            <h3>Test8</h3><img src=\"http://www.aikf.com/ask/resources/images/facialExpression/qq/8.gif\" />" +
            "            <h3>Test9</h3><img src=\"http://www.aikf.com/ask/resources/images/facialExpression/qq/9.gif\" />";

    private static final String list_test = "<ol>\n" +
            "   <li>Coffee</li>\n" +
            "   <li>Tea</li>\n" +
            "   <li>Milk</li>\n" +
            "</ol>\n" +
            "\n" +
            "<ul>\n" +
            "   <li>Coffee</li>\n" +
            "   <li>Tea</li>\n" +
            "   <li>Milk</li>\n" +
            "</ul>";

    private static final String large_image = "<img src=\"http://static.tme.im/article_1_1471686391302fue\"/>";

    private static final String text = "";

    private static final String big_image_test = "汉仪喵魂体！<br>自己写了小半年的手写字体刚上线，自我感觉还是值得推荐的！<br>我先给大家图文并茂地讲讲这字儿怎么值得推荐！<br><img src=\"https://pic3.zhimg.com/b6a1334f561eb6f388d5321402ee6c0e_b.jpg\" data-rawwidth=\"800\" data-rawheight=\"3266\" class=\"origin_image zh-lightbox-thumb\" width=\"800\" data-original=\"https://pic3.zhimg.com/b6a1334f561eb6f388d5321402ee6c0e_r.jpg\"/><img src=\"https://pic3.zhimg.com/13fc1f61deeea1e4d5b1fd4d36b30b82_b.jpg\" data-rawwidth=\"801\" data-rawheight=\"6071\" class=\"origin_image zh-lightbox-thumb\" width=\"801\" data-original=\"https://pic3.zhimg.com/13fc1f61deeea1e4d5b1fd4d36b30b82_r.jpg\"/><img src=\"https://pic3.zhimg.com/07fcb9ad57c568d2d41466616fdc6022_b.jpg\" data-rawwidth=\"801\" data-rawheight=\"5475\" class=\"origin_image zh-lightbox-thumb\" width=\"801\" data-original=\"https://pic3.zhimg.com/07fcb9ad57c568d2d41466616fdc6022_r.jpg\"/><img src=\"https://pic1.zhimg.com/a5d631cc0a6c9c5b38c6243ef89e1794_b.jpg\" data-rawwidth=\"801\" data-rawheight=\"7352\" class=\"origin_image zh-lightbox-thumb\" width=\"801\" data-original=\"https://pic1.zhimg.com/a5d631cc0a6c9c5b38c6243ef89e1794_r.jpg\"/>";

    private static final String big_image_test_2 = "<img src=\"https://pic1.zhimg.com/00f14a0147fd336a6c34c7817f4f096c_b.jpg\" data-rawwidth=\"801\" data-rawheight=\"3178\" class=\"origin_image zh-lightbox-thumb\" width=\"801\" data-original=\"https://pic1.zhimg.com/00f14a0147fd336a6c34c7817f4f096c_r.jpg\"><img src=\"https://pic2.zhimg.com/0d1a5113e3ea1bb379b56faeba908f71_b.jpg\" data-rawwidth=\"600\" data-rawheight=\"600\" class=\"origin_image zh-lightbox-thumb\" width=\"600\" data-original=\"https://pic2.zhimg.com/0d1a5113e3ea1bb379b56faeba908f71_r.jpg\">啊……<br>最近又有一个字体的想法……<br>还蛮好看……<br>但是写一套太累辣！";



    private final String tt = "hello zz <code>gg</code>" +
            "<ul>" +
            "<li>hello</li>" +
            "<li>world</li>" +
            "<li>world</li>" +
            "<li>world</li>" +
            "<li>world</li>" +
            "<li>world</li>" +
            "<li>world</li>" +
            "<li>gg</li>" +
            "</ul>\n";

    private final String issue142 = "<p><img src=\"http://image.wangchao.net.cn/it/1233190350268.gif?size=528*388\" width=\"528\" height=\"388\" /></p>";

    private final String issue143 = "<img src=\"file:///C:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\ksohtml\\wpsB8DD.tmp.png\">";

    private final String issue147 = "<div class=\"pictureBox\"> \n" +
            " <img src=\"http://static.storeer.com/wlwb/productDetail/234be0ec-e90a-4eda-90bd-98d64b55280a_580x4339.jpeg\">\n" +
            "</div>";

    private final String issue149 = null;

    private final String issue150 = "<img src='http://cuncxforum-10008003.image.myqcloud.com/642def77-373f-434f-8e68-42dedbd9f880'/><br><img src='http://cuncxforum-10008003.image.myqcloud.com/bf153d9f-e8c3-4dcc-a23e-bfe0358cb429'/>";


    private final String issue177 = "<i class=\"pstatus\"> 本帖最后由 CS古月 于 2017-07-17 14:15 编辑 </i><br /><br /><p>  	  " +
            "这段时间经过多位龙空好友的建议反馈，龙的天空安卓版app终于要发布正式版本了，" +
            "在此先谢谢那些为这个app辛苦测试并提供多方建议的龙友们，感谢！  " +
            "</p>  <h3><strong><span style=\"color:rgb(0,0,255);\">正式版V1.0.0功能介绍：</span></strong></h3>  <ul>  	" +
            "<li><strong>首页帖子：</strong>对应龙空网站首页，分有信息流、主题、精华和热门列表；</li>  	" +
            "<li><strong>版块：</strong>暂时有滑动和九空格两种模式，可以在界面右上角切换；</li>  	<li><strong>消息：" +
            "</strong>可以查看评分、私信、通知及@我的所有消息；</li>  	<li><strong>个人我的资料：" +
            "</strong>可以进行签到，查看主题、收藏、帖子、关注、粉丝及浏览历史资料，点击头像还<span style=\"color:rgb(255,0,0);\">" +
            "可以设置用户头像</span>、性别、头衔、个人介绍及<span style=\"color:rgb(0,0,255);\">小尾巴</span>内容；</li>  " +
            "	<li><strong>搜索：</strong>可以进行帖子/用户/位面的搜索，" +
            "而且可以像网站一样进行热度、时间及相关度的排序选择，还能保存搜索历史；</li>  	" +
            "<li><strong>回复评论及发帖：</strong>回复评论和发贴可以<strong><span style=\"color:rgb(255,0,0);\">" +
            "发表情图片</span></strong>，而且还可以像网站一样字体加粗斜体、分段及发超链接等；</li>  " +
            "	<li><strong>帖子详情：</strong>除了帖子正常的样式外，还有评分、回复及编辑功能；而且还可以调整字体的大小，" +
            "分享帖子内容及选择用浏览器打开帖子；</li>  	<li><strong><span style=\"color:rgb(84,141,212);\">优书网：" +
            "</span></strong>app还接入了优书网的内容，帖子内点击书名可以直接跳到优书网，" +
            "我的界面也可以进入优书网首页，<strong>优书网只要登录一次，则可以长期免登</strong>；</li>  <li><strong>设置：" +
            "</strong>可以切换日夜间模式，可以设置自动签到、清除缓存及版块显示模式；</li>  </ul>  <h4><strong>预定下一版功能：" +
            "</strong></h4>  <ul>  	<li>版块列表区别关注和未关注版块；</li>  	<li>多账号切换；</li>  	<li>增加主题；</li>  	" +
            "<li>优化消息提醒模式；</li>  	<li>位面功能；</li>  </ul>  <p>  	<strong><span " +
            "style=\"background-color:rgb(255,255,255);\">百度网盘下载地址：<a target=\"_blank\"href=\"https://pan.baidu.com/s/1hsACaRq\">" +
            "https://pan.baidu.com/s/1hsACaRq</a></span></strong>  </p>  <p>  	<strong><span style=\"background-color: rgb(255, 255, 255);\">" +
            "蒲公英下载地址：<a target=\"_blank\"href=\"https://www.pgyer.com/1duS\">https://www.pgyer.com/1duS</a></span></strong>  </p>  <p> " +
            " 	<strong>各大市场因为需要账号申请及审核，可能要过两天才能在市场上看到下载。  </strong>  </p>  <p>  	<strong><br>  	</strong> " +
            " </p>  <p>  	如果大家还有什么功能及建议想在之后的版块迭代中出现的，可以反馈给我，<strong><span style=\"color: rgb(255, 0, 0);\">" +
            "反馈Q群：650097719</span></strong><strong><br>  	</strong>  </p> ";

    private static final String assets_image_test = "<h1>Assets Image Test</h1><img src=\"file:///android_asset/doge.jpg\">";
    private static final String html = "<article class=\"markdown-body entry-content\" itemprop=\"text\"><h1><a href=\"#richtext\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-richtext\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>RichText</h1>\n" +
            "<blockquote>\n" +
            "<p style=\"background-color:rgba(255,0,0,1);\">Android平台下的富文本解析器</p>\n" +
            "</blockquote>\n" +
            "<ul>\n" +
            "<li>流式操作</li>\n" +
            "<li>低侵入性</li>\n" +
            "<li>依赖少，只依赖了<code>disklrucache</code>和<code>support v4</code></li>\n" +
            "<li>支持Html和Markdown格式文本</li>\n" +
            "<li>支持图片点击和长按事件</li>\n" +
            "<li>链接点击事件和长按事件</li>\n" +
            "<li>支持设置加载中和加载错误时的图片</li>\n" +
            "<li>支持自定义超链接的点击回调</li>\n" +
            "<li>支持修正图片宽高</li>\n" +
            "<li>支持GIF图片</li>\n" +
            "<li>支持Base64编码、本地图片和Assets目录图片</li>\n" +
            "<li>自持自定义图片加载器、图片加载器</li>\n" +
            "<li>支持内存和磁盘双缓存</li>\n" +
            "</ul>\n" +
            "<h3><a href=\"#效果\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-效果\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>效果</h3>\n" +
            "<p><a href=\"/zzhoujay/RichText/blob/master/image/image.jpg\" target=\"_blank\"><img src=\"/zzhoujay/RichText/raw/master/image/image.jpg\" alt=\"演示\" title=\"演示\" style=\"max-width:100%;\"></a></p>\n" +
            "<h3><a href=\"#gradle中引用的方法\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-gradle中引用的方法\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>gradle中引用的方法</h3>\n" +
            "<pre><code>compile 'com.zzhoujay.richtext:richtext:3.0.5'\n" +
            "</code></pre>\n" +
            "<h3><a href=\"#关于issue\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-关于issue\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>关于issue</h3>\n" +
            "<p style=\"text-indent:50px;\">最近一段时间会比较忙，issue不能及时处理，一般会定时抽空集中解决issue，但时间有限解决速度上不敢保证。</p>\n" +
            "<p>欢迎提交pull request帮助完善这个项目</p>\n" +
            "<h3><a href=\"#注意\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-注意\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>注意</h3>\n" +
            "<p>在第一次调用RichText之前先调用<code>RichText.initCacheDir()</code>方法设置缓存目录</p>\n" +
            "<p>ImageFixCallback的回调方法不一定是在主线程回调，注意不要进行UI操作</p>\n" +
            "<p>本地图片由根路径<code>\\</code>开头，Assets目录图片由<code>file:///android_asset/</code>开头</p>\n" +
            "<p>Gif图片播放不支持硬件加速，若要使用Gif图片请先关闭TextView的硬件加速</p>\n" +
            "<pre><code>textView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);\n" +
            "</code></pre>\n" +
            "<h3><a href=\"#使用方式\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-使用方式\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>使用方式</h3>\n" +
            "<p><a href=\"https://github.com/zzhoujay/RichText/wiki\">多看wiki</a>、<a href=\"https://github.com/zzhoujay/RichText/wiki\">多看wiki</a>、<a href=\"https://github.com/zzhoujay/RichText/wiki\">多看wiki</a>，重要的事情说三遍</p>\n" +
            "<h3><a href=\"#后续计划\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-后续计划\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>后续计划</h3>\n" +
            "<ul>\n" +
            "<li><del>添加自定义标签的支持</del> (已添加对少部分自定义标签的支持)</li>\n" +
            "</ul>\n" +
            "<h3><a href=\"#关于markdown\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-关于markdown\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>关于Markdown</h3>\n" +
            "<p>Markdown源于子项目：<a href=\"https://github.com/zzhoujay/Markdown\">Markdown</a></p>\n" +
            "<p>若在markdown解析过程中发现什么问题可以在该项目中反馈</p>\n" +
            "<h3><a href=\"#富文本编辑器\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-富文本编辑器\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>富文本编辑器</h3>\n" +
            "<p>编辑功能目前正在开发中，<a href=\"https://github.com/zzhoujay/RichEditor\">RichEditor</a></p>\n" +
            "<h3><a href=\"#具体使用请查看demo\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-具体使用请查看demo\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>具体使用请查看demo</h3>\n" +
            "<p><a href=\"https://github.com/zzhoujay/RichText/blob/master/app/src/main/java/zhou/demo/ListViewActivity.java\">ListView Demo</a>、\n" +
            "<a href=\"https://github.com/zzhoujay/RichText/blob/master/app/src/main/java/zhou/demo/RecyclerViewActivity.java\">RecyclerView Demo</a>、\n" +
            "<a href=\"https://github.com/zzhoujay/RichText/blob/master/app/src/main/java/zhou/demo/GifActivity.java\">Gif Demo</a></p>\n" +
            "<h3><a href=\"#license\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-license\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>License</h3>\n" +
            "<pre><code>The MIT License (MIT)\n" +
            "\n" +
            "Copyright (c) 2016 zzhoujay\n" +
            "\n" +
            "Permission is hereby granted, free of charge, to any person obtaining a copy\n" +
            "of this software and associated documentation files (the \"Software\"), to deal\n" +
            "in the Software without restriction, including without limitation the rights\n" +
            "to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n" +
            "copies of the Software, and to permit persons to whom the Software is\n" +
            "furnished to do so, subject to the following conditions:\n" +
            "\n" +
            "The above copyright notice and this permission notice shall be included in all\n" +
            "copies or substantial portions of the Software.\n" +
            "\n" +
            "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
            "\n" +
            "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
            "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
            "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
            "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n" +
            "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\n" +
            "SOFTWARE.\n" +
            "</code></pre>\n" +
            "<p><em>by zzhoujay</em></p>\n" +
            "</article>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Glide.with(this).from("").sizeMultiplier(
        RichText.initCacheDir(this);
        final TextView textView = (TextView) findViewById(R.id.text);


        RichText.from(html).into(textView);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, "RecyclerView");
        menu.add(0, 1, 1, "ListView");
        menu.add(0, 2, 2, "Gif");
        menu.add(0, 3, 3, "Test");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 0) {
            startActivity(new Intent(this, RecyclerViewActivity.class));
        } else if (item.getItemId() == 1) {
            startActivity(new Intent(this, ListViewActivity.class));
        } else if (item.getItemId() == 2) {
            startActivity(new Intent(this, GifActivity.class));
        } else if (item.getItemId() == 3) {
            startActivity(new Intent(this, TestActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RichText.recycle();
    }
}
