/*
 * Copyright (C) 2015 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.survey.android.logic;

import org.opendatakit.common.android.data.UserTable;
import org.opendatakit.common.android.views.ExecutorContext;
import org.opendatakit.common.android.views.ExecutorProcessor;
import org.opendatakit.database.service.KeyValueStoreEntry;
import org.opendatakit.database.service.OdkDbHandle;

import java.util.List;
import java.util.Map;

/**
 * @author mitchellsundt@gmail.com
 */
public class SurveyDataExecutorProcessor extends ExecutorProcessor {

  public SurveyDataExecutorProcessor(ExecutorContext context) {
    super(context);
  }

  @Override
  protected void extendQueryMetadata(OdkDbHandle dbHandle, List<KeyValueStoreEntry> entries,
      UserTable userTable, Map<String, Object> metadata) {
    // do nothing -- survey does not enhance the returned object
  }
}
