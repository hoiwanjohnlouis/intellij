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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

import java.util.Locale;

/**
 *
 *
 */
public class TagTypeAbstract implements LogStringVerbose, FixTagValuePairString {

    private FIXType fixType;
    private String dataValue;

    public void setFixType(FIXType fixType) {
        this.fixType = fixType;
    }
    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getFIXTypeName() {
        return fixType.getFIXTypeName();
    }
    public int getFIXNumber() {
        return fixType.getFIXNumber();
    }
    public String getFIXName() {
        return fixType.getFIXName();
    }
    public String getFIXDescription() {
        return fixType.getFIXDescription();
    }
    public String getDataValue() {
        return this.dataValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("=[")
                .append(getFIXTypeName())
                .append(",")
                .append(getFIXNumber())
                .append(",")
                .append(getFIXName())
                .append(",")
                .append(getFIXDescription())
                .append(",")
                .append(getDataValue())
                .append("]");
        return sb.toString();
    }
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tFIXTypeName[")
                .append(getFIXTypeName())
                .append("]")
                .append("\n\tFIXNumber[")
                .append(getFIXNumber())
                .append("]")
                .append("\n\tFIXName[")
                .append(getFIXName())
                .append("]")
                .append("\n\tFIXDescription[")
                .append(getFIXDescription())
                .append("]")
                .append("\n\tDataValue[")
                .append(getDataValue())
                .append("]");
        return sb.toString();
    }
    public String toFixTagValuePairString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFIXNumber())
                .append("=")
                .append(getDataValue());
        return sb.toString();
    }
}
