Demo issue with `resources` directory not being accessible from the tests

REPL
```
com.my-company.cli.core> (hello "bob")
({:id "20210301000000-test", :up ["select 1\n"], :down [], :transactions nil})
```

Poly tests
```
desktop:~/resource-ws-issue$ poly test :cl
Projects to run tests from: command-line

Running tests from the command-line project, including 1 brick: cli

Testing com.my-company.cli.core-test

ERROR in (hello-test) (File.java:278)
expected: (= 1 (core/hello "bob"))
  actual: java.lang.NullPointerException: null
 at java.io.File.<init> (File.java:278)
    resauce.core$url_file.invoke (core.clj:23)
    resauce.core$eval633$fn__634.invoke (core.clj:47)
    clojure.lang.MultiFn.invoke (MultiFn.java:227)
    clojure.core$map$fn__4207.invoke (core.clj:2487)
    clojure.lang.LazySeq.sval (LazySeq.java:42)
    clojure.lang.LazySeq.seq (LazySeq.java:60)
    clojure.lang.RT.seq (RT.java:484)
    clojure.core$seq.invoke (core.clj:133)
    clojure.core$apply.invoke (core.clj:617)
    clojure.core$mapcat.doInvoke (core.clj:2514)
    clojure.lang.RestFn.invoke (RestFn.java:423)
    resauce.core$resource_dir.invoke (core.clj:72)
    resauce.core$resource_dir.invoke (core.clj:71)
    ragtime.jdbc$load_resources.invoke (jdbc.clj:157)
    com.my_company.cli.core$hello.invoke (core.clj:6)
    com.my_company.cli.core_test/fn (core_test.clj:6)
    clojure.test$test_var$fn__7145.invoke (test.clj:701)
    clojure.test$test_var.invoke (test.clj:701)
    clojure.test$test_all_vars$fn__7149$fn__7156.invoke (test.clj:717)
    clojure.test$default_fixture.invoke (test.clj:671)
    clojure.test$test_all_vars$fn__7149.invoke (test.clj:717)
    clojure.test$default_fixture.invoke (test.clj:671)
    clojure.test$test_all_vars.invoke (test.clj:713)
    clojure.test$test_ns.invoke (test.clj:736)
    clojure.core$map$fn__4207.invoke (core.clj:2487)
    clojure.lang.LazySeq.sval (LazySeq.java:42)
    clojure.lang.LazySeq.seq (LazySeq.java:60)
    clojure.lang.Cons.next (Cons.java:39)
    clojure.lang.RT.boundedLength (RT.java:1654)
    clojure.lang.RestFn.applyTo (RestFn.java:130)
    clojure.core$apply.invoke (core.clj:619)
    clojure.test$run_tests.doInvoke (test.clj:751)
    clojure.lang.RestFn.invoke (RestFn.java:408)
    clojure.core$eval801.invoke (NO_SOURCE_FILE:-1)
    clojure.lang.Compiler.eval (Compiler.java:6619)
    clojure.lang.Compiler.eval (Compiler.java:6609)
    clojure.lang.Compiler.eval (Compiler.java:6582)
    clojure.core$eval.invoke (core.clj:2852)
    clojure.core$eval3.invoke (NO_SOURCE_FILE:0)
    clojure.lang.Compiler.eval (Compiler.java:6619)
    clojure.lang.Compiler.eval (Compiler.java:6582)
    jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (NativeMethodAccessorImpl.java:-2)
    jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    java.lang.reflect.Method.invoke (Method.java:566)
    polylith.clj.core.common.class_loader$invoke_in_STAR_.invokeStatic (class_loader.clj:31)
    polylith.clj.core.common.class_loader$eval_in_STAR_$print_read_eval__233.invoke (class_loader.clj:46)
    polylith.clj.core.common.class_loader$eval_in_STAR_.invokeStatic (class_loader.clj:51)
    polylith.clj.core.common.class_loader$eval_in.invokeStatic (class_loader.clj:60)
    polylith.clj.core.common.interface$eval_in.invokeStatic (interface.clj:21)
    polylith.clj.core.test_runner.core$run_test_statements$fn__7213.invoke (core.clj:56)
    polylith.clj.core.test_runner.core$run_test_statements.invokeStatic (core.clj:56)
    polylith.clj.core.test_runner.core$run_tests_for_project.invokeStatic (core.clj:112)
    polylith.clj.core.test_runner.core$run.invokeStatic (core.clj:160)
    polylith.clj.core.test_runner.interface$run.invokeStatic (interface.clj:4)
    polylith.clj.core.command.test$run.invokeStatic (test.clj:7)
    polylith.clj.core.command.core$execute.invokeStatic (core.clj:74)
    polylith.clj.core.command.interface$execute_command.invokeStatic (interface.clj:4)
    polylith.clj.core.poly_cli.core$_main.invokeStatic (core.clj:31)
    polylith.clj.core.poly_cli.core$_main.doInvoke (core.clj:7)
    clojure.lang.RestFn.applyTo (RestFn.java:137)
    polylith.clj.core.poly_cli.core.main (:-1)

Ran 1 tests containing 1 assertions.
0 failures, 1 errors.

Test results: 0 passes, 0 failures, 1 errors.
```
