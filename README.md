#### [HIRE US](http://vrgsoft.net/)
# ParallaxView
View container which applies parallax effect to its content.
You can Even achieve 3d effect if you use two containers, one atop another like on video below.</br></br>
<img src="https://github.com/VRGsoftUA/ParallaxView/blob/master/scroll1.gif" width="270" height="480" />
<img src="https://github.com/VRGsoftUA/ParallaxView/blob/master/scroll2.gif" width="270" height="480" />
# Usage
This view works only in scrollable containers (like RecyclerView, ListView, ScrollView etc).
Its also possible to achieve parallax scrolling in two directions simultaneously (of course, if your parent container supports bi-directional scrolling)
*For a working implementation, Have a look at the Sample Project - app*
1. Include the library as local library project.
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
dependencies {
    implementation 'com.github.VRGsoftUA:ParallaxView:1.0'
}
```
2. Include ParallaxView class in your xml layout. For Example:
```
<net.vrgsoft.parallaxview.ParallaxView
        app:isInvertedVerticalParallax="true"
        app:isInvertedHorizontalParallax="true"
        app:decelerateFactor="0.4"
        app:parallaxScale="2"
        app:isNeedScale="true"
        android:layout_width="300dp"
        android:layout_height="200dp">
        <android.support.v7.widget.AppCompatImageView
            android:id="@+id/ivImage"
            android:scaleType="centerCrop"
            android:layout_width="300dp"
            android:background="@drawable/sherlok_back"
            android:layout_height="200dp"
            tools:src="@drawable/sherlok_back"/>
    </net.vrgsoft.parallaxview.ParallaxView>
```
# Customization
| Attribute | Description |
| ------------- | ------------- |
| app:isEnabledHorizontalParallax | Enables or disables horizontal parallax effect |
| app:isEnabledVerticalParallax | Same as isEnabledHorizontalParallax but vertical |
| app:isInvertedHorizontalParallax | If true direction of the parallax effect will be opposite to scroll direction |
| app:isInvertedVerticalParallax | Same as isInvertedHorizontalParallax but vertical |
| app:isNeedScale | Defines whether scale need to be applied |
| app:decelerateFactor | Possibles values: from 0 to 1. The bigger the value the faster will be moving the parallax effect |
| app:parallaxScale | Scale value applied to the whole ParallaxView. Default is 1.5. Do nothing if isNeedScale set to false |

You can also change this attributes in runtime through methods
#### Contributing
* Contributions are always welcome
* If you want a feature and can code, feel free to fork and add the change yourself and make a pull request
