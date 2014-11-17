test-aspectj
============

Simple demonstration how AspectJ fails in jars, see SO question: http://stackoverflow.com/questions/26802394/running-aspectj-causes-nosuchmethoderror-aspect-aspectof

If the `TraceAspect.java` is in the `annotation` module, then calling `MainActivity.init()` will fail with an `java.lang.NoSuchMethodError: com.test.sample.annotation.TraceAspect.aspectOf` exception.

If the `TraceAspect.java` is moved to the `app` module, then the advised code is executed properly.
