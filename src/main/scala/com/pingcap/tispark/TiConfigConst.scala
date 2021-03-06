/*
 * Copyright 2017 PingCAP, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pingcap.tispark


object TiConfigConst {
  val PD_ADDRESSES: String = "spark.tispark.pd.addresses"
  val GRPC_FRAME_SIZE: String = "spark.tispark.grpc.framesize"
  val GRPC_TIMEOUT: String = "spark.tispark.grpc.timeout_in_sec"
  val META_RELOAD_PERIOD: String = "spark.tispark.meta.reload_period_in_sec"
  val GRPC_RETRY_TIMES: String = "spark.tispark.grpc.retry.times"
  val INDEX_SCAN_BATCH_SIZE: String = "spark.tispark.index.scan_batch_size"
  val INDEX_SCAN_CONCURRENCY: String = "spark.tispark.index.scan_concurrency"
  val TABLE_SCAN_CONCURRENCY: String = "spark.tispark.table.scan_concurrency"
  val ALLOW_AGG_PUSHDOWN: String = "spark.tispark.plan.allow_agg_pushdown"
  val TABLE_SCAN_SPLIT_FACTOR: String = "spark.tispark.table.scan_split_factor"
  val TASK_PER_SPLIT: String = "spark.tispark.task_per_split"
  val PD_CLUSTER_ID: String = "spark.tispark.pd.clusterid"
  val REQUEST_COMMAND_PRIORITY: String = "spark.tispark.request.command.priority"
  val REQUEST_ISOLATION_LEVEL: String = "spark.tispark.request.isolation.level"
  val ALLOW_INDEX_DOUBLE_READ: String = "spark.tispark.plan.allow_index_double_read"
}
