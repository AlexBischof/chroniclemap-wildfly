This repository serves as example for a ClassNotFoundException with chronicle value types when chroniclemap is filled within 
an external process and afterwards reused within JavaEE.

#### Usage

 - Create chroniclemap file *test.dat* via *MyMap.main* in the postalcodes module
 - mvn clean install
 - cd wildfly
 - mvn wildfly:run


>[0m[0m23:27:44,889 INFO  [stdout] (ServerService Thread Pool -- 58) true
>[0m[31m23:27:45,484 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Heap.java:12: error: cannot find symbol
>[0m[31m23:27:45,484 ERROR [stderr] (ServerService Thread Pool -- 58) import net.openhft.chronicle.core.Jvm;
>[0m[31m23:27:45,484 ERROR [stderr] (ServerService Thread Pool -- 58)                                  ^
>[0m[31m23:27:45,484 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   class Jvm
>[0m[31m23:27:45,484 ERROR [stderr] (ServerService Thread Pool -- 58)   location: package net.openhft.chronicle.core
>[0m[31m23:27:45,496 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Heap.java:23: error: cannot find symbol
>[0m[31m23:27:45,496 ERROR [stderr] (ServerService Thread Pool -- 58)       Field theUnsafe = Jvm.getField(Unsafe.class, "theUnsafe");
>[0m[31m23:27:45,496 ERROR [stderr] (ServerService Thread Pool -- 58)                         ^
>[0m[31m23:27:45,497 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   variable Jvm
>[0m[31m23:27:45,497 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Heap
>[0m[31m23:27:45,499 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Heap.java:25: error: cannot find symbol
>[0m[31m23:27:45,499 ERROR [stderr] (ServerService Thread Pool -- 58)       valueOffset = UNSAFE.objectFieldOffset(Jvm.getField(LongValue$$Heap.class, "__fieldvalue"));
>[0m[31m23:27:45,499 ERROR [stderr] (ServerService Thread Pool -- 58)                                              ^
>[0m[31m23:27:45,499 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   variable Jvm
>[0m[31m23:27:45,499 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Heap
>[0m[31m23:27:45,538 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:14: error: cannot find symbol
>[0m[31m23:27:45,538 ERROR [stderr] (ServerService Thread Pool -- 58) public class LongValue$$Native implements LongValue, Copyable<LongValue>, BytesMarshallable, Byteable {
>[0m[31m23:27:45,538 ERROR [stderr] (ServerService Thread Pool -- 58)                                           ^
>[0m[31m23:27:45,538 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol: class LongValue
>[0m[31m23:27:45,539 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:14: error: cannot find symbol
>[0m[31m23:27:45,539 ERROR [stderr] (ServerService Thread Pool -- 58) public class LongValue$$Native implements LongValue, Copyable<LongValue>, BytesMarshallable, Byteable {
>[0m[31m23:27:45,539 ERROR [stderr] (ServerService Thread Pool -- 58)                                                               ^
>[0m[31m23:27:45,539 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol: class LongValue
>[0m[31m23:27:45,540 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:58: error: cannot find symbol
>[0m[31m23:27:45,540 ERROR [stderr] (ServerService Thread Pool -- 58)   public void copyFrom(LongValue from) {
>[0m[31m23:27:45,540 ERROR [stderr] (ServerService Thread Pool -- 58)                        ^
>[0m[31m23:27:45,540 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   class LongValue
>[0m[31m23:27:45,540 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Native
>[0m[31m23:27:45,560 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:19: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,560 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,560 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,561 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:24: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,561 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,561 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,562 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:29: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,562 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,562 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,562 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:34: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,562 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,562 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,563 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:39: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,563 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,563 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,565 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:47: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,565 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,565 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,566 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:52: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,566 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,566 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,568 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:74: error: cannot find symbol
>[0m[31m23:27:45,568 ERROR [stderr] (ServerService Thread Pool -- 58)     if (!(obj instanceof LongValue)) return false;
>[0m[31m23:27:45,568 ERROR [stderr] (ServerService Thread Pool -- 58)                          ^
>[0m[31m23:27:45,568 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   class LongValue
>[0m[31m23:27:45,568 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Native
>[0m[31m23:27:45,568 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:75: error: cannot find symbol
>[0m[31m23:27:45,568 ERROR [stderr] (ServerService Thread Pool -- 58)     LongValue other = (LongValue) obj;
>[0m[31m23:27:45,569 ERROR [stderr] (ServerService Thread Pool -- 58)     ^
>[0m[31m23:27:45,569 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   class LongValue
>[0m[31m23:27:45,569 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Native
>[0m[31m23:27:45,569 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:75: error: cannot find symbol
>[0m[31m23:27:45,569 ERROR [stderr] (ServerService Thread Pool -- 58)     LongValue other = (LongValue) obj;
>[0m[31m23:27:45,569 ERROR [stderr] (ServerService Thread Pool -- 58)                        ^
>[0m[31m23:27:45,569 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   class LongValue
>[0m[31m23:27:45,569 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Native
>[0m[31m23:27:45,584 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:14: error: cannot find symbol
>[0m[31m23:27:45,584 ERROR [stderr] (ServerService Thread Pool -- 58) public class LongValue$$Native implements LongValue, Copyable<LongValue>, BytesMarshallable, Byteable {
>[0m[31m23:27:45,585 ERROR [stderr] (ServerService Thread Pool -- 58)                                           ^
>[0m[31m23:27:45,585 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol: class LongValue
>[0m[31m23:27:45,585 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:14: error: cannot find symbol
>[0m[31m23:27:45,585 ERROR [stderr] (ServerService Thread Pool -- 58) public class LongValue$$Native implements LongValue, Copyable<LongValue>, BytesMarshallable, Byteable {
>[0m[31m23:27:45,585 ERROR [stderr] (ServerService Thread Pool -- 58)                                                               ^
>[0m[31m23:27:45,585 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol: class LongValue
>[0m[31m23:27:45,586 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:58: error: cannot find symbol
>[0m[31m23:27:45,586 ERROR [stderr] (ServerService Thread Pool -- 58)   public void copyFrom(LongValue from) {
>[0m[31m23:27:45,586 ERROR [stderr] (ServerService Thread Pool -- 58)                        ^
>[0m[31m23:27:45,586 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   class LongValue
>[0m[31m23:27:45,586 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Native
>[0m[31m23:27:45,604 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:19: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,604 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,604 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,605 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:24: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,605 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,605 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,606 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:29: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,606 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,606 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,606 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:34: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,606 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,606 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,607 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:39: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,607 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,607 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,608 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:47: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,608 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,608 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,609 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:52: error: method does not override or implement a method from a supertype
>[0m[31m23:27:45,609 ERROR [stderr] (ServerService Thread Pool -- 58)   @Override
>[0m[31m23:27:45,609 ERROR [stderr] (ServerService Thread Pool -- 58)   ^
>[0m[31m23:27:45,611 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:74: error: cannot find symbol
>[0m[31m23:27:45,611 ERROR [stderr] (ServerService Thread Pool -- 58)     if (!(obj instanceof LongValue)) return false;
>[0m[31m23:27:45,611 ERROR [stderr] (ServerService Thread Pool -- 58)                          ^
>[0m[31m23:27:45,611 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   class LongValue
>[0m[31m23:27:45,611 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Native
>[0m[31m23:27:45,611 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:75: error: cannot find symbol
>[0m[31m23:27:45,612 ERROR [stderr] (ServerService Thread Pool -- 58)     LongValue other = (LongValue) obj;
>[0m[31m23:27:45,612 ERROR [stderr] (ServerService Thread Pool -- 58)     ^
>[0m[31m23:27:45,612 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   class LongValue
>[0m[31m23:27:45,612 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Native
>[0m[31m23:27:45,612 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Native.java:75: error: cannot find symbol
>[0m[31m23:27:45,612 ERROR [stderr] (ServerService Thread Pool -- 58)     LongValue other = (LongValue) obj;
>[0m[31m23:27:45,612 ERROR [stderr] (ServerService Thread Pool -- 58)                        ^
>[0m[31m23:27:45,612 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   class LongValue
>[0m[31m23:27:45,612 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Native
>[0m[31m23:27:45,688 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Heap.java:12: error: cannot find symbol
>[0m[31m23:27:45,688 ERROR [stderr] (ServerService Thread Pool -- 58) import net.openhft.chronicle.core.Jvm;
>[0m[31m23:27:45,688 ERROR [stderr] (ServerService Thread Pool -- 58)                                  ^
>[0m[31m23:27:45,688 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   class Jvm
>[0m[31m23:27:45,688 ERROR [stderr] (ServerService Thread Pool -- 58)   location: package net.openhft.chronicle.core
>[0m[31m23:27:45,698 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Heap.java:21: error: cannot find symbol
>[0m[31m23:27:45,698 ERROR [stderr] (ServerService Thread Pool -- 58)       Field theUnsafe = Jvm.getField(Unsafe.class, "theUnsafe");
>[0m[31m23:27:45,698 ERROR [stderr] (ServerService Thread Pool -- 58)                         ^
>[0m[31m23:27:45,699 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   variable Jvm
>[0m[31m23:27:45,699 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Heap
>[0m[31m23:27:45,701 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Heap.java:37: error: cannot find symbol
>[0m[31m23:27:45,701 ERROR [stderr] (ServerService Thread Pool -- 58)     return UNSAFE.getLongVolatile(this, valueOffset);
>[0m[31m23:27:45,701 ERROR [stderr] (ServerService Thread Pool -- 58)                                         ^
>[0m[31m23:27:45,701 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   variable valueOffset
>[0m[31m23:27:45,701 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Heap
>[0m[31m23:27:45,703 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Heap.java:47: error: cannot find symbol
>[0m[31m23:27:45,703 ERROR [stderr] (ServerService Thread Pool -- 58)     UNSAFE.putOrderedLong(this, valueOffset, _value);
>[0m[31m23:27:45,703 ERROR [stderr] (ServerService Thread Pool -- 58)                                 ^
>[0m[31m23:27:45,703 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   variable valueOffset
>[0m[31m23:27:45,704 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Heap
>[0m[31m23:27:45,705 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Heap.java:59: error: cannot find symbol
>[0m[31m23:27:45,706 ERROR [stderr] (ServerService Thread Pool -- 58)     return UNSAFE.getAndAddLong(this, valueOffset, addition) + addition;
>[0m[31m23:27:45,706 ERROR [stderr] (ServerService Thread Pool -- 58)                                       ^
>[0m[31m23:27:45,706 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   variable valueOffset
>[0m[31m23:27:45,706 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Heap
>[0m[31m23:27:45,708 ERROR [stderr] (ServerService Thread Pool -- 58) /net/openhft/chronicle/core/values/LongValue$$Heap.java:64: error: cannot find symbol
>[0m[31m23:27:45,708 ERROR [stderr] (ServerService Thread Pool -- 58)     return UNSAFE.compareAndSwapLong(this, valueOffset, oldValue, newValue);
>[0m[31m23:27:45,708 ERROR [stderr] (ServerService Thread Pool -- 58)                                            ^
>[0m[31m23:27:45,708 ERROR [stderr] (ServerService Thread Pool -- 58)   symbol:   variable valueOffset
>[0m[31m23:27:45,708 ERROR [stderr] (ServerService Thread Pool -- 58)   location: class net.openhft.chronicle.core.values.LongValue$$Heap
>[0m[31m23:27:45,731 ERROR [stderr] (ServerService Thread Pool -- 58) net.openhft.chronicle.bytes.IORuntimeException: net.openhft.chronicle.bytes.IORuntimeException: net.openhft.chronicle.bytes.IORuntimeException: net.openhft.chronicle.values.ImplGenerationFailedException: java.lang.ClassNotFoundException: net.openhft.chronicle.core.values.LongValue$$Heap from [Module "deployment.wildfly.war:main" from Service Module Loader]
>[0m[31m23:27:45,732 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.wire.TextWire$TextValueIn.typedMarshallable(TextWire.java:2120)
>[0m[31m23:27:45,732 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.map.ChronicleMapBuilder.openWithExistingFile(ChronicleMapBuilder.java:1598)
>[0m[31m23:27:45,732 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.map.ChronicleMapBuilder.createWithFile(ChronicleMapBuilder.java:1444)
>[0m[31m23:27:45,732 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.map.ChronicleMapBuilder.createPersistedTo(ChronicleMapBuilder.java:1405)
>[0m[31m23:27:45,732 ERROR [stderr] (ServerService Thread Pool -- 58) 	at test.MyMap.<init>(MyMap.java:21)
>[0m[31m23:27:45,733 ERROR [stderr] (ServerService Thread Pool -- 58) 	at test.MySingleton.init(MySingleton.java:20)
>[0m[31m23:27:45,733 ERROR [stderr] (ServerService Thread Pool -- 58) 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
>[0m[31m23:27:45,733 ERROR [stderr] (ServerService Thread Pool -- 58) 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
>[0m[31m23:27:45,733 ERROR [stderr] (ServerService Thread Pool -- 58) 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
>[0m[31m23:27:45,733 ERROR [stderr] (ServerService Thread Pool -- 58) 	at java.lang.reflect.Method.invoke(Method.java:497)
>[0m[31m23:27:45,733 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
>[0m[31m23:27:45,733 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,733 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:114)
>[0m[31m23:27:45,734 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:103)
>[0m[31m23:27:45,734 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,734 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:437)
>[0m[31m23:27:45,734 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
>[0m[31m23:27:45,734 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:83)
>[0m[31m23:27:45,734 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,734 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
>[0m[31m23:27:45,734 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,735 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
>[0m[31m23:27:45,735 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,735 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
>[0m[31m23:27:45,735 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,735 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.weld.ejb.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:100)
>[0m[31m23:27:45,736 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,736 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
>[0m[31m23:27:45,736 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,736 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:275)
>[0m[31m23:27:45,736 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:349)
>[0m[31m23:27:45,736 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:66)
>[0m[31m23:27:45,736 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,736 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
>[0m[31m23:27:45,737 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,737 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
>[0m[31m23:27:45,737 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,737 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
>[0m[31m23:27:45,737 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,737 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:64)
>[0m[31m23:27:45,737 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,738 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:356)
>[0m[31m23:27:45,738 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.PrivilegedWithCombinerInterceptor.processInvocation(PrivilegedWithCombinerInterceptor.java:80)
>[0m[31m23:27:45,738 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
>[0m[31m23:27:45,738 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:61)
>[0m[31m23:27:45,738 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:161)
>[0m[31m23:27:45,738 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:134)
>[0m[31m23:27:45,738 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
>[0m[31m23:27:45,738 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:124)
>[0m[31m23:27:45,739 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:138)
>[0m[31m23:27:45,739 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
>[0m[31m23:27:45,739 ERROR [stderr] (ServerService Thread Pool -- 58) 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
>[0m[31m23:27:45,739 ERROR [stderr] (ServerService Thread Pool -- 58) 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
>[0m[31m23:27:45,739 ERROR [stderr] (ServerService Thread Pool -- 58) 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
>[0m[31m23:27:45,739 ERROR [stderr] (ServerService Thread Pool -- 58) 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
>[0m[31m23:27:45,739 ERROR [stderr] (ServerService Thread Pool -- 58) 	at java.lang.Thread.run(Thread.java:745)
>[0m[31m23:27:45,740 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.threads.JBossThread.run(JBossThread.java:320)
>[0m[31m23:27:45,740 ERROR [stderr] (ServerService Thread Pool -- 58) Caused by: net.openhft.chronicle.bytes.IORuntimeException: net.openhft.chronicle.bytes.IORuntimeException: net.openhft.chronicle.values.ImplGenerationFailedException: java.lang.ClassNotFoundException: net.openhft.chronicle.core.values.LongValue$$Heap from [Module "deployment.wildfly.war:main" from Service Module Loader]
>[0m[31m23:27:45,740 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.wire.TextWire$TextValueIn.typedMarshallable(TextWire.java:2120)
>[0m[31m23:27:45,740 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.hash.impl.VanillaChronicleHash.readMarshallableFields(VanillaChronicleHash.java:241)
>[0m[31m23:27:45,740 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.map.VanillaChronicleMap.readMarshallableFields(VanillaChronicleMap.java:107)
>[0m[31m23:27:45,740 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.hash.impl.VanillaChronicleHash.readMarshallable(VanillaChronicleHash.java:225)
>[0m[31m23:27:45,741 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.wire.TextWire$TextValueIn.marshallable(TextWire.java:2018)
>[0m[31m23:27:45,741 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.wire.TextWire$TextValueIn.typedMarshallable(TextWire.java:2109)
>[0m[31m23:27:45,741 ERROR [stderr] (ServerService Thread Pool -- 58) 	... 56 more
>[0m[31m23:27:45,742 ERROR [stderr] (ServerService Thread Pool -- 58) Caused by: net.openhft.chronicle.bytes.IORuntimeException: net.openhft.chronicle.values.ImplGenerationFailedException: java.lang.ClassNotFoundException: net.openhft.chronicle.core.values.LongValue$$Heap from [Module "deployment.wildfly.war:main" from Service Module Loader]
>[0m[31m23:27:45,743 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.wire.TextWire$TextValueIn.typedMarshallable(TextWire.java:2120)
>[0m[31m23:27:45,744 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.hash.serialization.impl.BytesAsSizedReader.readMarshallable(BytesAsSizedReader.java:55)
>[0m[31m23:27:45,744 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.wire.TextWire$TextValueIn.marshallable(TextWire.java:2018)
>[0m[31m23:27:45,744 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.wire.TextWire$TextValueIn.typedMarshallable(TextWire.java:2109)
>[0m[31m23:27:45,744 ERROR [stderr] (ServerService Thread Pool -- 58) 	... 61 more
>[0m[31m23:27:45,745 ERROR [stderr] (ServerService Thread Pool -- 58) Caused by: net.openhft.chronicle.values.ImplGenerationFailedException: java.lang.ClassNotFoundException: net.openhft.chronicle.core.values.LongValue$$Heap from [Module "deployment.wildfly.war:main" from Service Module Loader]
>[0m[31m23:27:45,745 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.values.ValueModel.createClass(ValueModel.java:349)
>[0m[31m23:27:45,745 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.values.ValueModel.createHeapClass(ValueModel.java:326)
>[0m[31m23:27:45,745 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.values.ValueModel.heapClass(ValueModel.java:316)
>[0m[31m23:27:45,745 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.values.Values.heapClassFor(Values.java:67)
>[0m[31m23:27:45,745 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.hash.serialization.impl.ValueReader.initTransients(ValueReader.java:65)
>[0m[31m23:27:45,745 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.hash.serialization.impl.ValueReader.readMarshallable(ValueReader.java:109)
>[0m[31m23:27:45,746 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.wire.TextWire$TextValueIn.marshallable(TextWire.java:2018)
>[0m[31m23:27:45,746 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.wire.TextWire$TextValueIn.typedMarshallable(TextWire.java:2109)
>[0m[31m23:27:45,746 ERROR [stderr] (ServerService Thread Pool -- 58) 	... 64 more
>[0m[31m23:27:45,747 ERROR [stderr] (ServerService Thread Pool -- 58) Caused by: java.lang.ClassNotFoundException: net.openhft.chronicle.core.values.LongValue$$Heap from [Module "deployment.wildfly.war:main" from Service Module Loader]
>[0m[31m23:27:45,747 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.modules.ModuleClassLoader.findClass(ModuleClassLoader.java:198)
>[0m[31m23:27:45,747 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.modules.ConcurrentClassLoader.performLoadClassUnchecked(ConcurrentClassLoader.java:363)
>[0m[31m23:27:45,747 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.modules.ConcurrentClassLoader.performLoadClass(ConcurrentClassLoader.java:351)
>[0m[31m23:27:45,748 ERROR [stderr] (ServerService Thread Pool -- 58) 	at org.jboss.modules.ConcurrentClassLoader.loadClass(ConcurrentClassLoader.java:93)
>[0m[31m23:27:45,748 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.values.CachedCompiler.loadFromJava(CachedCompiler.java:88)
>[0m[31m23:27:45,748 ERROR [stderr] (ServerService Thread Pool -- 58) 	at net.openhft.chronicle.values.ValueModel.createClass(ValueModel.java:347)
>[0m[31m23:27:45,749 ERROR [stderr] (ServerService Thread Pool -- 58) 	... 71 more
