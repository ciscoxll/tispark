## TiSparkR
A thin layer build for supporting R language with TiSpark

### Usage
1. Download TiSparkR source code and build a binary package. Install it to your local R library(e.g. via `R CMD INSTALL you-bin-package`)
2. Build or download TiSpark dependency jar `tispark-0.1.0-SNAPSHOT-jar-with-dependencies.jar` [here](https://github.com/pingcap/tispark).
3. `cd` to your Spark home directory, and run
```
./bin/sparkR --jars /where-ever-it-is/tispark-0.1.0-SNAPSHOT-jar-with-dependencies.jar
```
Note that you should replace the `TiSpark` jar path with your own.
4. Use as below in your R console:
```R
# import tisparkR library
> library(TiSparkR)
# create a TiContext instance
> ti <- createTiContext(spark)
# Map TiContext to database:tpch_test
> tidbMapDatabase(ti, "tpch_test")
# Run query
> customers <- sql("select * from customer")
# Show result
> head(customers)
  c_custkey             c_name                            c_address c_nationkey
1         1 Customer#000000001                    IVhzIApeRb ot,c,E          15
2         2 Customer#000000002       XSTf4,NCwDVaWNe6tEgvwfmRchLXak          13
3         3 Customer#000000003                         MG9kdTD2WBHm           1
4         4 Customer#000000004                          XxVSJsLAGtn           4
5         5 Customer#000000005         KvpyuHCplrB84WgAiGV6sYpZq7Tj           3
6         6 Customer#000000006 sKZz0CsnMD7mp4Xd0YrBvx,LREYKUWAh yVn          20
          c_phone c_acctbal c_mktsegment
1 25-989-741-2988    711.56     BUILDING
2 23-768-687-3665    121.65   AUTOMOBILE
3 11-719-748-3364   7498.12   AUTOMOBILE
4 14-128-190-5944   2866.83    MACHINERY
5 13-750-942-6364    794.47    HOUSEHOLD
6 30-114-968-4951   7638.57   AUTOMOBILE
                                                                                                 c_comment
1                                           to the even, regular platelets. regular, ironic epitaphs nag e
2                                          l accounts. blithely ironic theodolites integrate boldly: caref
3    deposits eat slyly ironic, even instructions. express foxes detect slyly. blithely even accounts abov
4                                                         requests. final, regular ideas sleep final accou
5                                                       n accounts will have to unwind. foxes cajole accor
6 tions. even deposits boost according to the slyly bold packages. final accounts cajole requests. furious


```
