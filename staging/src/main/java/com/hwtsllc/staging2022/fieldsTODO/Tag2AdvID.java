/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.staging2022.fieldsTODO;

import com.hwtsllc.staging2022.datatypes.FIXTag;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag2AdvID {
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FIXTag fixTag = FIXTag.ADV_ID;
    private final String tag2AdvIDValue;

    public Tag2AdvID(final String tag2AdvIDValue) {
        this.tag2AdvIDValue = tag2AdvIDValue;
    }

    public String getTag2AdvIDValue() {
        return tag2AdvIDValue;
    }
    public String getTag2AdvIDDescription() {
        return fixTag.getFIXTagDescription();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append(":[")
                .append(getTag2AdvIDDescription())
                .append("]");
        return sb.toString();
    }

}
