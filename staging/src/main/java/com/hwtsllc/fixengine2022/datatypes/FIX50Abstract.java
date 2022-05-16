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

import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

public abstract class FIX50Abstract implements LogVerboseString {
    private FIX50 fixValue;

    public void setFixType(FIX50 fixType) {
        this.fixValue = fixType;
    }
    public String toEnumNameString() {
        return fixValue.toEnumNameString();
    }
    public String toFIXIDString() {
        return String.valueOf(fixValue.toFIXIDString());
    }
    public String toFIXNameString() {
        return fixValue.toFIXNameString();
    }
    public String toFIXDescriptionString() {
        return fixValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tFIXTypeName[")
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tFIXNumber[")
                .concat(String.valueOf(toFIXIDString()))
                .concat("]")
                .concat("\n\tFIXName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tFIXDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                .concat("=[")
                .concat(toEnumNameString())
                .concat(",")
                .concat(String.valueOf(toFIXIDString()))
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
}