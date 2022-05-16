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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPegDiscretionScope;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  840 (same as 840, 846,)
 *  PegScope
 *  int
 *  <p>
 *  The scope of the peg
 *  <p></p>
 *  846
 *  DiscretionScope
 *  int
 *  <p>
 *  The scope of the discretion
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Local (Exchange, ECN, ATS)
 *  <p>    2 - National
 *  <p>    3 - Global
 *  <p>    4 - National excluding local
 */
public class Tag840EnuPegScope extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumPegDiscretionScope dataValue;

    public final static MyEnumPegDiscretionScope TESTA_ENU_PEG_SCOPE
            = MyEnumPegDiscretionScope.GLOBAL;
    public final static MyEnumPegDiscretionScope TESTB_ENU_PEG_SCOPE
            = MyEnumPegDiscretionScope.LOCAL;

    public Tag840EnuPegScope(MyEnumPegDiscretionScope dataValue) {
        setFixType(FIX44.FIX840_ENU_PEG_SCOPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag840EnuPegScope tagData;

        tagData = new Tag840EnuPegScope(TESTA_ENU_PEG_SCOPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag840EnuPegScope(TESTB_ENU_PEG_SCOPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
