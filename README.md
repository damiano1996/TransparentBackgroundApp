# TRANSPARENT BACKGROUND EFFECT

Simple and easy to use library to apply in your Activity a transparency effect.

This library implement this project: [BlurImage](https://github.com/sparrow007/BlurImage)

<table style="width:100%">
  <tr>
    <th><img src="https://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170115.png" width="200"></th>
    <th><img src="https://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170100.png" width="200"></th>
  </tr>
  <tr>
    <td><img src="https://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170139.png" width="200"></td>
    <td><img src="https://circleforcerevenge.altervista.org/GitHubImages/transparentbackground/Screenshot_20190912-170206.png" width="200"></td>
  </tr>
</table>


# USAGE
 
## Gradle
------

#### Step #1. Add in Project build.gradle

```
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" }
 }
}
```

#### Step #2. Add the dependency

```
dependencies {
    ...
    implementation 'com.github.damiano9669:TransparentBackgroundApp:v0.1.2'
}
```

#### Step #3. Add the below lines on app module build.gradle file.

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

        transparentBackground(this, 10); // add this line
    }
```
