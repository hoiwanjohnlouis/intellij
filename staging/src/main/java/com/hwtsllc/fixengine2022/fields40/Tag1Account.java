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

package com.hwtsllc.fixengine2022.fields40;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag1Account implements FixTagValuePairString, LogStringVerbose {
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FIXType fixType = FIXType.ACCOUNT;
    private final String dataValue;

    public Tag1Account(final String dataValue) {
        this.dataValue = dataValue;
    }

    public String getFIXTagName() {
        return fixType.getFIXName();
    }
    public int getFIXTagNumber() {
        return fixType.getFIXNumber();
    }
    public String getFIXTagDescription() {
        return fixType.getFIXDescription();
    }
    public String getDataValue() {
        return dataValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("=[")
                .append(getDataValue())
                .append("]");
        return sb.toString();
    }
    @Override
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tTagName[")
                .append(getFIXTagName())
                .append("]")
                .append("\n\tTagNumber[")
                .append(getFIXTagNumber())
                .append("]")
                .append("\n\tTagDescription[")
                .append(getFIXTagDescription())
                .append("]")
                .append("\n\tTagValue[")
                .append(getDataValue())
                .append("]");
        return sb.toString();
    }
    @Override
    public String toFixTagValuePairString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFIXTagNumber())
                .append("=")
                .append(getDataValue());
        return sb.toString();
    }
}
