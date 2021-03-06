Android Dagger2.0+Robolectric3.0
===================
This is a simple Android app that uses [Dagger 2.0](http://google.github.io/dagger/) and [Robolectric 3.0](http://robolectric.org/) .

To avoid red lines on Android Studio while building Components on Robolectric tests I'm using a workaround solution [Dagger2Helper](https://github.com/konmik/Dagger2Example/blob/master/app/src/main/java/info/android15/dagger2example/Dagger2Helper.java) by [Konstantin](https://github.com/konmik). 
The line below is going to be red on Android Studio since it can't find ```javaDaggerTestComponent```  but it will run without issues. 
```java
((App)RuntimeEnvironment.application).setComponent(DaggerTestComponent.builder().testModule(new TestModule()).build());
``` 
Using ```javaDagger2Helper```
```java
((App)RuntimeEnvironment.application).setComponent(Dagger2Helper.buildComponent(TestComponent.class, new TestModule()));
```
<br>
> **References:**

> - http://code.tutsplus.com/tutorials/dependency-injection-with-dagger-2-on-android--cms-23345
> - https://github.com/mgrzechocinski/dagger2-example
> - http://fernandocejas.com/2015/04/11/tasting-dagger-2-on-android/
> - https://www.youtube.com/watch?v=oK_XtfXPkqw
> - http://www.future-processing.pl/blog/android-testing-with-espresso-2-and-dagger-2-mocking-long-running-operations/
> - https://github.com/FutureProcessing/AndroidEspressoIdlingResourcePlayground
> - https://github.com/chiuki/android-test-demo
> - https://github.com/tomrozb/dagger-testing
> - https://github.com/ecgreb/dagger-2-testing-demo
> - https://github.com/rafaeltoledo/dagger2-tdc2015
> - http://www.future-processing.pl/blog/android-testing-with-espresso-2-and-dagger-2-mocking-long-running-operations/
> - https://github.com/FutureProcessing/AndroidEspressoIdlingResourcePlayground
> - https://blog.gouline.net/2015/05/04/dagger-2-even-sharper-less-square/
> - https://github.com/konmik/konmik.github.io/wiki/Snorkeling-with-Dagger-2
> - https://github.com/bryanstern/dagger-instrumentation-example
> - https://bitbucket.org/hvisser/android-apt/issues/22/dagger-robolectric-gradle-apt-source-not
> - http://engineering.circle.com/instrumentation-testing-with-dagger-mockito-and-espresso/