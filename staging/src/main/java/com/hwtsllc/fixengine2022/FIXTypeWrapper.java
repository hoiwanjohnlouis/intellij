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
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public abstract class FIXTypeWrapper implements LogStringVerbose {
    private FIXType fixValue;

    public void setFixType(FIXType fixType) {
        this.fixValue = fixType;
    }
    public String getFIXTypeName() {
        return fixValue.getFIXTypeName();
    }
    public int getFIXNumber() {
        return fixValue.getFIXNumber();
    }
    public String getFIXName() {
        return fixValue.getFIXName();
    }
    public String getFIXDescription() {
        return fixValue.getFIXDescription();
    }
    @Override
    public String toLogStringVerbose() {
        return this.getClass().getSimpleName()
                .concat("\n\tFIXTypeName[")
                .concat(getFIXTypeName())
                .concat("]")
                .concat("\n\tFIXNumber[")
                .concat(String.valueOf(getFIXNumber()))
                .concat("]")
                .concat("\n\tFIXName[")
                .concat(getFIXName())
                .concat("]")
                .concat("\n\tFIXDescription[")
                .concat(getFIXDescription())
                .concat("]");
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                .concat("=[")
                .concat(getFIXTypeName())
                .concat(",")
                .concat(String.valueOf(getFIXNumber()))
                .concat(",")
                .concat(getFIXName())
                .concat(",")
                .concat(getFIXDescription())
                .concat("]");
    }
}
