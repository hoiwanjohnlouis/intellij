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

package com.hwtsllc.fixengine2022;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag0Temp {

    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FIXType fixType = FIXType.ACCOUNT;
    private final TagType tagType;
    private String dataValue;

    public Tag0Temp(String dataValue) {
        this.dataValue = dataValue;
        tagType = new TagType(this.fixType,this.dataValue);
    }

    public String getFIXName() {
        return fixType.getFIXName();
    }
    public int getFIXNumber() {
        return fixType.getFIXNumber();
    }
    public String getFIXDescription() {
        return fixType.getFIXDescription();
    }
    public String getDataValue() {
        return dataValue;
    }
    public String getLogStringVerbose() {
        return tagType.toLogStringVerbose();
    }
    public String getFixTagValuePairString() {
        return tagType.toFixTagValuePairString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("=[")
                .append(tagType.getDataValue())
                .append("]");
        return sb.toString();
    }
}
