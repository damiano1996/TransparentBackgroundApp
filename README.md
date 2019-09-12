# TRANSPARENT BACKGROUND EFFECT

Simple and easy to use library to apply in your Activity a transparency effect.
This library implement this project: [BlurImage](https://github.com/sparrow007/BlurImage)

![alt text](http://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170115.png)
![alt text](http://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170100.png)
![alt text](http://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170139.png)
![alt text](http://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170206.png)


# USAGE
-----
 
## Gradle
------

#### Step #1. Add the dependency

```
dependencies {
    ...
    compile 'com.github.damiano996:transparentbackground:0.1.0'
}
```

#### Step #2. Add the below lines on app module build.gradle file.

```groovy
defaultConfig {
    ...
    renderscriptTargetApi 19
    renderscriptSupportModeEnabled true
}
```

# IMPLEMENTATION
----
In your Activity add the line:

```java
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transparentBackground(this, 10);
    }
```
