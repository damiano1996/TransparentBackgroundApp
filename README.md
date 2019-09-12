# TRANSPARENT BACKGROUND EFFECT

Simple and easy to use library to apply in your Activity a transparency effect.
This library implement this project: [BlurImage](https://github.com/sparrow007/BlurImage)

<table style="width:100%">
  <tr>
    <th><img src="http://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170115.png" width="200"></th>
    <th><img src="http://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170100.png" width="200"></th>
  </tr>
  <tr>
    <td><img src="http://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170139.png" width="200"></td>
    <td><img src="http://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170206.png" width="200"></td>
  </tr>
</table>


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
