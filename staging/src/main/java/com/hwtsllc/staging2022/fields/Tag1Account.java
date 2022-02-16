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

package com.hwtsllc.staging2022.fields;

import com.hwtsllc.staging2022.datatypes.FIXTag;
//import com.hwtechservicesllc.staging2022.datatypes.FieldType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag1Account {

    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FIXTag fixTag = FIXTag.ACCOUNT;
    private final String tag1AccountValue;

    public Tag1Account(final String tag1AccountValue) {
        this.tag1AccountValue = tag1AccountValue;
    }

    public String getTag1AccountValue() {
        return tag1AccountValue;
    }
    public String getTag1AccountDescription() {
        return fixTag.getFIXTagDescription();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
            .append(":[")
            .append(getTag1AccountValue())
            .append("]");
        return sb.toString();
    }

}
