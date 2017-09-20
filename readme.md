##通用Popwindow
平时使用Popwindow的频率还是蛮高的，为了避免每次使用都单独创建浪费时间，浪费精力所以封装了一个通用的Popwindow
使用效果图
![mahua](http://img.blog.csdn.net/20170920152747135?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZmFuZW5xaWFu/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

使用方法：
``` java
 CustomPopupWindow customPopupWindow = new CustomPopupWindow.Builder()
                        .with(MainActivity.this)
                        .setContentView(R.layout.pop_view)
//                        .setwidth(100)
//                        .setheight(100)
                        .setBackGroudAlpha(MainActivity.this, 0.7f)
                        .setAnimationStyle(CustomPopupWindow.Builder.STYLE2)
                        .setFouse(true)
                        .setOutSideCancel(true)
                        .builder().showAsLaction(view, Gravity.CENTER, 0, 0);
```

##MaHua有哪些功能？

| Name | Academy | score | 
 | - | :-: | -: | 
 | Harry Potter | Gryffindor| 90 | 
 | Hermione Granger | Gryffindor | 100 | 
 | Draco Malfoy | Slytherin | 90 |
table

* 方便的`导入导出`功能
    *  直接把一个markdown的文本文件拖放到当前这个页面就可以了
    *  导出为一个html格式的文件，样式一点也不会丢失
* 编辑和预览`同步滚动`，所见即所得（右上角设置）
* `VIM快捷键`支持，方便vim党们快速的操作 （右上角设置）
* 强大的`自定义CSS`功能，方便定制自己的展示
* 有数量也有质量的`主题`,编辑器和预览区域
* 完美兼容`Github`的markdown语法
* 预览区域`代码高亮`
* 所有选项自动记忆

##有问题反馈
在使用中有任何问题，欢迎反馈给我，可以用以下联系方式跟我交流

* 邮件(dev.hubo#gmail.com, 把#换成@)
* QQ: 287759234
* weibo: [@草依山](http://weibo.com/ihubo)
* twitter: [@ihubo](http://twitter.com/ihubo)

##捐助开发者
在兴趣的驱动下,写一个`免费`的东西，有欣喜，也还有汗水，希望你喜欢我的作品，同时也能支持一下。
当然，有钱捧个钱场（右上角的爱心标志，支持支付宝和PayPal捐助），没钱捧个人场，谢谢各位。

##感激
感谢以下的项目,排名不分先后

* [mou](http://mouapp.com/) 
* [ace](http://ace.ajax.org/)
* [jquery](http://jquery.com)

##关于作者

```javascript
  var ihubo = {
    nickName  : "草依山",
    site : "http://jser.me"
  }
```