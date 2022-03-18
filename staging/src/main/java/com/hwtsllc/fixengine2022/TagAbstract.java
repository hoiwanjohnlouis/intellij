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
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public abstract class TagAbstract <T1> implements LogStringVerbose, FixTagValuePairString {
    private FIXType fixType;
    protected T1 dataValue;

    public void setFixType(FIXType fixType) {
        this.fixType = fixType;
    }
    public void setDataValue(T1 dataValue) {
        this.dataValue = dataValue;
    }

    public String getEnumName() {
        return fixType.getEnumName();
    }
    public String getAction() {
        return String.valueOf( fixType.getNumber() );
    }
    public String getName() {
        return fixType.getName();
    }
    public String getDescription() {
        return fixType.getDescription();
    }
    public T1 getDataValue() {
        return this.dataValue;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                .concat("=[")
                .concat(getEnumName())
                .concat(",")
                .concat(getAction())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
                .concat(",")
                .concat( String.valueOf(getDataValue()) )
                .concat("]");
    }
    public String toLogStringVerbose() {
        return this.getClass().getSimpleName()
                .concat("\n\tFIXTypeName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tFIXNumber[")
                .concat( getAction() )
                .concat("]")
                .concat("\n\tFIXName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tFIXDescription[")
                .concat(getDescription())
                .concat("]")
                .concat("\n\tDataValue[")
                .concat( String.valueOf(getDataValue()) )
                .concat("]");
    }
    public String toFixTagValuePairString() {
        return getAction()
                .concat("=")
                .concat( String.valueOf(getDataValue()) );
    }
}
