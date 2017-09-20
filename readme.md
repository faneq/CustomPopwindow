## 基于通用Popwindow</br>
平时使用Popwindow的频率还是蛮高的，为了避免每次使用都单独创建浪费时间，浪费精力所以封装了一个通用的Popwindow
使用效果图</br>
![mahua](http://img.blog.csdn.net/20170920163812860?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZmFuZW5xaWFu/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

## 使用方法：
``` java
 CustomPopupWindow customPopupWindow = new CustomPopupWindow.Builder()
                        .with(MainActivity.this)
                        .setContentView(R.layout.pop_view)
                        .setwidth(100)
                        .setheight(100)
                        .setBackGroudAlpha(MainActivity.this, 0.7f)
                        .setAnimationStyle(CustomPopupWindow.Builder.STYLE2)
                        .setFouse(true)
                        .setOutSideCancel(true)
                        .builder().showAsLaction(view, Gravity.CENTER, 0, 0);
```


| 方法名 | 功能 |  
 | - |  -: | 
 | Builder().with(Context context)  | 初始化Builder对象 | 
 | setContentView(int contentviewid) |设置Popwindow 布局| 
 | setwidth(int width) | 设置宽度|
 |  setheight(int height) | 设置高度|
 | setBackGroudAlpha(Activity activity, float alpha) |设置Popwindow背景颜色 |
 | setAnimationStyle(int animstyle) | 设置展示动画|
 | setFouse(boolean fouse) |聚焦Popwindow|
 | setOutSideCancel(boolean outsidecancel)|是否点击Popwindow以外关闭Popwindow|
 | builder（）| 初始化Popwindow |
 | showAsLaction(int rootviewid, int gravity, int x, int y)| 显示Popwindow|
 | showAtLocation（int targetviewId, int gravity, int offx, int offy） |  显示Popwindow|
 |setOnFocusListener(int viewid, View.OnFocusChangeListener listener)|根据id设置焦点监听|
 |setOnClickListener(int viewid, View.OnClickListener listener)|根据id设置点击事件监听|
 |getItemView(int viewid)|根据id获取view|
 |dismiss()|关闭pop|
 
