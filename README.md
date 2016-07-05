# [jjdxm_simijkplayer][project] #
## Introduction ##

## Features ##

1. base on simijkplayer,support RTMP , HLS (http & https) , MP4,M4A etc.
2. gestures for volume control
3. gestures for brightness control
4. gestures for forward or backward
5. fullscreen by manual or sensor
6. try to replay when error(only for live video)
7. set video scale type (double click video will switch the scale types in app,you can find the difference)
    1. fitParent:可能会剪裁,保持原视频的大小，显示在中心,当原视频的大小超过view的大小超过部分裁剪处理
    2. fillParent:可能会剪裁,等比例放大视频，直到填满View为止,超过View的部分作裁剪处理
    3. wrapContent:将视频的内容完整居中显示，如果视频大于view,则按比例缩视频直到完全显示在view中
    4. fitXY:不剪裁,非等比例拉伸画面填满整个View
    5. 16:9:不剪裁,非等比例拉伸画面到16:9,并完全显示在View中
    6. 4:3:不剪裁,非等比例拉伸画面到4:3,并完全显示在View中

## Screenshots ##

<img src="https://raw.githubusercontent.com/jjdxmashl/jjdxm_simijkplayer/master/screenshots/icon01.png" width="300"> 
<img src="https://raw.githubusercontent.com/jjdxmashl/jjdxm_simijkplayer/master/screenshots/icon02.png" width="300"> 
 
## Download ##

[demo apk下载][downapk]

[下载最新版本aar][lastaar]

[下载最新版本jar][lastjar]

Download or grab via Maven:

	<dependency>
	  <groupId>com.dou361.simijkplayer</groupId>
	  <artifactId>jjdxm-simijkplayer</artifactId>
	  <version>x.x.x</version>
	</dependency>

or Gradle:

	compile 'com.dou361.simijkplayer:jjdxm-simijkplayer:x.x.x'


jjdxm-simijkplayer requires at minimum Java 15 or Android 4.0.

## Get Started ##

* `play(url)` //play video
* `stop()` //stop play
* `pause()`
* `start()` 
* `forward()` // forward or back,example: forward(0.1f) forward(-0.1f)
* `getCurrentPosition()`
* `setScaleType()`
* `toggleAspectRatio()`
* `seekTo()` //seek to specify position
* `getDuration()` //get video duration
* `onInfo()` //callback when have some information
* `onError()` 
* `onComplete()`
* `onControlPanelVisibilityChange()` //callback when control panel visibility

## More Actions ##

## ChangeLog ##

## About Author ##

#### 个人网站:[http://www.dou361.com][web] ####
#### GitHub:[jjdxmashl][github] ####
#### QQ:316988670 ####
#### 交流QQ群:548545202 ####


## License ##

    Copyright (C) dou361, The Framework Open Source Project
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
     	http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## (Frequently Asked Questions)FAQ ##
## Bugs Report and Help ##

If you find any bug when using project, please report [here][issues]. Thanks for helping us building a better one.




[web]:http://www.dou361.com
[github]:https://github.com/jjdxmashl/
[project]:https://github.com/jjdxmashl/jjdxm_simijkplayer/
[issues]:https://github.com/jjdxmashl/jjdxm_simijkplayer/issues/new
[downapk]:https://raw.githubusercontent.com/jjdxmashl/jjdxm_simijkplayer/master/apk/app-debug.apk
[lastaar]:https://raw.githubusercontent.com/jjdxmashl/jjdxm_simijkplayer/master/release/jjdxm-simijkplayer-1.0.0.aar
[lastjar]:https://raw.githubusercontent.com/jjdxmashl/jjdxm_simijkplayer/master/release/jjdxm-simijkplayer-1.0.0.jar
[icon01]:https://raw.githubusercontent.com/jjdxmashl/jjdxm_simijkplayer/master/screenshots/icon01.png
[icon02]:https://raw.githubusercontent.com/jjdxmashl/jjdxm_simijkplayer/master/screenshots/icon02.png
