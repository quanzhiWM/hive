/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.metastore.events;

import java.util.List;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hive.metastore.IHMSHandler;
import org.apache.hadoop.hive.metastore.api.SQLForeignKey;

@InterfaceStability.Stable
@InterfaceAudience.Public
public class AddForeignKeyEvent extends ListenerEvent {
  private final List<SQLForeignKey> fks;

  public AddForeignKeyEvent(List<SQLForeignKey> fks, boolean status, IHMSHandler handler) {
    super(status, handler);
    this.fks = fks;
  }

  public List<SQLForeignKey> getForeignKeyCols() {
    return fks;
  }
}
